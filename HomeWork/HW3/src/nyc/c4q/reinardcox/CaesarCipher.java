package nyc.c4q.reinardcox;

import java.util.Scanner;

/**
 * Class for Encoding and Decoding CaesarCiphers
 */
public class CaesarCipher {
//===================== Solution ==========================================

    public static boolean codeBreaker (String code1, String code2) {

        for (int offset = 0; offset < 26; offset++) {
            if (code1.equalsIgnoreCase(CaesarCipher.encode(code2,offset)) ){
                return true;
            }
        }
        return false;
    }

//==========================================================================

    public static String decode(String enc, int offset) {
        return encode(enc, 26 - offset);
    }

    public static String encode(String enc, int offset) {
        offset = offset % 26 + 26;
        StringBuilder encoded = new StringBuilder();
        for (char i : enc.toCharArray()) {
            if (Character.isLetter(i)) {
                if (Character.isUpperCase(i)) {
                    encoded.append((char) ('A' + (i - 'A' + offset) % 26 ));
                } else {
                    encoded.append((char) ('a' + (i - 'a' + offset) % 26 ));
                }
            } else {
                encoded.append(i);
            }
        }
        return encoded.toString();
    }

    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        String code1, code2;

        System.out.println("Enter the first word:");
        System.out.print("> ");
        code1 = userInput.nextLine();

        System.out.println("Enter the second word:");
        System.out.print("> ");
        code2 = userInput.nextLine();

        if (codeBreaker(code1,code2)) {
            System.out.println("Congratulations! " + code1.toUpperCase().charAt(0)+ code1.substring(1) + " and " + code2 + " was created by the encode by different offsets.");
        } else {
            System.out.println("I'm sorry but the word " + code1 + " and " + code2 + " was NOT created by the encode by different offsets.");
        }
    }
}
