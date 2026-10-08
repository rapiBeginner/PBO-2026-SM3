package TugasJS3;

public class Kontainer {

    private String nomorResi, namaPemilik;
    private double kapasitasMaksimal, beratMuatanSaatIni;

    Kontainer(String nomorResi, String namaPemilik,
            double kapasitasMaksimal) {
        this.nomorResi = nomorResi;
        this.namaPemilik = namaPemilik;
        this.kapasitasMaksimal = kapasitasMaksimal;
        this.beratMuatanSaatIni = 0;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public double getKapasitasMaksimal() {
        return kapasitasMaksimal;
    }

    public double getBeratMuatanSaatIni() {
        return beratMuatanSaatIni;
    }

    public void tambahMuatan(double muatan) {
        if (muatan + beratMuatanSaatIni > kapasitasMaksimal) {
            System.out.println
        ("Maaf, berat muatan melebihi "
                    + "kapasitas maksimal kontainer");
        } else {
            beratMuatanSaatIni += muatan;
        }
    }

    public void turunkanMuatan(double muatan) {
        if (muatan > beratMuatanSaatIni) {
            beratMuatanSaatIni = 0;
        } else if(muatan>(beratMuatanSaatIni/2)){
            System.out.println("Maaf, demi\n" +
"keselamatan, pembongkaran muatan satu kali "
 + "jalan tidak boleh melebihi 50% dari muatan\n" +
"saat ini!");
        }
        else {
            beratMuatanSaatIni -= muatan;
        }
    }

}
