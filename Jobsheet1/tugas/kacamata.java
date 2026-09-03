package tugas;

public class kacamata {
    public boolean isPhotocromic;
    public String warnaLensa;
    public double harga;

    kacamata(boolean isPhotocromic, String warnaLensa, double harga){
        this.isPhotocromic=isPhotocromic;
        this.harga=harga;
        this.warnaLensa=warnaLensa;
    }

    public void pakai(){
        System.out.println("Kacamata dipakai");
    }

    public void lepas(){
        System.out.println("Kacamata dilepas");
    }
}
