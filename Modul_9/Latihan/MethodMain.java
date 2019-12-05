public class MethodMain {
    public static void main(String[] args) {
        Persegi psg = new Persegi();
        System.out.println("Keliling = " + psg.getKell());
        System.out.println("Luas = " + psg.getLuas());
        System.out.println("");
        PersegiPanjang psgpnjg = new PersegiPanjang();
        System.out.println("Keliling = " + psgpnjg.getKell());
        System.out.println("Luas = " + psgpnjg.getLuas());
        System.out.println("");
        JajarGenjang jjrgnjg = new JajarGenjang();
        System.out.println("Keliling = " + jjrgnjg.getKell());
        System.out.println("Luas = " + jjrgnjg.getLuas());
        System.out.println("");
        Lingkaran lngkrn = new Lingkaran();
        System.out.println("Keliling = " + lngkrn.getKell());
        System.out.println("Luas = " + lngkrn.getLuas());
        System.out.println("");
        Segitiga sgtg = new Segitiga();
        System.out.println("Keliling = " + sgtg.getKell());
        System.out.println("Luas = " + sgtg.getLuas());
    }
}
