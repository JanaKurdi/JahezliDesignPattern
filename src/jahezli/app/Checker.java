package jahezli.app;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Checker {
    ////////////////////////////Check PayPal//////////////////////////////
    ////////////////////////////// Email /////////////////////////////////////////////// 

    public static String checkEmail(String e, Scanner input) {
        boolean isCorrectEmail = isCorrectEmail(e);
        if (isCorrectEmail == false) {
            do {
                System.out.println("please enter your email correctly (email:########@#######): ");
                e = input.next();
                isCorrectEmail = isCorrectEmail(e);
            } while (isCorrectEmail == false);
        }
        return e;
    }

    public static boolean isCorrectEmail(String e) {
        boolean isNumber = checkIsNumber(e);
        if (isNumber == true) {
            return false;
        }
        boolean isCorrectEmail = e.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$") && !isNumber ? true : false;
        return isCorrectEmail;
    }
///////////////////////////// End of Email ///////////////////////////////////////////
    ///////////////////////// Password ////////////////////////////////////////

    public static String checkPassword(String pass, Scanner input) {
        boolean isValidPassword = isValidPassword(pass);
        if (isValidPassword == false) {
            do {
                System.out.println("invaild password"
                        + " please enter a vaild password:");
                pass = input.next();
                isValidPassword = isValidPassword(pass);
            } while (isValidPassword == false);
        }
        return pass;
    }

    public static boolean isValidPassword(String password) {
        // for checking if password length
        // is less than 8 
        if (password.length() < 8) {
            return false;
        }
        // to check space
        if (password.contains(" ")) {
            return false;
        }
        // if all conditions fails
        return true;
    }

//////////////////////////Check credit card//////////////////////////////////
    public static boolean isValidExpiryDate(String ExpiryDate) {

        //check wheter the first two "MM" "month" characters are digits or not 
        if (Character.isDigit(ExpiryDate.charAt(0)) && Character.isDigit(ExpiryDate.charAt(1))) {
            //check wheter the first digit is 0 or 1 to have valid month 
            if (ExpiryDate.charAt(0) == '0' || (int) ExpiryDate.charAt(0) == '1') {
                //check wheter the month is in the range of 1 -12
                if (Integer.parseInt(ExpiryDate.substring(0, 2)) >= 1 && Integer.parseInt(ExpiryDate.substring(0, 2)) <= 12) {
                    if (ExpiryDate.charAt(2) == '/') {
                        //check the year characters "YY"are digits or not 
                        if (Character.isDigit(ExpiryDate.charAt(3)) && Character.isDigit(ExpiryDate.charAt(4))) {
                            //check whether the year is 21 or above or not
                            if (Integer.parseInt(ExpiryDate.substring(3)) >= 21) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean isValidCVVNumber(String str) {
        // Regex to check valid CVV cardNumber.
        String regex = "^[0-9]{3,4}$";

        // Compile the ReGex
        Pattern p = Pattern.compile(regex);

        // If the string is empty
        // return false
        if (str == null) {
            return false;
        }
        // Find match between given string
        // and regular expression
        // using Pattern.matcher()
        Matcher m = p.matcher(str);

        // Return if the string
        // matched the ReGex
        return m.matches();
    }

    public static boolean isValidCardNumber(String cardNum) {
        try {
            long cardNumber = Long.parseLong(cardNum);
            return (getSize(cardNumber) >= 13
                    && getSize(cardNumber) <= 16);
        } catch (Exception e) {
            return false;
        }

    }

    ///////////////////CHECK CARD NAME /////////////////////////
    public static String checkCardHolderName(String fn, Scanner input) {
        boolean isVaildName = isVaildName(fn);
        if (isVaildName == false) {
            do {
                System.out.println("please enter Card Holder name (No numbers or Symbols ) :");
                fn = input.next();
                isVaildName = isVaildName(fn);
            } while (isVaildName == false);
        }
        return fn;
    }

    public static boolean checkIsNumber(String num) {
        boolean isNumber = false;
        try {
            int number = Integer.parseInt(num);
            return isNumber = true;
        } catch (NumberFormatException e) {
            return isNumber;
        }
    }

    public static boolean isVaildName(String Name) {
        boolean isNumber = checkIsNumber(Name);
        if (isNumber == true) {
            return false;
        }
        boolean isCorrect = Name.matches("[a-zA-Z]+") && !isNumber ? true : false;
        return isCorrect;
    }

    // Return the number of digits in a card number
    public static int getSize(long cardNumber) {
        String num = cardNumber + "";
        return num.length();
    }
}
