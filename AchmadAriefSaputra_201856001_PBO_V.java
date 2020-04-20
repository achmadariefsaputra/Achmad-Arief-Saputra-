class N_matkul{
 public void Kom(){
  System.out.println("Pemrograman Berorientasi Objek");
 }
 public static void main(String [] args){
  Matkul ml;
  N_matkul nm;
 
  ml = new Matkul();
  nm = new N_matkul();

  
  ml.Kom();
  nm.Kom();
 }
}
class Matkul extends N_matkul{
 public void Kom(){
  System.out.println("Mata Kuliah");
 }
}