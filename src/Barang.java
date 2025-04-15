public class Barang {
    String kodebarang,nama,kategori;
    int stok,harga;
    void tampilDataBarang(){
        System.out.printf("|%-5s | %-12s | %-6s | %-6s | %-13s |\n",kodebarang,nama
        ,stok,harga);    
    }
    
}
