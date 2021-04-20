package ourDairy;

import PersonalKata.Diary;
import PersonalKata.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.attribute.UserPrincipal;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryUserTest {
    User joy;
    Diary relationshipDiary;
    @BeforeEach
    void startWithThis(){
        relationshipDiary = new Diary();
        joy = new User("Joy", relationshipDiary);
    }
    @Test
    void userHasADiary(){
        assertNotNull(joy.getDiary());
    }

    @Test
    void userCanWriteOnDiary(){
        joy.createEntry("""
                Today i was heartbroken,
                i bought ice-cream and chicken.
                """);
        assertEquals(2, 100/50);
    }













}
