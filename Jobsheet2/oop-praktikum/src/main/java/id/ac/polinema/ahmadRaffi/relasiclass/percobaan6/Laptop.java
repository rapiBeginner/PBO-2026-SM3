/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.polinema.ahmadRaffi.relasiclass.percobaan6;

/**
 *
 * @author Hp
 */
public class Laptop {
    private String merk;

    public Laptop(String merk) {
        this.merk = merk;
    }

    public void cetakDokumen(Printer printer, String namaFile){
        System.out.println(merk + 
                " mengirim dokumen ke printer...");
        printer.cetak(namaFile);
    }
}
