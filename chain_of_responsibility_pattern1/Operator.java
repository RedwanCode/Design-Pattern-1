package chain_of_responsibility_pattern1;

public abstract class Operator {
    Operator operator;

    public void nextOperator(Operator operator) {
        this.operator = operator;
    }

   abstract void receivedCall(String phoneNumber);

}
