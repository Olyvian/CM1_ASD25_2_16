public class Barang {
    String kodebarang,nama,kategori;
    int stok,harga;
    Barang(String kodebarang,String nama,String kategori,int stock,int harga){
        this.kodebarang=kodebarang;
        this.nama=nama;
        this.kategori=kategori;
        this.stok=stock;
        this.harga=harga;
    }
    void tampilDataBarang(){
        System.out.printf("|%-11s |%-11s |%-11s |%-11s |%-12s |\n",kodebarang,nama
        ,kategori,stok,harga);    
    }
    
}
