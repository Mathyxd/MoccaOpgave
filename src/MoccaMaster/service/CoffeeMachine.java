package MoccaMaster.service;
import MoccaMaster.model.*;


/*
CoffeeMachine laver drinks.

Denne klasse indeholder logikken
til at oprette de rigtige objekter.
*/

import MoccaMaster.model.DrinkType;
import MoccaMaster.model.Size;

public class CoffeeMachine {

    public Cup serve(DrinkType type, Size size, boolean whippedCream){
        Drink drink;

        if (type == DrinkType.CHOCOLATE_DRINK){
            drink = new ChocolateDrink(type, size, whippedCream);


        } else (CoffeeDrink){
            drink = new CoffeeDrink(type, size, whippedCream);
        }
        return new Cup(drink);


    }

    /*
    STUDENT TASK:

    Skriv metoden serve()

    Metoden skal:
    - modtage DrinkType
    - modtage Size
    - modtage boolean cream
    */

    /*
    HER SKAL VÆRE EN IF

    Hvis typen er en chokoladedrik
    oprettes ChocolateDrink.
    */

    /*
    ELSE

    Ellers oprettes CoffeeDrink.
    */

    /*
    STUDENT TASK:

    Returner en Cup med drinken.
    */

}