import java.util.Scanner;


class Node {
    Uchazec uchazec;
    Node next;

    public Node(Uchazec uchazec) {
        this.uchazec = uchazec;
        this.next = null;
    }
}

// 3. Implementace fronty pomocí jednosměrného seznamu (FIFO)
class FrontaUchazecu {
    private Node head; // Začátek fronty (odsud obsluhujeme)
    private Node tail; // Konec fronty (sem přidáváme nové)
    private int pocet;

    public FrontaUchazecu() {
        this.head = null;
        this.tail = null;
        this.pocet = 0;
    }

    // 1. Příchod nového uchazeče (Enqueue - přidání na konec seznamu)
    public void pridat(Uchazec uchazec) {
        Node novyUzel = new Node(uchazec);
        if (head == null) {
            head = novyUzel;
            tail = novyUzel;
        } else {
            tail.next = novyUzel;
            tail = novyUzel;
        }
        pocet++;
        System.out.println("Uchazeč " + uchazec.getJmeno() + " byl úspěšně zařazen do fronty.");
    }

    // 2. Obsloužení uchazeče (Dequeue - odebrání ze začátku seznamu)
    public Uchazec obslouzit() {
        if (head == null) {
            System.out.println("-> Fronta je prázdná, žádný uchazeč nečeká.");
            return null;
        }
        Uchazec obslouzeny = head.uchazec;
        head = head.next;

        // Pokud po odebrání ve frontě už nic nezbylo
        if (head == null) {
            tail = null;
        }
        pocet--;
        System.out.println("-> Obsluhován uchazeč: " + obslouzeny);
        return obslouzeny;
    }

    // 3. Výpis všech uchazečů ve frontě
    public void vypis() {
        if (head == null) {
            System.out.println("Fronta je momentálně prázdná.");
            return;
        }

        System.out.println("\n=== SEZNAM UCHAZEČŮ VE FRONTĚ (Celkem: " + pocet + ") ===");
        Node aktualni = head;
        int pořadí = 1;
        while (aktualni != null) {
            System.out.println(pořadí + ". " + aktualni.uchazec);
            aktualni = aktualni.next;
            pořadí++;
        }
        System.out.println("===================================================\n");
    }

    public void vypisDalsiho(){
        if (head == null) {
            System.out.println("Fronta je prázdná");
        } else if (head.next == null) {
            System.out.println("Nikdo další ve frontě není");
        } else {
            Node dalsi = head.next;
            System.out.println(dalsi.uchazec.getJmeno()+" | "+dalsi.uchazec.getPozice());
        }

    }
}
