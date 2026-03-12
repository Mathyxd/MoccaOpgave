package MoccaMaster.model;


/*
Dette er en abstrakt klasse.

Det betyder:
- man kan ikke lave new Drink()
- den bruges som superklasse

Andre klasser skal arve fra denne klasse.
*/

public abstract class Drink {

    private DrinkType type;
    private Size size;
    private boolean whippedCream;

    public Drink(DrinkType type, Size size, boolean whippedCream) {
        this.type = type;
        this.size = size;
        this.whippedCream = whippedCream;
    }

public DrinkType getType() {
        return type;
}

public Size getSize() {
        return size;
}
public boolean getWhippedCream() {
        return whippedCream;
}
public void setType() {
        this.type = type;
}
public void setSize() {
        this.size = size;
}
public void setWhippedCream() {
        this.whippedCream = whippedCream;
}

public abstract void prepare();
/*
    STUDENT TASK:

    Opret private variabler:

    - DrinkType type
    - Size size
    - boolean whippedCream
    */

    /*
    STUDENT TASK:

    Skriv en constructor der modtager:
    - DrinkType
    - Size
    - boolean

    Gem værdierne i variablerne.
    */

    /*
    STUDENT TASK:

    Skriv getter metoder for variablerne.
    */

    /*
    Abstrakt metode.

    Alle subklasser SKAL implement  ere denne metode.
    */

}