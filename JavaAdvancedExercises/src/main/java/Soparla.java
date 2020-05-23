public class Soparla extends Animal implements Omnivore, Domestic{

    public String move(){
        return "Soparla se taraie";
    }
    public String eat(){
        return "Soparla mananca atat carne cat si iarba";
    }
    public boolean pet(){
        return true;
    }
}
