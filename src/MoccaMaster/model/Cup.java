package MoccaMaster.model;


/*
Cup repræsenterer koppen der serveres.

Den indeholder en Drink.
*/

public class Cup {
    private Drink drink;

    public Cup(Drink drink) {
        this.drink = drink;
    }

    public Drink getDrink() {
        return drink;
    }

    public String describe() {
        return " | Drink: " + getDrink() +
                " | Size: " + drink.getSize();
    }
}

        /*boolean getWhippedCream = true;
        if (getWhippedCream){
            System.out.println("With Whipped Cream.");

    }

    }



    /*
    STUDENT TASK:

    Opret en variabel:
    Drink drink
    */
    /*
    STUDENT TASK:

    Skriv en constructor der modtager en Drink.
    */


    /*
    STUDENT TASK:

    Skriv en getter metode for drink.
    */

    /*
    STUDENT TASK:

    Skriv en metode describe().

    Metoden skal returnere en tekst
    der beskriver koppen.
    */

    /*
    HER SKAL VÆRE EN IF
    Hvis størrelse ikke er null.
    */

    /*
    HER SKAL VÆRE EN IF
    Hvis der er flødeskum.
    */


