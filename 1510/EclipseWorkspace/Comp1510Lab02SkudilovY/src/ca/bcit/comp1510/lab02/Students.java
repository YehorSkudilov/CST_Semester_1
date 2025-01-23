
package ca.bcit.comp1510.lab02;

import java.util.List;
import java.util.ArrayList; 
/**
 * Students. Prints a table of students.
 * @author Yehor S.
 * @version 2025
 */

public class Students {
        
    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        
        List<Student> students = new ArrayList<Student>();
        int spacing = 7;
        
        students.add(new Student("bob", 1, 2));
        students.add(new Student("alice", 2, 3));
        students.add(new Student("john", 3, 4));
        students.add(new Student("mary", 4, 5));
        students.add(new Student("jane", 5, 6));
        students.add(new Student("tom", 6, 7));
        students.add(new Student("lucy", 7, 8));
        students.add(new Student("paul", 8, 9));
        students.add(new Student("emma", 9, 10));
        students.add(new Student("daniel", 10, 1));
        
        //Prints the header
        System.out.println(getBorder("Up", 30));
        System.out.println("==      Student Points      ==");
        System.out.println(getBorder("Down", 30));
        
        //Prints column names
        System.out.println(getSpace("Name", spacing) 
                + getSpace("Lab", spacing) 
                + getSpace("Bonus", spacing) 
                + getSpace(("Total"), spacing));
        
        System.out.println(getSpace("---", spacing) 
                + getSpace("---", spacing) 
                + getSpace("---", spacing) 
                + getSpace(("---"), spacing));
        
        //prints the list of students and their info
        for (Student student : students) {
            System.out.println(getSpace(student.name, spacing) 
                    + getSpace(student.lab, spacing) 
                    + getSpace(student.bonus, spacing) 
                    + getSpace((student.lab 
                    + student.bonus), spacing));
        }
        
    }
    
    /**
     * getSpace. Fills the strings with spaces to 
     * have stringLength amount of characters
     * @param value takes int to transform. 
     * @param stringLength how long the string will be.
     * @return transformed String
     */
    static String getSpace(String value, int stringLength) {
        int length = value.length();
        for (int i = length; i < stringLength + 1; i++) {
            value += " ";
        }
        return value;
    }
    
    /**
     * getSpace. Fills the strings with spaces to 
     * have stringLength amount of characters
     * @param value takes String to transform. 
     * @param stringLength how long the string will be.
     * @return transformed String
     */
    static String getSpace(int value, int stringLength) {
        String strinngValue = String.valueOf(value);
        int length = strinngValue.length();
        for (int i = length; i < stringLength + 1; i++) {
            strinngValue += " ";
        }
        return strinngValue;
    }
    
    /**
     * getBorder. Generates header border
     * @param direction set direction of the / 
     *      either Up or Down
     * @param length how long the string will be.
     * @return filled border string
     */
    static String getBorder(String direction, int length) {
        String border = new String();
        if (direction.equals("Up")) {
            for (int i = 0; i < length; i++) {
                if (i < length / 2) {
                    border += "/";
                } else {
                    border += "\\";
                }
                
            }    
        } else if (direction.equals("Down")) {
            for (int i = length; i > 0; i--) {
                if (i  < ((length / 2) + 1)) {
                    border += "/";
                } else {
                    border += "\\";
                }
                
            }   
        }
     
        return border;
    }
}

 