package PersonalKata;

public class User {

    private String userName;
    private Diary userDiary;

    public User(String userName, Diary userDiary) {
        this.userName = userName;
        this.userDiary = userDiary;
    }

    public Diary getDiary() {
        return userDiary;
    }

    public void createEntry(String entryBody) {
    }
}
