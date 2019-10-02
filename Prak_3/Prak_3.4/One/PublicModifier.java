package One;

public class PublicModifier {
    public int a = 2;
    public int b = 5;
    public int c = 9;
    public void multiply() {
        int d = a*b*c;
        System.out.println("Hasil perkalian = " + d);
    }
    public void add() {
        int e = a+b+c;
        System.out.println("Hasil pertambahan = " + e);
    }
    public void subtract() {
        if (a>b & a>c) {
            int f = a-b-c;
            System.out.println("Hasil pengurangan = " + f);
        }
        else if(b>a & b>c) {
            int f = b-a-c;
            System.out.println("Hasil pengurangan = " + f);
        }
        else {
            int f = c-a-b;
            System.out.println("Hasil pengurangan = " + f);
        }
    }
    public void divide() {
        float g = (float) c/a;
        float h = (float) c/b;
        float i = (float) b/a;
        float j = (float) b/c;
        float k = (float) a/b;
        float l = (float) a/c;
        System.out.println("Hasil pembagian " + c + " dengan " + a + " = " + g);
        System.out.println("Hasil pembagian " + c + " dengan " + b + " = " + h);
        System.out.println("Hasil pembagian " + b + " dengan " + a + " = " + i);
        System.out.println("Hasil pembagian " + b + " dengan " + c + " = " + j);
        System.out.println("Hasil pembagian " + a + " dengan " + b + " = " + k);
        System.out.println("Hasil pembagian " + a + " dengan " + c + " = " + l);
    }
    public void average() {
        float m = (float) (a+b+c)/3;
        System.out.println("Hasil rata-rata = " + String.format("%.2f", m));
    }
}