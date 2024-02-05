package pertemuan5_constructor_2a2;
import java.util.Scanner;


public class Constructor1 {

    public Constructor1() 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input nama kamu : ");
        String nama = input.nextLine();
        System.out.println("Input umur kamu : ");
        int umur = input.nextInt();
        System.out.println("Input timbangan kamu : ");
        float tb = input.nextFloat();
        
        Constructor1 panggil = new Constructor1(umur, nama, tb);
    }

    public Constructor1(int a, String b, float c) 
    {
        System.out.println("nama kamu adalah : " + b);
        System.out.println("umur kamu adalah : "+ a);
        System.out.println("Timbangan kamu adalah : " + c);
    }
    
}
