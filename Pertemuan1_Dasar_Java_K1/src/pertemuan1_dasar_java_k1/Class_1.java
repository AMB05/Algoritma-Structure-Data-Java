package pertemuan1_dasar_java_k1;


public class Class_1 {
    Interface_1 panggil2;

    public Class_1() {
        this.panggil2 = new Interface_1() {
            
            @Override
            public void satu() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
            @Override
            public void dua() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
    }
    
    void methode_1()
    {
        System.out.println("Data Diri");
    }
}
