class Podrecznik extends Ksiazka {
    String przedmiot;

    Podrecznik(String tytul, String autor, int rokWydania, String przedmiot) {
        super(tytul, autor, rokWydania);
        this.przedmiot = przedmiot;
    }

    @Override
    void wyswietlInformacje() {
        super.wyswietlInformacje();
        System.out.println("Przedmiot: " + przedmiot);
    }
}