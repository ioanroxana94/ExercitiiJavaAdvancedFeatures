import java.io.*;
import java.nio.Buffer;

public class Main {
    public static void main(String[] args) {
        // sa se modeleze un parc auto
        // masinilor vor fi citite dintr-un fisier
        // In fisier o sa avem marca, modelul, culoarea, pretul, combustibil, data fabricarii ( cuvintele sa fie separate cu virgula)
        // 3 tipuri de masini:
        // nemtesti
        // frantuzesti
        // altele

        //O sa citim dintr-un fisier masinile
        //Daca masina este nemteasca le scriem intr-un fisier separat
        //La fel si pentru celelalte
        //Masinile au comportamente
        //Pot fi vandute in leazing (trebuie sa aiba cate un avans care scade din pretul total)
        //O sa putem sa luam numarul de rate si cat valoreaza
        //Masinile pot fi comparate (calitate)
        //Calitatea reprezentata de an de fabricatie
        //O masina o sa aiba un atribut vandut (un boolean)
        //Dupa ce setam campul pe true, masinile vandute o sa fie scrise intr-un alt fisier
        //La final o sa afisam toate masinile vandute
        //Masinile vandute o sa fie cele nemtesti de culoare neagra si combustibil benzina

        //Avem nevoie de o clasa masina
        //O sa contina marca model, culoare, pret, combustibil, data fabricare
        //O sa aiba un camp de vanzare (boolean)

        //Interfata pentru leazing (getRate + getValoare)
        //Implementam (Comparable) pentru a putea compara

        //O sa avem nevoie de un fisier de unde sa citim masinile
        //Cand le citim trebuie sa le punem pe categorii (le sortam)  - pe fisierul respectiv

        //Trecem inca odata prin masini (le mai citim odata din fisier) , vedem care sunt vandute sau nu si o sa mai adaugam un fisier cu masinile vandute si o sa le citim ( din fisierul al 5-lea le citim)


        try {
            String masiniInitiale = "D:\\Programare Java SDA\\Documente\\Fisiere Programare Exercitii\\MasiniInitial.txt";
            FileReader masiniInitialeReader = new FileReader(masiniInitiale);
            BufferedReader masiniInitialeBuffer = new BufferedReader(masiniInitialeReader);

            String masiniNemtesti = "D:\\Programare Java SDA\\Documente\\Fisiere Programare Exercitii\\MasiniNemtesti.txt";
            FileWriter masiniNemtestiWriter = new FileWriter(masiniNemtesti);
            BufferedWriter masiniNemtestiBuffer = new BufferedWriter(masiniNemtestiWriter);

            String masiniFrantuzesti = "D:\\Programare Java SDA\\Documente\\Fisiere Programare Exercitii\\MasiniFrantuzesti.txt";
            FileWriter masiniFrantuzestiWriter = new FileWriter(masiniFrantuzesti);
            BufferedWriter masiniFrantuzestiBuffer = new BufferedWriter(masiniFrantuzestiWriter);

            String masiniAltele = "D:\\Programare Java SDA\\Documente\\Fisiere Programare Exercitii\\MasiniAltele.txt";
            FileWriter masiniAlteleWriter = new FileWriter(masiniAltele);
            BufferedWriter masiniAlteleBuffer = new BufferedWriter(masiniAlteleWriter);

            String masiniVandute = "D:\\Programare Java SDA\\Documente\\Fisiere Programare Exercitii\\MasiniVandute.txt";
            FileWriter masiniVanduteWriter = new FileWriter(masiniVandute);
            BufferedWriter masiniVanduteBuffer = new BufferedWriter(masiniVanduteWriter);

            String text = masiniInitialeBuffer.readLine();
            while (text != null) {
                String[] split = text.split(",");
                Masina masina = new Masina(split[0], split[1], split[2], Integer.valueOf(3), split[4], Integer.valueOf(5));  //Facem obiectul masina (il instantiem) // Folosim Integer.valueOf(PARAMETRUL) pentru ca ne cere si int-uri
                System.out.println("Rata la masina " + masina.getMarca() + " este " + masina.payRate());

                //Aflam care masina este vanduta sau nu //Pentru fiecare masina sa verificam care este vanduta
                if (masina.getSold() == true) {
                    masiniVanduteBuffer.write(text); //Punem ca parametru obiectul din care am luat datele masinii
                    masiniVanduteBuffer.newLine();
                } else if (masina.getMarca().equals("bmw") || (masina.getMarca().equals("audi"))) {
                    masiniNemtestiBuffer.write(text);
                    masiniNemtestiBuffer.newLine();
                } else if (masina.getMarca().equals("renault")){
                    masiniFrantuzestiBuffer.write(text);
                    masiniFrantuzestiBuffer.newLine();
                }else if  (masina.getMarca().equals("skoda") || masina.getMarca().equals("ford") || masina.getMarca().equals("tesla")){
                    masiniAlteleBuffer.write(text);
                    masiniAlteleBuffer.newLine();
                }
                text = masiniInitialeBuffer.readLine();
            }


        masiniVanduteBuffer.flush();
        masiniVanduteBuffer.close();
        masiniNemtestiBuffer.flush();
        masiniNemtestiBuffer.close();
        masiniFrantuzestiBuffer.flush();
        masiniFrantuzestiBuffer.close();
        masiniAlteleBuffer.flush();
        masiniAlteleBuffer.close();


        } catch (IOException e){
            System.out.println("A aparut eroarea: " + e.getMessage());
        }

    }
}
