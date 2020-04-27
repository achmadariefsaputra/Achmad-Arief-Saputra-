public class Polimorphism {
 
   public static void main(String[ ] args) {
 
      cetakObyek(new polmain());
      cetakObyek(new kampus());
      cetakObyek(new masamy());
      cetakObyek(new Object());
   }
    
   public static void cetakObyek(Object obyek) {
      System.out.println(obyek);
   }
 
} // Akhir kelas Polimorphism
 
class polmain extends kampus {
   public String toString() {
      return "Kampus Polmain Terletak Di Kota Banyuwangi";
   }
}
 
class kampus extends masamy {
   public String toString() {
      return "Letaknya tidak jauh dari pusat kota ";
   }
}
 
class masamy extends Object {
   public String toString() {
      return "Akses menuju kesana sangatlah mudah";
   }
   }