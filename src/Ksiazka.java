class Ksiazka {
    String tytul;
    String autor;
    int rokWydania;

    Ksiazka(String tytul, String autor, int rokWydania) {
        this.tytul = tytul;
        this.autor = autor;
        this.rokWydania = rokWydania;
    }

    void wyswietlInformacje() {
        System.out.println("Tytuł: " + tytul);
        System.out.println("Autor: " + autor);
        System.out.println("Rok wydania: " + rokWydania);
    }
}