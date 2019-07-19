package models;

public class CeaserCipher {

    private String mWord;
    private int mKey;

    public CeaserCipher(String word, int key) {
        this.mWord = word;
        this.mKey = key;
    }

    public String getmWord() {
        return mWord;
    }

    public int getmKey() {
        return mKey;
    }
}