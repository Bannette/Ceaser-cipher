
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
        CeaserCipher testCeaser = new CeaserCipher("Welcome",2);
        assertEquals(2,testCeaser.getmKey());
    }
    @Test
    public void ceaserCipher_getmWord_String() {
        CeaserCipher testCeaser = new CeaserCipher("Welcome",1);
        assertEquals("Welcome",testCeaser.getmWord());
    }
    @Test
    public void ceaserCipher_setmWord_String() {
        CeaserCipher testCeaser = new CeaserCipher("Hello",1);
        testCeaser.setmWord("hi");
        assertEquals("hi",testCeaser.getmWord());
    }

    @Test
    public void ceaserCipher_setmKey_int(){
        CeaserCipher testCeaser = new CeaserCipher("Hello",2);
        testCeaser.setmKey(1);
        assertEquals(1,testCeaser.getmKey());
    }

    @Test
    public void ceaserCipher_encrypter_String(){
        CeaserCipher testCeaser = new CeaserCipher("Ae", 1);
        Encrypt testEncrypt = new Encrypt();
        testEncrypt.setWord(testCeaser.getmWord());
        testEncrypt.setKey(testCeaser.getmKey());
        assertEquals("Bf",testEncrypt.encrypter());
    }

    @Test
    public void ceaserCipher_decrypter_String(){
        CeaserCipher testCeaser = new CeaserCipher("Bf", 1);
        Decrypt testDecrypt = new Decrypt();
        testDecrypt.setWord(testCeaser.getmWord());
        testDecrypt.setKey(testCeaser.getmKey());
        assertEquals("Ae",testDecrypt.decrypter());
    }
}