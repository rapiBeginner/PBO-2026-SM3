/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.polinema.ahmadRaffi.relasiclass.percobaan5;

/**
 *
 * @author Hp
 */
public class Mobil {

    private String merek;
    private Mesin mesin;

    public Mobil(String merek,
            Mesin mesin) {
        this.merek = merek;
        this.mesin = mesin;
    }

    public Mobil(String merek) {
        this.merek = merek;
        this.mesin = new Mesin();
    }

    public void tampilInfo() {
        System.out.println("Mobil: " + merek);
        System.out.println("Mesin: " + mesin.getTipe());
    }
}
