public class Square extends Shape implements Calculable{

    public String draw(){
        return "Desenez un patrat";
    }

    @Override
    public String perimeter() {
        return "Se calculeaza perimetrul patratului";
    }

    @Override
    public String arial() {
        return "Se calculeaza aria patratului";
    }
}
