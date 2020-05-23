public class Porumbel extends Animal implements Ierbivore, Domestic{

    public String move(){
        return "Porumbelul zboara";
    }
    public String eat(){
        return "Porumbelul mananca iarba";
    }

    @Override
    public boolean pet() {
        return true;
    }
}
