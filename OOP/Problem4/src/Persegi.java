public class Persegi {
    int sisi;

    public Persegi(int sisi) {
        this.sisi = sisi;
    }

    public void luasPersegi(){
        int luasPersegi = sisi*sisi;
        System.out.println("Nilai Luasnya adalah :  " + luasPersegi);
    }
    public void keliling(){
        int kelilingPersegi = 4*sisi;
        System.out.println("nilai kelilingnya adalah :" + kelilingPersegi);
    }
}
