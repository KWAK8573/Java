public class Account {
    private long balance;
    public Account() {}
    public long getBalance() {
        return balance;
    }
    public void deposit(int money) {
        balance += money;

    }
    public void withdraw(int money) throws MyException {
        if(balance >= money)
            balance -= money;
        else
            throw new MyException("잔고부족"+(money-balance));
        
    }
}
