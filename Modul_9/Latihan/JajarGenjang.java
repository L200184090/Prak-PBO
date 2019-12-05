public class JajarGenjang extends MethodAbstract {
    int sisiAlas = 10;
    int sisiMiring = 7;
    int tinggi = 5;

    public int luas() {
        return sisiAlas * tinggi;
    }

    public int keliling() {
        return 2 * (sisiAlas + sisiMiring);
    }
}
