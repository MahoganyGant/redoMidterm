package redoMidterm;

public class Savings extends Account{
public Savings(){
    super();
}

    @Override
    public AccountType getAccountType() {
        return AccountType.Savings;
    }
}
