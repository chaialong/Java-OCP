package chapter8;

import java.io.*;

public class PrintWriterDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("zoo.log");
        try (PrintWriter out = new PrintWriter(
                new BufferedWriter(new FileWriter(file))
        )){
            out.print("Today's weather is: ");
            out.println("sunny");
            out.print("Today's temperature is: ");
            out.print(1 / 3.0);
            out.println("C");
            out.format("It has rained 10.12 inches this year");
            out.println();
            out.printf("It may rain 21.2 more inches this year");
        }

    }
}

