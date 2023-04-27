class Ksiegarnia {
    Klient klient;
    Ksiazka ksiazka;

    Ksiegarnia(Klient klient, Ksiazka ksiazka) {
        this.klient = klient;
        this.ksiazka = ksiazka;
    }

    void wyswietlInformacje() {
        System.out.println("Informacje o kliencie:");
        klient.wyswietlInformacje();
        System.out.println("\nInformacje o książce:");
        ksiazka.wyswietlInformacje();
    }
}