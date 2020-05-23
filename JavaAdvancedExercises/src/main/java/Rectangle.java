public class Rectangle extends Shape implements Calculable{

    public String draw(){
        return "Desenez un dreptunghi";
    }

    @Override
    public String perimeter() {
        return "Se calculeaza perimetrul dreptunghiului";
    }

    @Override
    public String arial() {
        return "Se calculeaza aria dreptunghiului";
    }
}
