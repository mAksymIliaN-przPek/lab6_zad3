public class Main {
    public static void main(String[] args) {
        Klient klient = new Klient("Zbigniew", "Kotys");
        Podrecznik podrecznik = new Podrecznik("Matematyka dla opornych", "Adam Małysz", 2021, "Matematyka");
        Powiesc powiesc = new Powiesc("Wiedźmin", "Andrzej Sapkowski", 1998, "Fantasy");

        Ksiegarnia ksiegarnia1 = new Ksiegarnia(klient, podrecznik);
        Ksiegarnia ksiegarnia2 = new Ksiegarnia(klient, powiesc);

        System.out.println("Księgarnia 1:");
        ksiegarnia1.wyswietlInformacje();
        System.out.println("\nKsięgarnia 2:");
        ksiegarnia2.wyswietlInformacje();

        // Przykład rzutowania
        Ksiazka ksiazka1 = new Podrecznik("Biologia w ekonomii", "Ewelina Kłoda", 2021, "Biologia");
        Ksiazka ksiazka2 = new Powiesc("Hobbit", "Tolkien", 1939, "Fantasy");

        if (ksiazka1 instanceof Podrecznik) {
            Podrecznik podrecznik1 = (Podrecznik) ksiazka1;
            System.out.println("\nInformacje o podręczniku 1:");
            podrecznik1.wyswietlInformacje();
        }

        if (ksiazka2 instanceof Powiesc) {
            Powiesc powiesc1 = (Powiesc) ksiazka2;
            System.out.println("\nInformacje o powieści 1:");
            powiesc1.wyswietlInformacje();
        }
    }
}