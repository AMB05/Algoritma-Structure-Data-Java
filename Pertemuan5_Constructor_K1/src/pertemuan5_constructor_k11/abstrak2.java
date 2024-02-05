package pertemuan5_constructor_k11;
import java.util.Scanner;


public class abstrak2 extends abstrak1
{
    Scanner input = new Scanner(System.in);

    @Override
    void inputan() {
        System.out.println("Input bilangan 1 : ");
        int a = input.nextInt();
        System.out.println("Input bilangan 2 : ");
        int b = input.nextInt();
        
        abstrak2 panggil = new abstrak2(); //deklarasi
        panggil.hitung(a, b);
    }

    @Override
    void hitung(int a, int b) {
        int kali = (int) (a*b);
        int bagi = (int) (a/b);
        int plus = (int) (a+b);
        int minus = (int) (a-b);
        
        System.out.println("\nhasil Penjumlahan = " + plus);
        System.out.println("hasil Pengurangan= " + minus);
        System.out.println("hasil Perkalian = " + kali);
        System.out.println("hasil Pembagian = " + bagi);
    }
    
}
