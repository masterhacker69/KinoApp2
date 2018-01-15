import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Filter {

    public Filter() throws IOException {
    }

    public String suchparameter() throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Name: ");
        String eingabe = br.readLine();
        return eingabe;
    }

    public String suchparameter1() throws IOException {

        InputStreamReader isr1 = new InputStreamReader(System.in);
        BufferedReader br1 = new BufferedReader(isr1);
        System.out.print("Genre: ");
        String eingabe1 = br1.readLine();
        return eingabe1;
    }


    public String suchparameter2() throws IOException {

        InputStreamReader isr3 = new InputStreamReader(System.in);
        BufferedReader br2 = new BufferedReader(isr3);
        System.out.print("Kino: ");
        String eingabe2 = br2.readLine();
        return eingabe2;
    }

    public String suchparameter3() throws IOException {

        InputStreamReader isr4 = new InputStreamReader(System.in);
        BufferedReader br3 = new BufferedReader(isr4);
        System.out.print("Zeit: ");
        String eingabe3 = br3.readLine();
        return eingabe3;
    }

    public String suchparameter4() throws IOException {

        InputStreamReader isr5 = new InputStreamReader(System.in);
        BufferedReader br4 = new BufferedReader(isr5);
        System.out.print("Preis: ");
        String eingabe4 = br4.readLine();
        return eingabe4;

    }
}
