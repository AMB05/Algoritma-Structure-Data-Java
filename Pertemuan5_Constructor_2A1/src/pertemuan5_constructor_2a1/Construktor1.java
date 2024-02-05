package pertemuan5_constructor_2a1;
import java.util.Scanner;

public class Construktor1 {

    public Construktor1(int a, String b, double c) //konstruktor yang berparameter
    {
        System.out.println("Nama Kamu adalah = " + b);
        System.out.println("Umur Kamu adalah = " + a);
        System.out.println("Berat Badan kamu adalah = " + c);
    }


    public Construktor1() //konstruktor tanpa parameter
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input Nama Kamu : ");
        String nama = input.nextLine();
        System.out.println("Input Umur Kamu : ");
        int umur = input.nextInt();
        System.out.println("Input Berat Badan kamu : ");
        double bb = input.nextDouble();
        
        Construktor1 panggil = new Construktor1(umur, nama, bb);
    }

    

    
}
