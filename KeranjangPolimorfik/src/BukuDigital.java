public class BukuDigital extends Buku implements BisaDiunduh {
    private double ukuranMB;

    public BukuDigital(String judul, String penulis, int harga, double ukuranMB) {
        super(judul, penulis, harga);
        this.ukuranMB = ukuranMB;
    }

    @Override
    public int hargaAkhir() {
        return (int) (getHarga() * 0.80); // Diskon 20%
    }

    @Override
    public String keterangan() {
        // Format angka desimal untuk MB
        String strUkuran = (ukuranMB % 1 == 0) ? String.format("%.0f", ukuranMB) : String.valueOf(ukuranMB);
        return strUkuran + " MB, diskon 20%";
    }

    @Override
    public String linkUnduh() {
        String slug = getJudul().toLowerCase().replace(' ', '-');
        return "https://toko.buku/ebook/" + slug;
    }
}