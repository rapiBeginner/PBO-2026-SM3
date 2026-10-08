public class Buku {
    private String judul;
    private String pengarang;

    public Buku(String judul, String pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }

    public String getJudul() {
        return judul;
    }

    public void info() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
    }
}