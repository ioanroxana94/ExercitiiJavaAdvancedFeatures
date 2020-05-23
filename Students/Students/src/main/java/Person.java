public abstract class Person {

    protected String name; // punem ; pentru ca nu urmeaza nimic  // nu facem constructori pentru ca nu initializam
    protected String lastName;

    public String getName() { // Utilizam getter pentru a folosi atributele si in alte clase
        return name;
    }

    public String getLastName() {
        return lastName;
    }

}
