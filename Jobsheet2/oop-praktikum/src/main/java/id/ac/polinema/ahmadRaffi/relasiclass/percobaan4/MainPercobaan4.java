/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.polinema.ahmadRaffi.relasiclass.percobaan4;

/**
 *
 * @author Hp
 */
public class MainPercobaan4 {

    public static void main(String[] args) {
        Penumpang p = new Penumpang("12345", "Mr. Krab");
        Gerbong gerbong = new Gerbong("A", 10);
        gerbong.setPenumpang(p, 1);
        Penumpang b = new Penumpang("6789", "budi");
        gerbong.setPenumpang(b, 1);
        System.out.println(gerbong.info());

    }
}
