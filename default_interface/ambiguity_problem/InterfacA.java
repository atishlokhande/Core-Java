package default_interface.ambiguity_problem;

public interface InterfacA {

    default void display() {
        System.out.println("Hi....I am in InterfaceA..!!!!!!");
    }
}
