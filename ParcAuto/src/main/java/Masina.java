public class Masina implements Comparable <Masina>, Leazing{
    private  String marca;
    private  String model;
    private  String culoare;
    private int pret;
    private String combustibil;
    private int fabricare;
    private boolean sold;

    public Masina(String marca, String model, String culoare, int pret, String consumabil, int fabricare){
        this.marca= marca;
        this.model= model;
        this.culoare= culoare;
        this.pret= pret;
        this.combustibil= consumabil;
        this.fabricare= fabricare;
    }

    public String getMarca(){
        if((this.marca.equals("audi") || this.marca.equals("bmw"))){


        }

        return marca;
    }
    public String getModel(){
        return model;
    }
    public String getCuloare(){
        return culoare;
    }
    public int getPret(){
        return pret;
    }
    public String getCombustibil(){
        return combustibil;
    }
    public int getFabricare(){
        return fabricare;
    }
    public int compareTo(Masina o){
        if (this.fabricare< o.getFabricare()){
            return -1;
        }else if (this.fabricare> o.getFabricare()){
            return 1;
        }
        return 0;
    }

    public int numberOfPays() {
        return 24;
    }

    public int payRate() {
        return this.pret/ numberOfPays();
    }
    public boolean getSold(){
        if((this.marca.equals("audi") || this.marca.equals("bmw")) && this.culoare.equals("negru") && this.combustibil.equals("benzina")){
            return sold= true;
        }else{
            return sold= false;
        }
    }
}
