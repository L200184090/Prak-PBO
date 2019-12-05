public class Segitiga extends MethodAbstract {
    int sisiAlas = 10;
    int sisiTinggi = 5;
    int sisiMiring1 = 8;
    int sisiMiring2 = 7;

    public int luas() {
        return (int) 0.5 * sisiAlas * sisiTinggi;
    }

    public int keliling() {
        return sisiAlas + sisiMiring1 + sisiMiring2;
    }
}
