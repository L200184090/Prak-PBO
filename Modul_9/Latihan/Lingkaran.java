public class Lingkaran extends MethodAbstract {
    int pi = 22/7;
    int r = 7;

    public int luas() {
        return pi * r * r;
    }

    public int keliling() {
        return 2 * pi * r;
    }
}
