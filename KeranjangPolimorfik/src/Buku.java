public abstract class Buku {
    private String judul;
    private String penulis;
    private int harga;

    public Buku(String judul, String penulis, int harga) {
        this.judul = judul;
        this.penulis = penulis;
        this.harga = harga;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getHarga() {
        return harga;
    }

    // Method abstract yang wajib diisi oleh subclass
    public abstract int hargaAkhir();
    public abstract String keterangan();

    protected String formatRupiah(int nominal) {
        return "Rp" + String.format("%,d", nominal).replace(',', '.');
    }

    // Method konkret di parent class (TIDAK di-override subclass)
    public void tampilkanInfo() {
        System.out.println(judul + " (" + penulis + ")");
        System.out.println("  Harga       : " + formatRupiah(harga));
        System.out.println("  Keterangan  : " + keterangan());
        System.out.println("  Harga akhir : " + formatRupiah(hargaAkhir()));
    }
}