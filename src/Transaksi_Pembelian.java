public class Transaksi_Pembelian {
    String kodeTransaksi,namaPembeli,tanggalPembelian;
    int qty;
    Barang brg;
    Transaksi_Pembelian(String kodeTransaksi,String namaPembeli,String tanggalPembelian,int qty,Barang brg){
        this.kodeTransaksi=kodeTransaksi;
        this.namaPembeli=namaPembeli;
        this.tanggalPembelian=tanggalPembelian;
        this.qty=qty;
        this.brg = brg;
    }
    void tampilDataTransaksi(){
        System.out.printf("|%-14s |%-12s |%-17s |%-11s |%-9s |%-6d|\n",kodeTransaksi,namaPembeli
        , tanggalPembelian,brg.nama,brg.stok,brg.harga);
    }
}
