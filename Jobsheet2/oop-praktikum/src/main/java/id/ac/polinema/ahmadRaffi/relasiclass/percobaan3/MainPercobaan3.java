/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.polinema.ahmadRaffi.relasiclass.percobaan3;

/**
 *
 * @author Hp
 */
public class MainPercobaan3 {
    public static void main(String[] args) {
        Pegawai masinis= new Pegawai("1234", "Spongebob Squarepants");
        Pegawai asisten= new Pegawai("4567", "Patricl Star");
        KeretaApi keretaApi = new KeretaApi("Gaya Baru", "Bisnis", masinis, asisten);
        System.out.println(keretaApi.info());
    }
}
