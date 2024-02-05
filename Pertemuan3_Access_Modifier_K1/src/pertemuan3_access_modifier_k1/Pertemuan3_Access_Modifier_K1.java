package pertemuan3_access_modifier_k1;
import java.util.Scanner;

public class Pertemuan3_Access_Modifier_K1 {
    
    public int a = 3;  //Access public
    public float b = 4;
    
    private int jml_mobil; //access private
    private String nama_mobil;
    
    protected String jns_mobil; //access protected
    protected String katagori_mobil;

    public int getJml_mobil() {
        return jml_mobil;
    }

    public void setJml_mobil(int jml_mobil) {
        this.jml_mobil = jml_mobil;
    }

    public String getNama_mobil() {
        System.out.println(nama_mobil);
        return nama_mobil;
    }

    public void setNama_mobil(String nama_mobil) {
        this.nama_mobil = nama_mobil;
    }
    
       
    
    
    public static void main(String[] args) {
        Pertemuan3_Access_Modifier_K1 panggil = new Pertemuan3_Access_Modifier_K1();
        
        panggil.setNama_mobil("Toyota Supra");
        panggil.getNama_mobil();
    }

        
}
