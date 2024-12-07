package org.example.io_pattern;

import java.io.*;


public class App {
    public static void main(String[] args) {
        try (InputStream in = new LowerCaseTextDecorator(new BufferedInputStream(new FileInputStream("Decorator/src/main/resources/text.txt")))) {
            System.out.println(new String(in.readAllBytes()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
