import java.util.ArrayList;

public abstract class Export {

    private ArrayList<Artikel> artikelListe;

    public Export(ArrayList<Artikel> artikelListe) {
        this.artikelListe = artikelListe;
    }

    public ArrayList<Artikel> getArtikelListe() {
        return artikelListe;
    }

    public abstract void export();
}
