package chain_of_responsibility_pattern1;

public class OperatorC extends Operator{

    boolean isBusy= false;

    @Override
    public void receivedCall(String phoneNumber) {
        if(this.isBusy==false){
            System.out.println("Call from "+phoneNumber+" Received by OperatorC");
            isBusy=true;
        }
        else{
            System.out.println("Call from "+phoneNumber+" is now waiting for an operator.");
        }
    }
}
