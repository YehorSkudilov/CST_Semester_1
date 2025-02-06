package ca.bcit.comp1510.lab04;

/**
 * Represents a Student with basic attributes such as name, birth year, 
 * student number, and gpa.
 * Provides methods to access and modify student details.
 * 
 * @author Yehor S.
 * @version 2025
 */
public class Student {

    /**
     * First name of the student.
     */
    private String firstName;        

    /**
     * Last name of the student.
     */
    private String lastName;         

    /**
     * Birth year of the student.
     */
    private int birthYear;           

    /**
     * Unique student number identifier.
     */
    private String studentNumber;    

    /**
     * Grade Point Average of the student.
     */
    private int gpa;                 

    
    /**
     * Constructs a new Student with the provided details.
     * 
     * @param setfirstName      the first name of the student
     * @param setlastName       the last name of the student
     * @param setbirthYear      the birth year of the student
     * @param setstudentNumber  the student number
     * @param setgpa            the grade point average
     */
    public Student(String setfirstName, String setlastName, int setbirthYear, 
            String setstudentNumber, int setgpa) {
        firstName = setfirstName;
        lastName = setlastName;
        birthYear = setbirthYear;
        studentNumber = setstudentNumber;
        gpa = setgpa;
    }
    
    /**
     * Returns the first name of the student.
     * 
     * @return first name
     */
    public String getFirstName() {
        return firstName;
    }
    
    /**
     * Sets the first name of the student.
     * 
     * @param setFirstName the new first name
     */
    public void setFirstName(String setFirstName) {
        firstName = setFirstName;
    }
    
    /**
     * Returns the last name of the student.
     * 
     * @return last name
     */
    public String getLastName() {
        return lastName;
    }
    
    /**
     * Sets the last name of the student.
     * 
     * @param setLastName the new last name
     */
    public void setLastName(String setLastName) {
        lastName = setLastName;
    }
    
    /**
     * Returns the birth year of the student.
     * 
     * @return birth year
     */
    public int getBirthYear() {
        return birthYear;
    }
    
    /**
     * Sets the birth year of the student.
     * 
     * @param setBirthYear the new birth year
     */
    public void setBirthYear(int setBirthYear) {
        birthYear = setBirthYear;
    }
    
    /**
     * Returns the student number.
     * 
     * @return student number
     */
    public String getStudentNumber() {
        return studentNumber;
    }
    
    /**
     * Sets the student number.
     * 
     * @param setStudentNumber the new student number
     */
    public void setStudentNumber(String setStudentNumber) {
        studentNumber = setStudentNumber;
    } 
    
    /**
     * Returns the gpa of the student.
     * 
     * @return gpa
     */
    public int getGPA() {
        return gpa;
    }
    
    /**
     * Sets the gpa of the student.
     * 
     * @param setGPA the new gpa
     */
    public void setGPA(int setGPA) {
        gpa = setGPA;
    }
    
    /**
     * Returns a string representation of the student.
     * 
     * @return formatted string containing student details
     */
    public String toString() {
        return firstName + " " + lastName + " " + birthYear 
                + " " + studentNumber + " " + gpa;    
    }
}
