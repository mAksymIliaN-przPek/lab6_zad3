class Powiesc extends Ksiazka {
    String gatunek;

    Powiesc(String tytul, String autor, int rokWydania, String gatunek) {
        super(tytul, autor, rokWydania);
        this.gatunek = gatunek;
    }

    @Override
    void wyswietlInformacje() {
        super.wyswietlInformacje();
        System.out.println("Gatunek: " + gatunek);
    }
}