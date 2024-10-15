import java.util.ArrayList;

public class CSV extends Export{


    public CSV(ArrayList<Artikel> artikelListe) {
        super(artikelListe);
    }

    @Override
    public void export() {

        System.out.println("Nummer;Bezeichnung;Einkaufspreis;Ablaufdatum;Kategorienummer");
        for (Artikel artikel : getArtikelListe())
        {
            System.out.println(artikel.getNummer() +";"+ artikel.getBezeichnung() +";"+
                    artikel.getEinkaufspreis() +";"+ artikel.getAblaufdatum() +";"+
                    artikel.getKategorienummer());
            System.out.println(" ");
        }
    }
}
