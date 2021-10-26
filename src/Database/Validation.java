/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author dmoth
 */
public class Validation {

    public static String isValidemail(String mail) {
        String validity;
        String email = mail;
        String expression = "[\\w\\-]([\\.\\w])+[\\w]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        Pattern p = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(email);
        boolean b = m.matches();
        if (b == true) {
            validity = "Valid Email ID";
        } else {
            validity = "InValid Email ID";
        }
        return validity;

    }

    public static void isNumaric(KeyEvent evt) {
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }

    public static void checkLength(KeyEvent evt, String text, int lenght) {
        if (text.length() > lenght - 1) {
            evt.consume();
        }
    }
}
