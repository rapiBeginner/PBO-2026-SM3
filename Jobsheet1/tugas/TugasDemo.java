package tugas;

public class TugasDemo {
    public static void main(String[] args) {

        buku b = new buku();

        b.lebar = 15;
        b.panjang = 21;
        b.jumlahHalaman = 200;
        b.warnaCover = "Biru";
        b.berat = "500 gram";

        b.tampilInformasi();
        b.buka();
        b.dibaca();
        b.ditulisi();
        b.tutup();


        kacamata k = new kacamata();

        k.isPhotocromic = true;
        k.isFrameFlexible = true;
        k.warnaLensa = "Hitam";
        k.bahanFrame = "Aluminium";
        k.harga = 250000;

        k.tampilInformasi();
        k.pakai();
        k.bukaFrame();
        k.tutupFrame();
        k.lepas();

        kacamataMinus km = new kacamataMinus();

        km.isPhotocromic = true;
        km.isFrameFlexible = false;
        km.warnaLensa = "Transparan";
        km.bahanFrame = "Plastik";
        km.harga = 350000;
        km.nilaiMinus = 2.5;
        km.indexBias = 1.56;
        km.isSilinder = false;

        km.tampilInformasi();
        km.pakai();
        km.gantiLensa(3.0);
        km.perbaikiIndexBias(1.67);
        km.gantiSilinder();
        km.bukaFrame();
        km.tutupFrame();
        km.lepas();

        novel n = new novel();

        n.lebar = 14;
        n.panjang = 20;
        n.jumlahHalaman = 350;
        n.warnaCover = "Merah";
        n.berat = "400 gram";
        n.penerbit = "Gramedia";
        n.judul = "Laskar Pelangi";
        n.pengarang = "Andrea Hirata";
        n.tahunTerbit = "2005";

        n.tampilInformasi();
        n.buka();
        n.dibaca();
        n.dibacaSinopsis();
        n.cariDariDaftarisi();
        n.tandaiHalamanBaca(100);
        n.ditulisi();
        n.tutup();


        // ==========================================
        // 5. OBJECT SETRIKA
        // ==========================================
        setrika s = new setrika("Philips", 200);

        s.suhuMin = 0;

        s.tampilInformasi();
        s.nyalakan();
        s.naikkanSuhu(100);
        s.tampilInformasi();
        s.turunkanSuhu(30);
        s.tampilInformasi();
        s.matikan();


        // ==========================================
        // 6. OBJECT TUMBLER
        // ==========================================
        tumbler t = new tumbler(750, "Hitam", "Stainless Steel");

        t.tinggi = 25;
        t.isTermos = true;

        t.tampilInformasi();
        t.buka();
        t.diisiAir();
        t.tuangkanAir();
        t.tutup();
    }
}
