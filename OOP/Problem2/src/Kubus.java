public class Kubus {
    int sisi1;

    int sisi2;
    int sisi3;


    public Kubus(int sisi1, int sisi2, int sisi3) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }
    public void volumeKubus(){
        int volumeKubus = sisi1*sisi2*sisi3;
        System.out.println("Luas kubus adalah   :"  +volumeKubus);
    }
}
