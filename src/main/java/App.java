import models.CeaserCipher;
import models.Decrypt;
import models.Encrypt;

import java.util.Scanner;

public class App {
    public static void main (String[] args){
        System.out.println("\t===========================");
        System.out.println("\t\tCEASER-CIPHER");
        System.out.println("\t===========================");
        System.out.println("\n Welcome to Ceaser Cipher Where encryption is our drive");
        boolean run = true;
        while (run){
            Scanner myScanner = new Scanner(System.in);
            System.out.println("\n\n\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("\t| Enter ->  1: to Encrypt\n\t| Enter ->  2: to Decrypt\n\t| Enter ->  0: to Exit ");
            System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            Integer branch = Integer.parseInt(myScanner.nextLine());

            if (branch.equals(1)) {
                System.out.println("\n Enter a word to encrypt");
                String stringWord = myScanner.nextLine();
                System.out.println(" You entered: " + stringWord);
                System.out.println("\n Enter the key to encrypt with");
                int intKey = myScanner.nextInt();
                CeaserCipher testCeaser = new CeaserCipher(stringWord, intKey);
                Encrypt encrypt = new Encrypt();
                encrypt.setWord(testCeaser.getmWord());
                encrypt.setKey(testCeaser.getmKey());
                System.out.println("\t--------------------------------");
                System.out.println("\t| Your encrypted word is: "+ encrypt.encrypter());
                System.out.println("\t--------------------------------");
            }else if (branch.equals(2)) {
                System.out.println("\n Enter a word to Decrypt");
                String stringWord = myScanner.nextLine();
                System.out.println(" You entered: " + stringWord);
                System.out.println("\n Enter the key to Decrypt with");
                int intKey = myScanner.nextInt();
                CeaserCipher testCeaser = new CeaserCipher(stringWord,intKey);
                Decrypt decrypt = new Decrypt();
                decrypt.setWord(testCeaser.getmWord());
                decrypt.setKey(testCeaser.getmKey());
                System.out.println("\t---------------------------------");
                System.out.println("\t| Your decrypted word is: "+ decrypt.decrypter());
                System.out.println("\t---------------------------------");

            }else if(branch.equals(0)){
                run = false;
            }else {
                System.out.println(" Error!!!!! Enter a valid choice!!!!! It should be a number");
            }
        }
    }
}
