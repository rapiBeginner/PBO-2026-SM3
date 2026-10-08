package TugasJS3;

import java.util.Scanner;

public class TestLogistik {
    public static void main(String[] args) {
        Kontainer kontainerAlfa= new Kontainer("RFQ-9988","PT. Maju Bersama", 5000);
        Scanner sc = new Scanner(System.in);
        System.out.println("Nama Pemilik "
                + "Kontainer: "+kontainerAlfa.getNamaPemilik());
        System.out.println("Kapasitas"
                + " Maksimal: "+kontainerAlfa.getKapasitasMaksimal() + "kg");
        
        System.out.println("\nMasukkan muatan (kg) : ");
        kontainerAlfa.tambahMuatan(sc.nextDouble());
        System.out.println("Berat muatan saat "
                + "ini: "+kontainerAlfa.getBeratMuatanSaatIni() + " kg");
        
        System.out.println("\nMembongkar muat"
                + "/menurunkan barang seberat (kg) : ");
        kontainerAlfa.turunkanMuatan(sc.nextDouble());
        System.out.println("Berat muatan saat"
                + " ini: "+kontainerAlfa.getBeratMuatanSaatIni() + " kg");
    }
}
