package Package1;

public class Tester3 {
    public static void main(String[] args) {
        ProtectedModifier protectedmodifier = new ProtectedModifier();
        protectedmodifier.printInfo();
        protectedmodifier.sendMessage();
    }
}
/* method printInfo() & sendMessage() dapat diakses karena berada dalam class lain dan turunan dalam satu package */