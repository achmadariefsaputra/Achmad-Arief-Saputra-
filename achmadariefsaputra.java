public class Penjualan{

    private String nama;
    private int harga, jumlah, total;

    // Konstruktor Dengan Parameter
    public Penjualan(String _nama, int _harga, int _jumlah){
        nama  = _nama;
        harga = _harga;
        jumlah= _jumlah;
    }

 
    public int total(){
        total = harga * jumlah;
        return total;
    }
    
    // Method Untuk Menampilkan Rincian
    public void bayar(){
        System.out.println("Nama Barang : "+ nama);
        System.out.println("Harga Barang : "+ harga);
        System.out.println("Jumlah yang Dibeli : "+ jumlah);
        System.out.println("__________________________________");
        System.out.println("Total Harga : "+ total());
    }
    
    public static void main(String[]args){

        // Perintah untuk membuat objek
        Penjualan Roti= new Penjualan("Roti Bakar", 12000, 5);
        Roti.bayar();
    }

}

