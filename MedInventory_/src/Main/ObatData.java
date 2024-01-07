package Main;

public class ObatData {
    private String namaObat;
    private double harga;

    public ObatData(String namaObat, double harga) {
        this.namaObat = namaObat;
        this.harga = harga;
    }

    public String getNamaObat() {
        return namaObat;
    }

    public double getHarga() {
        return harga;
    }
}
