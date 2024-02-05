package pertemuan3_methode_2a1;
import java.util.Scanner;

public class Access_Modifier {
    public int a = 3;  //Access public
    public float b = 4;
    
    private int jml_mobil; //access private
    private String nama_mobil;

    public int getJml_mobil() {
        System.out.println("jumlah mobil = " + jml_mobil);
        return jml_mobil;
    }

    public void setJml_mobil(int jml_mobil) {
        this.jml_mobil = jml_mobil;
    }

    public String getNama_mobil() {
        System.out.println("nama mobil =" + nama_mobil);
        return nama_mobil;
    }

    public void setNama_mobil(String nama_mobil) {
        this.nama_mobil = nama_mobil;
    }
    
    
    
    protected String jns_mobil; //access protected
    protected String katagori_mobil;
    
    
}
