
package design.pattern.observer.observer2.visitor.singleton.example.refactoring;

public class Account {
    /*
    public Account(int _daysOverdrawn, AccountType _type){
        this._daysOverdrawn=_daysOverdrawn;
        this._type=_type;
    }*/
    public void set_type(AccountType _type){
        this._type=_type;
    }
    public AccountType get_type(){
        return this._type;
    }
    public void set_daysOverdrawn(int _daysOverdrawn){
        this._daysOverdrawn=_daysOverdrawn;
    }
    
    public int get_daysOverdrawn(){
        return this._daysOverdrawn;
    }  
    
    double overdraftCharge() {
 if (_type.isPremium()==true) {
 double result = 10;
 if (_daysOverdrawn > 7) result += (_daysOverdrawn - 7) * 
0.85;
 return result;
 }
 else return _daysOverdrawn * 1.75;
 }
 double bankCharge() {
 double result = 4.5;
 if (_daysOverdrawn > 0) result += overdraftCharge();
 return result;
 }
 private AccountType _type;
 private int _daysOverdrawn;
}