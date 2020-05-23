public class Crocodil extends Animal implements Carnivore, Wild{

    public String move(){
        return "Crocodilul innoata";
    }
    public String eat(){
        return "Crocodilul mananca carne";
    }

    @Override
    public boolean pet() {
        return false;
    }
}
