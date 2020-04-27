class mhs {
 
    String nama = "Achmad Arief Saputra ";

 
    public static void main(String[] args) {
        mhs Arief = new mhs();
        System.out.println(Arief.nama);
        Arief.setNama("Arief");
        String namaBaru = Arief.getNama();
        System.out.println(namaBaru);
    }
   
    // setter = void
    void setNama(String parameterNama) {
        nama = parameterNama;
    }
 
    // getter = return
    String getNama() {
        return nama;
    }
}