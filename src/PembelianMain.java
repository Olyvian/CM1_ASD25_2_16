public class PembelianMain {
    public static void main(String[] args) {
        Barang[] brg=new Barang[3];
        brg[0]=new Barang("a","Barang 1","Kategori 1",5,1000);
        brg[1]=new Barang("a","Barang 2","Kategori 2",10,2000);
        brg[2]=new Barang("a","Barang 3","Kategori 3",15,3000);
        System.out.println("|Kode Barang |Nama Barang |Stok Barang |Harga Barang |");
        for (Barang barang : brg) {
            barang.tampilDataBarang();
        }
    }
}
