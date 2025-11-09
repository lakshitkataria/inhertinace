interface GrandParent {
    default void message() {
        System.out.println("GrandParent message");
    }
}

interface Parent extends GrandParent {
    @Override
    default void message() {
        System.out.println("Parent message");
    }
}

class Child implements GrandParent, Parent {
}

public class Demo {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.message(); // This will print "Parent message"
    }
}
