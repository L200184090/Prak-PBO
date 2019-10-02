package Two;

import One.DefaultModifier;

public class Tester2 {
    public static void main(String[] args) {
        DefaultModifier defaultmodifier = new DefaultModifier();
        defaultmodifier.jumlah();
    }
}
/* jumlah() method can't be accessed because the default type is in a different package */