package MoccaMaster.model;


/*
ChocolateDrink er en anden type drink.

Den kan have flødeskum.
*/

public class ChocolateDrink extends Drink {

    
    public ChocolateDrink(DrinkType type, Size size, boolean whippedCream){
        super(type, size, whippedCream);
    }


    public String prepare(){

        if (getWhippedCream()){
            return "Serveret " + getType() + getSize() + "with whipped cream";
        }
        else {
            return "Serveret " + getType() + getSize();
        }

    }

    /*
    STUDENT TASK:

    super
    Skriv en constructor der kalder super(...).
    */

    /*
    STUDENT TASK:

    Implementer prepare() metoden.
    */

    /*
    HER SKAL VÆRE EN IF

    Hvis drinken har flødeskum
    returneres en anden tekst.
    */

}