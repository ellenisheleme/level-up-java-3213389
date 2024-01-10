package com.linkedin.javacodechallenges;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    public static Boolean isEven(int n){
            return n % 2 ==0;
    }

    public static boolean verifyPassword(String password){

        return password.length()>= 6 && password.matches(".*\\d.*") 
               && password.matches(".*[a-z]*.")
               && password.matches(".*[A-Z]*.");
        // if(password.length() < 6){
        //     return false;
        // }
        // boolean hasUpperCase = false;
        // boolean hasLowerCase = false;
        // boolean hasDigit = false;

        // for(int i = 0; i< password.length() || !hasUpperCase && !hasLowerCase && !hasDigit; i++){
        //     char current = password.charAt(i);
        //     if(Character.isDigit(current)){
        //         hasDigit = true;
        //     }else if (Character.isUpperCase(current)){
        //             hasUpperCase = true;
        //     }else if(Character.isLowerCase(current)){
        //         hasLowerCase = true;
        //     }
        // }
        // return hasDigit && hasLowerCase && hasUpperCase;
    }
}
