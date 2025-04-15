public class Transaksi_Pembelian {
    String kodeTransaksi,namaPembeli,tanggalPembelian;
    int qty;
    Barang brg;
    Transaksi_Pembelian(String kodeTransaksi,String namaPembeli,String tanggalPembelian,int qty,Barang brg){
        this.kodeTransaksi=kodeTransaksi;
        this.namaPembeli=namaPembeli;
        this.tanggalPembelian=tanggalPembelian;
        this.qty=qty;
    }
}
