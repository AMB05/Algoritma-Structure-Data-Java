package pertemuan4_polimorfisme_inheritance_2a1;
import java.util.Scanner;

public class Kelas_Anak extends kelas_Induk
{
    Scanner input = new Scanner(System.in);
    
    void test ()                                                                                        //method test 
    {
        String jwb;                                                                                     //tipe data string
        int org;                                                                                        //tipe data integer
        System.out.println("");                                                                         //spasi
        System.out.println("Apakah Kamu Bertemu Banyak Orang? (y/t)");                                  //tampilan menanyakan bertemu orang untuk percabangan
        jwb=input.nextLine();                                                                           //inputan dengan tipe data string
        if (jwb.equalsIgnoreCase("y"))                                                                  //memulai percabangan jika jawab ya
        {
            System.out.println("Berapa Banyak Orang Yang Kamu Temui?");                                 //tampilan menanyakan banyak org di temui
            org=input.nextInt();                                                                        //input dengan tipe data integer
            if (org >= 5 && org <= 8)                                                                   //memulai percabangan dan juga menggunakan logika and
            {
                System.out.println("Hubungi Mereka dan Katakan Isolasi Mandiri");                       //tampilan percabangan
            }
            if (org >= 9 && org <= 15)                                                                  //percabangan dan juga menggunakan logika and
            {
                System.out.println("Hubungi Mereka dan Katakan Untuk TES COVID-19");                    //tampilan percabangan
            }
            if (org >= 16)                                                                              //percabangan jika lebih dari 16
            {
                System.out.println("Hubungi Mereka Semua Kalian Akan Kami ISOLASI");                    //tampilan percabangan
            }
        }
        else if (jwb.equalsIgnoreCase("t"))                                                             //memulai percabangan jika jawab tidak
        {
            System.out.println("Tetaplah Berada di Rumah!!!!!!!!!!");                                   //tampilan percabangan
        } 
    }
    
    void saran ()                                                                                       //method yang overiding
    {
        System.out.println("");                                                                         //spasi
        System.out.println("");                                                                         //spasi
        System.out.println("Call Center COVID-19");                                                     //tampilan method
        System.out.println("(021) 434343 atau +62 823 456 556");                                        //tampilan method
    }
}
