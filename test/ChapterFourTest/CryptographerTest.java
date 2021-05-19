package ChapterFourTest;

import chapterFour.Cryptographer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CryptographerTest {



    @Test
    void encrypt() {
        int encryptedMessage = Cryptographer.encrypt(7468);
        System.out.println(encryptedMessage);
    }
}