package Two;

import One.PublicModifier;

public class Tester2 {
    public static void main(String[] args) {
        PublicModifier publicmodifier = new PublicModifier();
        publicmodifier.multiply();
        publicmodifier.add();
        publicmodifier.subtract();
        publicmodifier.divide();
        publicmodifier.average();
    }
}
/* multiply() method can be accessed by the class that call the PublicModifier although it's in a different package */