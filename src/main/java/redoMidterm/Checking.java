package redoMidterm;

public class Checking extends Account{
public Checking(){
    super();
}

    @Override
    public AccountType getAccountType() {
        return AccountType.Checking;
    }
}
