package kata;

import static kata.Amount.amountOf;
import static kata.DateCreator.date;

public class app {
    public static void main(String[] args) {
        Account account = new Account(new Statement());

        account.deposit(amountOf(200000), date("31/05/2021"));
        account.deposit(amountOf(350000), date("24/04/2021"));
        account.withdrawal(amountOf(150000), date("20/05/2021"));
        account.withdrawal(amountOf(100000), date("05/06/2021"));

        account.printStatement(System.out);
    }
}
