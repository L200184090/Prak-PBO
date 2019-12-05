public class PrismaSegitiga extends BangunRuang {
    int alas = 5;
    int tinggi = 7;
    int tinggiPrisma = 10;

    public int Volume() {
        return ((1/2) * alas * tinggi) * tinggiPrisma;
    }

    public int LuasPermukaan() {
        return (2 * ((1/2) * alas * tinggi)) + (3 * (alas * tinggiPrisma));
    }
}
