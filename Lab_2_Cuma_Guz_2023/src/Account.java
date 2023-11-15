public class Account {

    private String userName;
    private double balance;

    public Account()
    {

    }
    public Account (String userName,double balance)
    {
        this.userName=userName;
        this.balance=balance;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    //public void setMoney(int money) {
    //    this.money = money;
    //}

    //public int getMoney() {
    //   return money;
    //}
    public void deposit(double amount)
    {
        balance+=amount;
    }
    public void paraÇek(double amount)
    {
        balance-=amount;
    }
    public void displayAccount()
    {
        System.out.println("Username: "+getUserName());
        System.out.println("Balance: "+getBalance());
    }
}
