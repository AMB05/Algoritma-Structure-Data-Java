package pertemuan5_constructor_2a2;


public abstract class abstrak1 
{
    abstract void luas();
    
    private int lebar;
    private int panjang;

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }
}
