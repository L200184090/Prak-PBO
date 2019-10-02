package One;

public class Tester {
    public static void main(String[] args) {
        ProtectedModifier protectedmodifier = new ProtectedModifier();
        protectedmodifier.printInfo();
        protectedmodifier.sendMessage();
    }
}
/* printInfo() & sendMessage() method can be accessed since they're in the same package */