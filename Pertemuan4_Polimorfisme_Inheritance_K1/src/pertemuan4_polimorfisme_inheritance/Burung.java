package pertemuan4_polimorfisme_inheritance;


public class Burung extends enemy                                      // class anak dari induk class enemy, berupa class burung
{
    void fly ()                                                        //method
    {
        System.out.println("Attack 3.3 = Burung Aja");                 //tampilan dalam method fly
        merpati panggil = new merpati();
        panggil.walk();
    }
    
}
