import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Liste {

    public ArrayList<Filmeintrag> gesamtEinträge = new java.util.ArrayList<Filmeintrag>();

        public static void main (String[] args) throws IOException {
            Liste liste = new Liste();
        }

    public Liste() throws IOException {

        String zeile = null;

        Filter kategorien = new Filter();
        String eingabe = kategorien.suchparameter();
        String eingabe1 = kategorien.suchparameter1();
        String eingabe2 = kategorien.suchparameter2();
        String eingabe3 = kategorien.suchparameter3();
        String eingabe4 = kategorien.suchparameter4();

        BufferedReader brx = new BufferedReader(new FileReader("filmdaten.txt"));
        while(brx.ready()) {
            if((zeile = brx.readLine()) != null) {
                suche1(zeile, eingabe, eingabe1, eingabe2, eingabe3, eingabe4);
            }
        }
        for (Filmeintrag f : gesamtEinträge) {
            System.out.println("Name: " + f.name + " Genre: " + f.genre + " Kino" + f.kino + " Zeit:" + f.zeit + " Preis:" + f.preis);
        }
    }

    public void suche1 (String zeile, String eingabe, String eingabe1, String eingabe2, String eingabe3, String eingabe4) {
        String a = zeile;
        String c = ";";
        String b = a.substring(0, a.indexOf(c));
        if (b.contains(eingabe)) {
            if (a.contains(eingabe1)) {
                if (a.contains(eingabe2)) {
                    if (a.contains(eingabe3)) {
                        if (a.contains(eingabe4)) {
                            zeileerstellen(zeile);
                        }
                    }
                }
            }
        }
    }

    public void zeileerstellen (String zeile) {

        String[] filmeintragAttribute = zeile.split(";");

                Filmeintrag neuerFilmeintrag = new Filmeintrag();

        neuerFilmeintrag.name= filmeintragAttribute[0];
        neuerFilmeintrag.genre= filmeintragAttribute[1];
        neuerFilmeintrag.kino= filmeintragAttribute[2];
        neuerFilmeintrag.zeit= filmeintragAttribute[3];
        neuerFilmeintrag.preis= filmeintragAttribute[4];

        gesamtEinträge.add(neuerFilmeintrag);

    }
}
