/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.polinema.ahmadRaffi.relasiclass.percobaan5;

/**
 *
 * @author Hp
 */
public class MainPercobaan5 {
    public static void main(String[] args) {
        Mesin m= new Mesin();
        Mobil mobil = new Mobil("Avanza",m);
        mobil.tampilInfo();
    }
}
