public class Kubus extends BangunRuang {
    int sisi = 5;

    public int Volume() {
        return sisi * sisi * sisi;
    }

    public int LuasPermukaan() {
        return 6 * (sisi * sisi);
    }
}
