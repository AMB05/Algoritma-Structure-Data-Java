package pertemuan2_array_2a1;
import java.util.Arrays;
import java.util.Scanner;

public class Pertemuan2_Array_2A1 {
    
    void array1()
    {
        int a [];   //array 1 dimensi
        int b [][]; //array 2 dimensi
        
        String c [] = {"Honda", "BMW", "Hyundai"}; //array yang memiliki nilai
        
        float [] arrayAngka = {11,12,13,14,15,16,17,18,19,20};
        
        double [] d = new double[5]; //array yang bernilai 5 tapi belum diiisi value
        
        char e [] ={}; //array kosong
    }
    
    void array2()
    {
        Scanner input = new Scanner(System.in);
        
        String nilai [] = new String[5];
        
        System.out.println("Input Nama");
        nilai[0] = input.nextLine();
        System.out.println("Input prodi");
        nilai[1] = input.nextLine();
        System.out.println("Input alamat");
        nilai[2] = input.nextLine();
        System.out.println("Input fakultas");
        nilai[3] = input.nextLine();
        System.out.println("Input univ");
        nilai[4] = input.nextLine();
        
        System.out.println(nilai[4]);
        System.err.println(nilai[0]);
        
    }

    
    public static void main(String[] args) {
        Pertemuan2_Array_2A1 panggil = new Pertemuan2_Array_2A1();
        
        panggil.array2();
    }
    
}
