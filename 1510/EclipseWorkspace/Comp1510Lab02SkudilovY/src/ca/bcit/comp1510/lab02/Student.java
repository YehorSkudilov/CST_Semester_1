
package ca.bcit.comp1510.lab02;


/**
 * Student. Data class
 * @author Yehor S.
 * @version 2025
 */
class Student {
    /**
     * name.
     */
    public String name;
    
    /**
     * lab.
     */
    public int lab;
    
    /**
     * bonus.
     */
    public int bonus; 
    
    Student(String name, int lab, int bonus) {
        this.name = name;
        this.lab = lab;
        this.bonus = bonus;
    }
}