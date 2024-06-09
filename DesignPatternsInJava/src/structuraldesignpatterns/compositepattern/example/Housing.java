package structuraldesignpatterns.compositepattern.example;

import java.util.ArrayList;

public class Housing implements IStructure {
    private ArrayList<IStructure> structures;
    private String address;

    public Housing(String address) {
        this.structures = new ArrayList<IStructure>();
        this.address = address;
    }
    public String getName() {
        return this.address;
    }

    public int addStructure(IStructure component) {
        this.structures.add(component);
        return this.structures.size() - 1;
    }

    public IStructure getStructure(int componentNumber) {
        return this.structures.get(componentNumber);
    }

    public void location() {
        System.out.println("You are currently in " + this.getName() + ". It has ");
        for(IStructure structure : this.structures)
            System.out.println(structure.getName());
    }

    /* Print out when you enter and exit the building */
    public void enter() { }
    public void exit() { }
}

