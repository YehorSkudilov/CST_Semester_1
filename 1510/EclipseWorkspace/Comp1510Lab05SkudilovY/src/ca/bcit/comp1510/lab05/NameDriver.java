package ca.bcit.comp1510.lab05;

import java.util.Scanner;
public class NameDriver {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type a first middle and last name seperated by space (example: John Alex Dough):");
        Name name = new Name(scan.next(), scan.next(), scan.next());
        System.out.println(name.getLength());
        System.out.println(name.getInitials());
        System.out.println("Which character would you like to see? Type number: ");
        System.out.println(name.getNameChar(scan.nextInt()));
        System.out.println(name.getLastFirstMiddleWithCommas());
        System.out.println("Check if first name matches: ");
        System.out.println(name.firstNameEquals(scan.next()));
        System.out.println(name.toString());
    }
}
