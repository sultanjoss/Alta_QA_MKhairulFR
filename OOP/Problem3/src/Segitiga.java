public class Segitiga {
    int sisi1;
    int sisi2;
    int sisi3;
    int alas;
    int tinggi;

    public Segitiga(int sisi1, int sisi2, int sisi3, int alas, int tinggi) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
        this.alas = alas;
        this.tinggi = tinggi;
    }


    public void luasSegitiga() {
        int luasSegitiga = (alas * tinggi) / 2;
        System.out.println("Nilai luasnya adalah   :" + luasSegitiga);
    }

    public void kelilingSegitiga() {
        int kelilingSegitiga = sisi1 + sisi2 + sisi3;
        System.out.println("Nilai kelilingnya adalah  :" + kelilingSegitiga);

    }
}
