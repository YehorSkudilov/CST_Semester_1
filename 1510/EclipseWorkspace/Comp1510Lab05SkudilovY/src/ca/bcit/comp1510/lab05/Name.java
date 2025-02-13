package ca.bcit.comp1510.lab05;

/**
 * Name. Data class. Represents a Name concept. 
 * @author Yehor S.
 * @version 2025
 */
public record Name(String firstName, String middleName, String lastName) {
    
     public int getLength(){
         return (firstName + middleName + lastName).toString().length();
     }
     
     public String getInitials(){
         return (""+firstName.charAt(0) + middleName.charAt(0)
                 + lastName.charAt(0)).toUpperCase();
     }
     
     public char getNameChar(int n){
         return (firstName + middleName + lastName).charAt(n);
     }
     
     public String getLastFirstMiddleWithCommas() {
         return firstName + ", " + lastName + ", " + middleName;
     }
     
     public boolean firstNameEquals(String matchString) {
         return matchString.equals(firstName);
     }
    

}

/* 4f. Would it be useful to define a method that accepts a Name object and returns 
 * true if the three parts of the name object are the same as the three parts of 
 * “this” Name object?
 * 
 *      It would make no sense because record already has equals method.
 */
