package pertemuan3_method_2a2;
import java.util.Scanner;


public class Pertemuan3_Method_2A2 {
    
    void satu()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Program Perhitungan Bangun Ruang");
        System.out.println("--------------------------------");
        System.out.println("Input SISI = ");
        int sisi = input.nextInt();
        
        float Volume = sisi*sisi*sisi; //proses aritmatika
        
        System.out.println("\nVolume Kubus = " + Volume + " CM^3");
    }

    void dua ()
    {
        
    }
    
    public static void main(String[] args) {
        Pertemuan3_Method_2A2 panggil = new Pertemuan3_Method_2A2(); //deklarasi class untuk manggil method
        
        Access_Modifier panggil2 = new Access_Modifier();
        
        panggil2.setNama_mobil("Toyota");
        panggil2.getNama_mobil();
        System.out.println("");
        panggil2.setJml_mobil(3);
        panggil2.getJml_mobil();
        
//        panggil.satu(); //memanggil method
    }
    
}
