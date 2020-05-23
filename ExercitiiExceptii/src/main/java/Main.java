import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x=13;
        int y= 0;
        try {
            System.out.println("Rezultatul impartirii este: " + (x / y));
        }catch (ArithmeticException e){
            System.out.println("Incercati o operatie aritmetica imposibila " + e.getMessage()); // asa luamm mesajul de la exceptie ( acestea sunt predefinite)
        }

        int[] array= {1,2,3,4,5};

        try {
            System.out.println("Valoarea de pe pozitia 3 este: " + array[3]);
            System.out.println("Valoarea de pe pozitia 16 este: " + array[16]);
            System.out.println("Afisam rezultatul impartirii lui x la y " + (x/ y));
        }catch (ArrayIndexOutOfBoundsException e){   // Se afiseaza o exceptie specifica. Exceptiile se iau in ordinea lor
            System.out.println("A aparut o exceptie " + e.getMessage());
        }catch (Exception e){   // // Se afiseaza orice exceptie
            System.out.println("A aparut o exceptie specifica " + e.getMessage());
        }


        String text = null; // Acest obiect nu este instantiat, deci e null
        //Rulam ca sa vedem exceptia pe care ne-o da

        // if (text== null){
        //   throw new NullPointerException("Ai uitat sa instantiezi textul"); //O sa arunce o exceptie cu acest mesaj iar programul o sa se opreasca, nu o sa mearga mai departe.
        //   }

        try {
            System.out.println("Lungimea textului este " + text.length());
        }catch(NullPointerException e){
            System.out.println("Aveti grija ca nu ati instantiat obiectu " + e.getMessage());
        }

        String text1= "Tratam exceptii";
        System.out.println("Caracterul de la pozitia 8 este " + returneazaCaracter(text1) );

        String text2= "Tratam exceptii"; // Inainte era doar "Tratam"

        try {
            System.out.println("Caracterul de la pozitia 8 este " + returneazaCaracter(text2));
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("String-ul este mai muc decat pozitia cautata " + e.getMessage());
        }

        //Se introduce un numar de la tasataura.
        //Daca nr este par afisam un mesaj "Bravo! Ati ales un nr par"
        // Daca nr nu este par, vrem sa aruncam exceptie "OddNumberException"
        try{
            numar();
        }catch (OddNumberException e){
            System.out.println("Aveti grija ca ce numar introduceti" + e.getMessage()); // O sa ne dea mesajul pe care l-am instantiat in metoda de mai jos
        }

        //punem utilizatorul sa introduca un cuvant
        //daca cuvantul incepe cu o vocala, aruncam exceptia si o prindem VowelException
        //daca incepe cu o consoana afisam mesajul " Totul e ok"

        try{
            cuvant();
        }catch(VowelException e){
            System.out.println("Apare o exceptie " + e.getMessage());
        }


    }

    public static char returneazaCaracter(String text1) throws StringIndexOutOfBoundsException {  // le spunem sa aibe grija ca cine apeleaza metoda mea, ca e posibil sa primeasca aceasta exceptie si ca ar fi bine sa o trateze
        return text1.charAt(8);
    }

    public static void numar() throws OddNumberException { // Nu e nevoie de parametrii deoarece se scrie numar de la tastatura
        System.out.println("Va rog sa introduceti un numar de la tastatura");
        Scanner scan = new Scanner(System.in);
        int numar= scan.nextInt();
        System.out.println("Ati ales numarul " + numar);

        if (numar% 2== 0){
            System.out.println("Bravo! Ati ales un nr par");
        }else{
            throw new OddNumberException("Ati ales un numar impar");
        }
    }

    public static void cuvant() throws VowelException {  // Facem mai intai o clasa cu exceptia noastra
        System.out.println("Va rog sa introduceti un cuvant de la tastaura");
        Scanner scan= new Scanner(System.in);
        String cuvant= scan.nextLine();
        System.out.println("Ati introdus cuvantu " + cuvant);

        if (cuvant.startsWith("a") || cuvant.startsWith("e") || cuvant.startsWith("i") || cuvant.startsWith("o") || cuvant.startsWith("u")){
            throw new VowelException("cuvantul incepe cu o vocala");
        }else{
            System.out.println("Totul este ok");

        }
    }

}
