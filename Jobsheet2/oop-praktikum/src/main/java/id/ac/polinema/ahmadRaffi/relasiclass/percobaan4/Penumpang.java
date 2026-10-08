/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.polinema.ahmadRaffi.relasiclass.percobaan4;
public class Penumpang {
    private String ktp;
    private String nama;
    
    public Penumpang(String ktp, String nama){
        this.ktp=ktp;
        this.nama=nama;
    }
    
    public String getKtp(){
        return ktp;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String info(){
        String info="";
        info+="Ktp: "+ktp+"\n";
        info+="Nama: "+nama+"\n";
        return info;
    }
    
    
}
