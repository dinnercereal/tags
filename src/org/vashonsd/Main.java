package org.vashonsd;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What text would you like to tag?");
        String text = input.next();
        System.out.println("What would you like the tag to be?");
        String tag = input.next();
        System.out.println("<" + tag + ">" + text + "</" + tag + ">");
    }
}
