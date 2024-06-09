package structuraldesignpatterns.compositepattern.example;

public interface IStructure {
    void enter();
    void exit();
    void location();
    String getName();
}
