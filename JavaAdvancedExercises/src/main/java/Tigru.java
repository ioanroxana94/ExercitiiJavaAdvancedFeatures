public class Tigru extends Animal implements Carnivore, Wild{

    public String move(){
        return "Tigrul alearga";
    }
    public String eat(){
        return "Tigrul mananca carne";
    }

    @Override
    public boolean pet() {
        return false;
    }


}
