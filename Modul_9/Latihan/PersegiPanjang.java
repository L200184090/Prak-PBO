public class PersegiPanjang extends MethodAbstract {
    int panjang = 10;
    int lebar = 5;

    public int luas() {
        return panjang * lebar;
    }

    public int keliling() {
        return 2 * (panjang + lebar);
    }
}
