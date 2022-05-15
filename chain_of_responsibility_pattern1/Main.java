package chain_of_responsibility_pattern1;

public class Main {
    public static void main(String[] args) {

        OperatorA operatorA= new OperatorA();
        OperatorB operatorB= new OperatorB();
        OperatorC operatorC= new OperatorC();

        operatorA.nextOperator(operatorB);
        operatorB.nextOperator(operatorC);

        operatorA.receivedCall("01923456098");
        operatorA.receivedCall("01973456023");
        operatorA.receivedCall("01963456056");
        operatorA.receivedCall("01913456091");
    }

}
