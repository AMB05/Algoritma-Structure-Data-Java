package pertemuan_2_array_list_4a1;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Pertemuan_2_Array_List_4A1 {
    
    void array_list()
    {
        //contoh penggunaan array dengan list
        ArrayList panggil2 = new ArrayList();
        panggil2.add("Burger");
        panggil2.add(5000);
        panggil2.add(3.12);
        panggil2.add(false);
        
        //menampilkan list
        System.out.println(panggil2);
        //menghapus isi dalam list
//        panggil2.remove(false);
//        
//        System.out.println(panggil2);
        //menambahkan
//        panggil2.add("kentang");
//        
//        System.out.println(panggil2);
        //menampilkan jumlah isi
//        System.out.println(panggil2.size());
        //mengambil nilai dalam list
        System.out.println(panggil2.get(1));
    }
    
    

    public static void main(String[] args) {
        
        //deklarasi class dengan variabel panggil
        Pertemuan_2_Array_List_4A1 panggil = new Pertemuan_2_Array_List_4A1();

        panggil.array_list();
        
        
        
        
        
        
        
        
        
        
        String[][]huruf = {
            {"A","B","C"},
            {"D","E","F"},
            {"G","H","I"} 
        };
        //Memanggil array
        System.out.println(huruf[1][1]);
        System.out.println(huruf[0][2]);
        System.out.println(huruf[2][2]);        
        
        
//        
//        panggil.Array_2(); //pemanggilan method array 2
        
        //contoh penulisan dan pemanggilan
        int contoh []  = {1,2,3,4,5};
        System.out.println(contoh[3]);
        System.out.println(contoh[1]);
        
        String objek [] ={} ;
        objek[0] = "Meja";
        objek[1] = "buku";
        objek[2] = "Kertas";
        objek[3] = "Pulpen";
        objek[4] = "handphone";
        System.out.println("Hasil Array objek 1 = "
                          + objek [1]);
    }
    
    void Array_2 () //method
    {
        Scanner input =  new Scanner(System.in);
        
        String [] contoh_2 = new String[4]; //array dengan tipe data string sebanyak 3 data
        
        System.out.println("Input nama :");
        contoh_2[0]=input.nextLine();
        System.out.println("Input prodi :");
        contoh_2[1]=input.nextLine();
        System.out.println("Input stambuk :");
        contoh_2[2]=input.nextLine();
        System.out.println("Input Keterangan :");
        contoh_2[3]=input.nextLine();
        
        //output nya
        System.out.println("nama saya " + contoh_2[0]);
        System.out.println("prodi " + contoh_2[1]);
        System.out.println("stambuk " + contoh_2[2]);
        System.out.println("Keterangan " + contoh_2[3]);
    }
}
