package src.main.random;

import java.io.IOException;
import java.util.Scanner;

public class HelloGoodbye {
    public static void main(String[] args) throws IOException {
        Scanner myObj = new Scanner(System.in);
        String firstName = myObj.next();
        String secondName = myObj.next();
        System.out.println("Hello "+ firstName + " and "+ secondName);
        System.out.println("GoodBye "+ secondName + " and "+ firstName);
    }
}
