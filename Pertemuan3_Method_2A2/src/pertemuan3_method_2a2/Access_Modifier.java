package pertemuan3_method_2a2;


public class Access_Modifier {
    
    public int a = 3;  //Access public
    public float b = 4;

    public int getJml_mobil() {
        System.out.println("Jumlah Mobil = " + jml_mobil);
        return jml_mobil;
    }

    public void setJml_mobil(int jml_mobil) {
        this.jml_mobil = jml_mobil;
    }

    public String getNama_mobil() {
        System.out.println("Nama Mobil = " + nama_mobil);
        return nama_mobil;
    }

    public void setNama_mobil(String nama_mobil) {
        this.nama_mobil = nama_mobil;
    }
    
    private int jml_mobil; //access private
    private String nama_mobil;
    
    protected String jns_mobil; //access protected
    protected String kategori_mobil;
    
}
