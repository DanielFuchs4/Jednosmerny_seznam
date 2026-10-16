void main() {
    Scanner scanner = new Scanner(System.in);
    FrontaUchazecu fronta = new FrontaUchazecu();
    boolean bezi = true;

    while (bezi) {
        System.out.println("\n--- MENU ---");
        System.out.println("1. Příchod nového uchazeče");
        System.out.println("2. Obsloužení uchazeče");
        System.out.println("3. Výpis všech uchazečů ve frontě");
        System.out.println("4. Nahlédnutí na dalšího ve forontě");
        System.out.println("0. Ukončit program");

        System.out.println("-----");

        System.out.print("Zvolte možnost: ");
        int volba = scanner.nextInt();

        switch (volba) {
            case 1:
                System.out.print("Jméno uchazeče: ");
                String jmeno = scanner.nextLine();

                System.out.print("Dosažené vzdělání: ");
                String vzdelani = scanner.nextLine();

                System.out.print("Pozice (např. Junior programátor, Tester, ...): ");
                String pozice = scanner.nextLine();

                int vek = 0;
                while (true) {
                    try {
                        System.out.print("Věk uchazeče: ");
                        vek = Integer.parseInt(scanner.nextLine());
                        if (vek > 0) break;
                        System.out.println("Věk musí být kladné číslo.");
                    } catch (NumberFormatException e) {
                        System.out.println("Neplatný zadání, zadávejte pouze celé číslo.");
                    }
                }

                Uchazec novy = new Uchazec(jmeno, vzdelani, pozice, vek);
                fronta.pridat(novy);
                break;

            case 2:
                fronta.obslouzit();
                break;

            case 3:
                fronta.vypis();
                break;

            case 4:
                fronta.vypisDalsiho();
                break;

            case 0:
                bezi = false;
                System.out.println("Aplikace byla ukončena.");
                break;

            default:
                System.out.println("Neplatná volba, zkuste to znovu.");
                break;
        }
    }

}