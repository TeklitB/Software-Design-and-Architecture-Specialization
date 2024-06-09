package structuraldesignpatterns.compositepattern.example;

public class Program {
    public static void main(String[] args) {

        Housing building = new Housing("123 street");
        Housing floor1 = new Housing("123 street - first floor");
        int firstFloor =building.addStructure(floor1);

        Room washroomlm = new Room("1F Men's washroom");
        Room washroomlw = new Room("1F Women's washroom");
        Room commom1 = new Room("1F common area");

        int firstMen = floor1.addStructure(washroomlm);
        int firstWomen = floor1.addStructure(washroomlw);
        int firstCommon = floor1.addStructure(commom1);

        building.enter(); // Enter the building
//        Housing currentFloor = building.getStructure(firstFloor);
//        currentFloor.enter(); // Walk into the first floor
//        Room currentRoom = currentFloor.getStructure(firstMen);
//        currentRoom.enter(); // Walk into the men's
//        currentRoom = currentFloor.getStructure(firstCommon);
//        currentRoom.enter(); // Walk into the common area
    }
}
