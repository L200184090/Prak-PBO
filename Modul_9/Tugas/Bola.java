public class Bola extends BangunRuang {
    int pi = 22/7;
    int r = 7;

    public int Volume() {
        return 4/3 * pi * (r * r * r);
    }

    public int LuasPermukaan() {
        return 4 * pi * (r * r);
    }
}
