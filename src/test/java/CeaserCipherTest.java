package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class CeaserCipherTest {
    @Test
    public void ceaserCipher_instantiatesCorrectly_true() {
        CeaserCipher testCeaser = new CeaserCipher("Hello", 2);
        assertTrue(testCeaser instanceof CeaserCipher);

    }
    @Test
    public void ceaserCipher_getmKey_int() {
        CeaserCipher testCeaser = new CeaserCipher("Hello",2);
        assertEquals(2,testCeaser.getmKey());
    }
}