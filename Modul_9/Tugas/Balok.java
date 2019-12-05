public class Balok extends BangunRuang {
    int panjang = 7;
    int lebar = 5;
    int tinggi = 10;

    public int Volume() {
        return panjang * lebar * tinggi;
    }

    public int LuasPermukaan() {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }
}
