interface GrandParent {
    default void message() {
        System.out.println("GrandParent message");
    }
}

interface Parent extends GrandParent {
    // This override is more specific
    @Override
    default void message() {
        System.out.println("Parent message");
    }
}

class Child implements GrandParent, Parent {
    // No override is needed here!
}

public class Demo {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.message(); // This will print "Parent message"
    }
}