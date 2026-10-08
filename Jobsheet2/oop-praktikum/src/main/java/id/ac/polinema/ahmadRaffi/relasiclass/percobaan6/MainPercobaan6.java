/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.polinema.ahmadRaffi.relasiclass.percobaan6;

/**
 *
 * @author Hp
 */
public class MainPercobaan6 {

    public static void main(String[] args) {
        Laptop laptop = new Laptop("Thinkpad");
        Printer printer = new Printer("Epson L3110");

        laptop.cetakDokumen(printer, "Laporan.pdf");
    }
}
