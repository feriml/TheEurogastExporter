import java.util.ArrayList;

public class JSON extends Export{

    public JSON(ArrayList<Artikel> artikelListe) {
        super(artikelListe);
    }

    @Override
    public void export() {
        System.out.println("[");
        for(Artikel artikel : getArtikelListe())
        {
            System.out.println(" {");
            System.out.println("Nummer: " + artikel.getNummer());
            System.out.println("Bezeichnung: " + artikel.getBezeichnung());
            System.out.println("Einkaufspreis: " + artikel.getEinkaufspreis());
            System.out.println("Ablaufdatum: " + artikel.getAblaufdatum());
            System.out.println("Kategorienummer: " + artikel.getKategorienummer());
            System.out.println(" }");
        }
        System.out.println("]");
    }


}
