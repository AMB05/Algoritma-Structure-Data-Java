package pertemuan1_dasar_java_k1;
import java.util.Scanner;


public class Pertemuan1_Dasar_Java_K1 {
//    Scanner input2 = new  Scanner(System.in);
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Class_1 panggil = new Class_1();
        
        panggil.methode_1();
        
        System.out.print("Input nama anda : ");
        String nama = input.nextLine();
        System.out.println("Nama saya adalah " + nama);
    }
    
}
