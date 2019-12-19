package Package2;

import Package1.DefaultModifier;

public class Tester2 {
    public static void main(String[] args) {
        DefaultModifier defaultmodifier = new DefaultModifier();
        defaultmodifier.jumlah();
    }
}
/* method jumlah() tidak dapat diakses karena type default hanya dapat diakses oleh class yang berada dalam package yang sama */