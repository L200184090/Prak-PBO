package One;

public class Tester1 {
    public static void main(String[] args) {
        PublicModifier publicmodifier = new PublicModifier();
        publicmodifier.multiply();
        publicmodifier.add();
        publicmodifier.subtract();
        publicmodifier.divide();
        publicmodifier.average();
    }
}
/* multiply() method can be accessed by the entire class that call the PublicModifier */