package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class CeaserCipherTest {
    @Test
    public void ceaserCipher_instantiatesCorrectly_true() {
        CeaserCipher testCeaser = new CeaserCipher("Welcome", 2);
        assertTrue(testCeaser instanceof CeaserCipher);

    }
    @Test
    public void ceaserCipher_getmKey_int() {
        CeaserCipher testCeaser = new CeaserCipher("Hello",2);
        assertEquals(2,testCeaser.getmKey());
    }
    @Test
    public void ceaserCipher_getmWord_String() {
        CeaserCipher testCeaser = new CeaserCipher("Hello",1);
        assertEquals("Hello",testCeaser.getmWord());
    }
}