package chain_of_responsibility_pattern1;

public class OperatorB extends Operator{

    boolean isBusy= false;

    @Override
    public void receivedCall(String phoneNumber) {
        if(this.isBusy==false){
            System.out.println("Call from "+phoneNumber+" Received by OperatorB");
            isBusy=true;
        }
        else{
            operator.receivedCall(phoneNumber);
        }
    }
}
