package structuraldesignpatterns.adapterdesignpatternpart2.adapter;

import structuraldesignpatterns.adapterdesignpatternpart2.adaptee.OldCoffeeMachine;
import structuraldesignpatterns.adapterdesignpatternpart2.targetinterface.CoffeeMachineInterface;

public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {
    private OldCoffeeMachine coffeeMachine;

    public CoffeeTouchscreenAdapter(OldCoffeeMachine newCoffeeMachine){
        coffeeMachine = newCoffeeMachine;
    }
    @Override
    public void chooseFirstSelection() {
        coffeeMachine.selectA();
    }

    @Override
    public void chooseSecondSelection() {
        coffeeMachine.selectB();
    }
}
