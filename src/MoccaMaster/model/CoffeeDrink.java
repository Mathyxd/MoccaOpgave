package MoccaMaster.model;


/*
CoffeeDrink arver fra Drink.

Dette er et eksempel på arv (inheritance).
*/

public class CoffeeDrink extends Drink {
    super.whippedCream = false;

    public CoffeeDrink(DrinkType type, Size size, boolean whippedCream) {
        super(type, size);
        this.whippedCream = whippedCream;
    }

    @Override
    public String prepare() {
        return "Serveret: " + type + " " + size;
    }

    /*
    STUDENT TASK:

    Skriv en constructor.

    Constructoren skal kalde super(...) constructoren.
    */

    /*
    STUDENT TASK:

    Implementer prepare() metoden.

    Den skal returnere en tekst som beskriver
    hvilken kaffe der laves.
    */

}