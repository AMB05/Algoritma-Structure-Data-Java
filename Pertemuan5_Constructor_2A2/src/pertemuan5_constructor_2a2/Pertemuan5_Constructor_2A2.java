package pertemuan5_constructor_2a2;
import java.util.Scanner;


public class Pertemuan5_Constructor_2A2 {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
//        Constructor1 panggil = new Constructor1();
        
        persegi_panjang panggil2 = new persegi_panjang();
        
        System.out.println("Input Panjang = ");
        int a = input.nextInt();
        System.out.println("Input Lebar = ");
        int b = input.nextInt();
        
        panggil2.setL(a);
        panggil2.setP(b);
        System.out.println(""); //spasi
        panggil2.luas();
    }
    
}
