/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.polinema.ahmadRaffi.relasiclass.percobaan6;

/**
 *
 * @author Hp
 */
public class Printer {

    private String merk;

    public Printer(String merk) {
        this.merk = merk;
    }

    public void cetak(String namaFile) {
        System.out.println("[" + merk + "] Mencetak " + namaFile + "...");
        System.out.println("[" + merk + "] Selesai.");
    }
}
