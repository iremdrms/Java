public class AccountTest {
    public static void main(String[] args) {

        Account accountObj = new Account();
        accountObj.displayAccount();

        accountObj.setUserName("Irem");
        accountObj.setBalance(1250);
        accountObj.deposit(1500);
        accountObj.paraÇek(689);

        System.out.println(accountObj.getUserName()+"\n" + accountObj.getBalance());
    }
}
