package pertemuan3_methode_2a1;
import java.util.Scanner;

public class Pertemuan3_Methode_2A1 {
       

    void method_1 ()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Perhitungan Luas Segitiga");
        System.out.println("-------------------------");
        System.out.println("Input Alas : ");
        int alas = input.nextInt();
        System.out.println("Input Tinggi : ");
        int tinggi = input.nextInt();
        
        float luas = (float) (0.5 *(alas*tinggi)); //proses
        
        System.out.println("\nHasil Luas Segitiga = " + luas + " cm");
    }
    
    void methode_2 ()
    {
        System.out.println("");
    }
    
    public static void main(String[] args) {
        Pertemuan3_Methode_2A1 panggil = new Pertemuan3_Methode_2A1(); //deklarasi class
        
        Access_Modifier panggil2 = new Access_Modifier();
        
        panggil2.setNama_mobil("Honda");
        panggil2.setJml_mobil(3);
        
//        panggil.method_1();
//        panggil.methode_2();
    }
    
}
