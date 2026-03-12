package MoccaMaster.ui;

import MoccaMaster.*;
import MoccaMaster.service.CoffeeMachine;
import MoccaMaster.util.CupSorter;
import MoccaMaster.file.FileHandler;

import java.util.ArrayList;
import java.util.Scanner;

/*
UI-klassen styrer programmet.

Den må IKKE:
- lave drinks
- læse filer
- sortere data

Den skal kun koordinere andre klasser.
*/

public class CoffeeMachineUI {


    /*
    STUDENT TASK:

    Opret en variabel af typen CoffeeMachine.
    */


    private ArrayList<Cup> cups = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void start(){


        /*
        STUDENT TASK:

        Opret en ArrayList som skal indeholde Cup objekter.
        */

        /*
        STUDENT TASK:

        Tilføj flere drinks til listen.
        Brug machine.serve(...)
        */

        /*
        STUDENT TASK:

        Kald sorteringsklassen som sorterer listen.
        */

        /*
        HER SKAL VÆRE ET LOOP

        Loop gennem alle cups i ArrayList
        og print en beskrivelse af dem.

        Hint:
        Det er et for-each loop.
        */

        /*
        STUDENT TASK:

        Gem listen til en CSV fil ved hjælp af FileHandler.
        */
    }
}