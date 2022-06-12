
package design.pattern.observer.observer2.visitor.singleton.example.refactoring;

public class Main {
    public static void main(String[] args) {
        AccountType ac=new AccountType(true);
        Account a=new Account();
        a.set_type(ac);
        a.set_daysOverdrawn(10);
        System.out.println(a.overdraftCharge()+" "+a.bankCharge());
    }
}
