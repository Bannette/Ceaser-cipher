package models;

public class CeaserCipher {

    private String mWord;
    private int mKey;

    public CeaserCipher(String word, int key) {
        this.mWord = word;
        this.mKey = key;
    }
    //GETTERS

    public String getmWord() {
        return mWord;
    }

    public int getmKey() {
        return mKey;
    }
     //SETTERS
    public void setmWord(String mWord) {
        this.mWord = mWord;
    }

    public void setmKey(int mKey) {
        this.mKey = mKey;
    }
}