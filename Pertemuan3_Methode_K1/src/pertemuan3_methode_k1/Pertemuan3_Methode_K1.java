package pertemuan3_methode_k1;
import java.util.Scanner;

public class Pertemuan3_Methode_K1 {
    
    public void persegi ()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input Bilangan : ");
        int sisi = input.nextInt();
        
        int luas = sisi * sisi;
        
        System.out.println("\n Hasil Luas Persegi = " + luas);
    }

    
    public static void main(String[] args) {
        Pertemuan3_Methode_K1 panggil = new Pertemuan3_Methode_K1();
        
        panggil.persegi();
    }
    
}
