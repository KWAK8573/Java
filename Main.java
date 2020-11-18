public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(5000000);
        System.out.println("현 잔액" + account.getBalance());
        try {
            account.withdraw(6000000);
        } catch (MyException e) {  
          System.out.println(e.getMessage());
        }
    }
    
}
