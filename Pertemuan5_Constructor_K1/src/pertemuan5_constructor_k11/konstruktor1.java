package pertemuan5_constructor_k11;

import java.util.Scanner;


public class konstruktor1 
{
    public konstruktor1() 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input data int : ");
        int a = input.nextInt();
        System.out.println("Input data string : ");
//        input.next();
        String b = input.next();
        System.out.println("Input data double : ");
        double c = input.nextDouble();
        
        konstruktor1 panggil = new konstruktor1(a, b, c);
    }

    public konstruktor1(double e, double f) 
    {
        int kali = (int) (e*f);
        int bagi = (int) (e/f);
        int plus = (int) (e+f);
        int minus = (int) (e-f);
        
        System.out.println("\nhasil Penjumlahan = " + plus);
        System.out.println("hasil Pengurangan= " + minus);
        System.out.println("hasil Perkalian = " + kali);
        System.out.println("hasil Pembagian = " + bagi);
    }

    public konstruktor1(int a, String b, double c) 
    {
        System.out.println("data int = " + a);
        System.out.println("data string = " + b);
        System.out.println("data double = " + c);
    }
}
