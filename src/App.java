import java.time.LocalDate;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class App {

    public static void main(String[] args)
    {
        //zu verarbeitende Artikelliste kommt aus untenstehender Hilfsmethode:
        ArrayList<Artikel> al = artikellisteAusDBDummy();
        Export exporter;

        //Je nach Kommandozeilenparameter sollen verschiedene Exporte durchgeführt werden.
        //In Eclipse können diese Paramter gesetzt werden über (noch ist keiner gesetzt):
        //Über Run->Run Configurations -> Arguments -> Programm Arguments
        if(args.length>0)
        {
            String parameter = args[0];
            switch(parameter)
            {
                case "CSV":

                    exporter = new CSV(al);
                    exporter.export();
                    break;
                case "JSON":

                    exporter = new JSON(al);
                    exporter.export();
                    break;
                default:
                    //CSV-Export durchführen
                    break;
            }
        } else //kein Parameter, dann CSV-Export (Standard)
        {
            //CSV-Export
        }
    }

    /**
     * Diese Methode liefert eine Beispielliste mit Artikeln,
     * wie sie von der Export-Applikation verarbeitet werden soll.
     * Sp�ter wird diese Methode die Daten aus einer Datenbank holen.
     * Das ist aber nicht Teil des aktuellen JAVA Export Prototpyen.
     * @return Beispielliste, mit der gearbeitet werden soll.
     */
    public static ArrayList<Artikel> artikellisteAusDBDummy() {
        ArrayList<Artikel> liste = new ArrayList<>();
        liste.add(new Artikel("1","Sekt",90.23, LocalDate.of(2019,3,4),24));
        liste.add(new Artikel("2","Fanta",9.90,LocalDate.of(2019,11,1),23));
        liste.add(new Artikel("3","Cola",9.90,LocalDate.of(2019,1,12),23));
        liste.add(new Artikel("4","Beinschinken",12.23,LocalDate.of(2019,11,12),45));
        liste.add(new Artikel("5","Speck",5.23,LocalDate.of(2018,2,3),45));
        return liste;
    }
}
