public class Balok {
    int panjang;

    int lebar;

    int tinggi;

    public Balok(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    public void volumeBalok() {
        int volumeBalok = panjang*lebar*tinggi;
        System.out.println("nilai volume balok adalah   :"  + volumeBalok);
    }
}
