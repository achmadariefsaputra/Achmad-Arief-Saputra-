import java.util.Scanner;
public class scanner_angka {

       public static void main(String[] args) {
              // TODO Auto-generated method stub
            
              int nilai1, nilai2;
              double hasil;
            
              Scanner DataIn = new Scanner(System.in);
              System.out.print("Nilai Ujian Ke-1 : ");
              nilai1 = DataIn.nextInt();
            
              System.out.print("Nilai Ujian Ke-2 : ");
              nilai2 = DataIn.nextInt();
                       
              hasil = (nilai1+nilai2)/2;
            
              System.out.println("Nilai Rata-Rata      : " + hasil);
       }

}
