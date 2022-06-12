
package design.pattern.observer.observer2.visitor.singleton.example.refactoring;

public class AccountType{
    boolean _type;
    
    public AccountType(boolean _type){
        this._type=_type;
    } 
    boolean isPremium() { 
        return this._type;
    }  
    
    double overdraftCharge(Account account) {
 if (isPremium()) {
 double result = 10;
 if (account.get_daysOverdrawn() > 7) result += (account.get_daysOverdrawn() - 7) * 0.85;
 return result;
 }
 else return account.get_daysOverdrawn() * 1.75;
    }
}
