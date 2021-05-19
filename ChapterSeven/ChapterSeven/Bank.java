package ChapterSeven;


import java.util.ArrayList;

public class Bank {

    ArrayList<Account> accounts = new ArrayList<>();
    public void createNewAccount(String firstName, String lastName) {
        Account account = new Account(firstName, lastName);
        accounts.add(account);

    }


    public String getAccountName(int accountID) {
       return accounts.get(accountID - 1).getAccountName();
    }


    public void setFirstName() {
    }
}
