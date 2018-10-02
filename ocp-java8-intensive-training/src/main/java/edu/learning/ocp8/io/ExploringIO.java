package edu.learning.ocp8.io;

import java.io.Console;

public class ExploringIO {

    public static void main(String... args) {
        printExec();
    }

    private static void printExec() {
        Console con = System.console();
        String username = con.readLine("User Name:");
        char[] p = con.readPassword("Password:");

        System.out.println("User name:"+username.toString());
        System.out.print("Password: ");
        for(char c: p) {
            System.out.print(c);
        }
    }

}
