package pertemuan5_constructor_2a1;
import java.util.Scanner;


public class Pertemuan5_Constructor_2A1 {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
//        Construktor1 panggil = new Construktor1();
        
        Persegi panggil2 = new Persegi();
        
        System.out.println("Input Sisi : ");
        float a = input.nextFloat();
        
        panggil2.setSisi(a);
        
        System.out.println("\n" + panggil2.perhitungan());
    }
    
}
