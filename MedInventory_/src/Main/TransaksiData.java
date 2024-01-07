package Main;

public class TransaksiData {
    private int jumlahBarangKeluar;
    private int jumlahBarangMasuk;

    public TransaksiData(int jumlahBarangMasuk, int jumlahBarangKeluar) {
        this.jumlahBarangMasuk = jumlahBarangMasuk;
        this.jumlahBarangKeluar = jumlahBarangKeluar;
    }

    public int getJumlahBarangMasuk() {
        return jumlahBarangMasuk;
    }
    public int getJumlahBarangKeluar() {
        return jumlahBarangKeluar;
    }
}
