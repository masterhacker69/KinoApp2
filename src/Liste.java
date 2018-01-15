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
        String searchChar = ";";

        String[] teile = zeile.split(searchChar);

        if(teile[0] == eingabe && teile[1] == eingabe1 && teile[2] == eingabe2 && teile[3] == eingabe3 && teile[4] == eingabe4) {
            zeileerstellen(zeile); }

                else {
            System.out.println("not found");
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
