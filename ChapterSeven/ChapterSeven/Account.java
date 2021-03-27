package ChapterSeven;

public class Account {
    private String firstName;
    private String lastName;
    private String accountName;

    public Account(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;
        accountName = firstName + " " + lastName;
    }

    public String getAccountName() {
        return accountName;
    }

}
