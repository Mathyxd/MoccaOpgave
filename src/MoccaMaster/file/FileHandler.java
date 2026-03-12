package MoccaMaster.file;

import java.io.*;
import java.util.ArrayList;
import MoccaMaster.model.Cup.*;
import MoccaMAster.model.Drink.*;

/*
FileHandler håndterer CSV filer.

Den læser og skriver data til filer.
*/

public class FileHandler {
    private static final String FILE_NAME; = "Drikkemaskine.csv";

    public ArrayList<Cup> loadCups() {

        ArrayList<Cup> cups = new ArrayList<>();

        try (BufferedReader reader =
                     new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                boolean whippedCream

            }
        }

    }





    /*
    STUDENT TASK:

    Skriv metoden writeOrders()

    Metoden skal modtage:
    - filename
    - ArrayList<Cup>
    */

    /*
    STUDENT TASK:

    Opret en PrintWriter til filen.
    */

    /*
    HER SKAL VÆRE ET LOOP

    Loop gennem alle cups
    og skriv en CSV linje til filen.
    */

    /*
    STUDENT TASK:

    Luk filen.
    */

    /*
    HER SKAL VÆRE EN TRY / CATCH

    Catch IOException.
    */

    /*
    STUDENT TASK:

    Send exception til ExceptionHandler.
    */

    /*
    STUDENT TASK:

    Skriv også en metode readOrders()
    der læser CSV filen.
    */

    /*
    HER SKAL VÆRE EN WHILE

    Læs linjer indtil filen slutter.
    */

}