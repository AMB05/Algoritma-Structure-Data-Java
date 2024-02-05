package pertemuan5_constructor_2a1;


public class Persegi extends abstrak1
{
    private float sisi;

    public float getSisi() {
        return sisi;
    }

    public void setSisi(float sisi) {
        this.sisi = sisi;
    }

      
    @Override
    int perhitungan() {
        return (int) (sisi*sisi);
        
    }
    
}
