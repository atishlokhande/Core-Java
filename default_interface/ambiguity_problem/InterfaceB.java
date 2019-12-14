package default_interface.ambiguity_problem;

public interface InterfaceB {
    default void display() {
        System.out.println("Hi....I am in InterfaceB..!!!!!!");
    }
}
