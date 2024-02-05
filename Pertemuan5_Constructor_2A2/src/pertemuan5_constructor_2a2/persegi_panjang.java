package pertemuan5_constructor_2a2;


public class persegi_panjang extends abstrak1
{
    private int p;
    private int l;
    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }
    

    @Override
    void luas() {
        System.out.println("luas = " + p*l);
    }
}
