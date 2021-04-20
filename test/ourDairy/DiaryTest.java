package ourDairy;

import PersonalKata.Diary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiaryTest {

    Diary diary;
    @BeforeEach
    void startWithThis() {
        diary = new Diary();
    }

    @Test
    void entryCanBeAdded(){
        diary.addEntry("""
                I am a good Guy
                """);
        assertEquals(1, diary.getTotalNumberOfEntry());
    }
}