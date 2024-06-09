package structuraldesignpatterns.compositepattern.example;

public class Room implements IStructure {
    public String name;

    public Room(String name){
        this.name = name;
    }

    public void enter() {}
    public void exit() {}
    public void location() {}
    public String getName() {return this.name;}

}
