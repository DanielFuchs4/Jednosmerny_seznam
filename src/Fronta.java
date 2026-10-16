class Fronta {
    private Node head; // Začátek fronty (odsud obsluhujeme)
    private Node tail; // Konec fronty (sem přidáváme nové)
    private int pocet;

    public Fronta() {
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
        System.out.println("Uchazeč " + uchazec.getJmeno() + " byl úspěšně přidán do fronty.");
    }

    // 2. Obsloužení uchazeče (Dequeue - odebrání ze začátku seznamu)
    public Uchazec obslouzit() {
        if (head == null) {
            System.out.println("Fronta je prázdná, žádný uchazeč nečeká.");
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
            System.out.println("-> Fronta je prázdná.");
            return;
        }

        System.out.println("=== SEZNAM UCHAZEČŮ VE FRONTĚ (Celkem: " + pocet + ") ===");
        Node aktualni = head;
        int poradi = 1;
        while (aktualni != null) {
            System.out.println(poradi + ". " + aktualni.uchazec);
            aktualni = aktualni.next;
            poradi++;
        }
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


