package chapter8;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class InteractInput {
    public static void main(String[] args){
//        oldWay();
        newWay();
    }

    private static void oldWay() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        System.out.println("You have input: " + input);

    }

    private static void newWay(){
        Console console = System.console();
        console.writer().format(new Locale("fr", "CA"),"Hello World");
        if(console != null) {
            String userInput = console.readLine();
            console.writer().println ("You entered the following: "+userInput);
        }
    }
}
