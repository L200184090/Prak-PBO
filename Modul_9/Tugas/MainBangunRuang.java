public class MainBangunRuang {
    public static void main(String[] args) {
        Balok balok = new Balok();
        System.out.println("Volume : " + balok.Volume());
        System.out.println("Luas Permukaan : " + balok.LuasPermukaan());
        System.out.println("");
        Kubus kubus = new Kubus();
        System.out.println("Volume : " + kubus.Volume());
        System.out.println("Luas Permukaan : " + kubus.LuasPermukaan());
        System.out.println("");
        Bola bola = new Bola();
        System.out.println("Volume : " + bola.Volume());
        System.out.println("Luas Permukaan : " + bola.LuasPermukaan());
        System.out.println("");
        Kerucut kerucut = new Kerucut();
        System.out.println("Volume : " + kerucut.Volume());
        System.out.println("Luas Permukaan : " + kerucut.LuasPermukaan());
        System.out.println("");
        PrismaSegitiga prismaSegitiga = new PrismaSegitiga();
        System.out.println("Volume : " + prismaSegitiga.Volume());
        System.out.println("Luas Permukaan : " + prismaSegitiga.LuasPermukaan());
    }
}
