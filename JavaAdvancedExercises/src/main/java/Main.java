public class Main {
    public static void main(String[] args) {

        Circle cerc = new Circle();
        Rectangle dreptunghi = new Rectangle();
        Square patrat = new Square();

        System.out.println(cerc.draw());
        System.out.println(dreptunghi.draw());
        System.out.println(patrat.draw());

        System.out.println(cerc.perimeter());
        System.out.println(cerc.arial());
        System.out.println(dreptunghi.perimeter());
        System.out.println(dreptunghi.arial());
        System.out.println(patrat.perimeter());
        System.out.println(patrat.arial());


        Shape cerc1 = new Circle();
        Shape dreptunghi1 = new Rectangle();
        Shape patrat1 = new Square();

        System.out.println(cerc1.draw());
        System.out.println(dreptunghi1.draw());
        System.out.println(patrat1.draw());

        Calculable cerc2 = new Circle();
        Calculable dreptunghi2 = new Rectangle();
        Calculable patrat2 = new Square();

        System.out.println(cerc2.perimeter());
        System.out.println(cerc2.arial());
        System.out.println(dreptunghi2.perimeter());
        System.out.println(dreptunghi2.arial());
        System.out.println(patrat2.perimeter());
        System.out.println(patrat2.arial());

        //modelam animale
        //animale care zboara care alearga care se tarasc care innoata
        //porumbel, tigru, soparla, crocodil

        Porumbel porumbel = new Porumbel();
        Tigru tigru = new Tigru();
        Soparla soparla = new Soparla();
        Crocodil crocodil = new Crocodil();


        System.out.println(crocodil.pet());
        System.out.println(porumbel.move());
        System.out.println(tigru.move());
        System.out.println(soparla.move());
        System.out.println(crocodil.move());
        System.out.println(porumbel.sleep());
        System.out.println(tigru.sleep());
        System.out.println(soparla.sleep());
        System.out.println(crocodil.sleep());

        System.out.println(porumbel.eat());
        System.out.println(tigru.eat());
        System.out.println(soparla.eat());
        System.out.println(crocodil.eat());

        Animal porumbel2 = new Porumbel();
        Animal tigru2 = new Tigru();
        Animal soparla2 = new Soparla();
        Animal crocodil2 = new Crocodil();

        System.out.println(porumbel2.move());
        System.out.println(tigru2.move());
        System.out.println(soparla2.move());
        System.out.println(crocodil2.move());

        System.out.println(porumbel2.sleep());
        System.out.println(tigru2.sleep());
        System.out.println(soparla2.sleep());
        System.out.println(crocodil2.sleep());

        Ierbivore porumbel3 = new Porumbel();
        Carnivore tigru3 = new Tigru();
        Omnivore soparla3 = new Soparla();
        Carnivore crocodil3 = new Crocodil();

        System.out.println(porumbel3.eat());
        System.out.println(tigru3.eat());
        System.out.println(soparla3.eat());
        System.out.println(crocodil3.eat());

        Domestic porumbel4 = new Porumbel();
        Domestic soparla4 = new Soparla();
        Wild tigru4 = new Tigru();
        Wild crocodil4 = new Crocodil();

        System.out.println(porumbel4.pet());
        System.out.println(soparla4.pet());
        System.out.println(tigru4.pet());
        System.out.println(crocodil4.pet());




            }
        }




