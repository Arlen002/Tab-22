package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (FileWriter fileWriter = new FileWriter("FileWriter.txt");) {
            char i;
            for (i = 'a'; i <= 'z'; ++i) {
                fileWriter.write(Character.toUpperCase(i) + " " + i+"\n");
            }
            for (int j = 0; j < 10; j++) {
                fileWriter.write(j+"\n");
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        try (FileReader reader = new FileReader("FileWriter.txt")) {
            Scanner scanner = new Scanner(reader);
            int shet = 0;
            while (scanner.hasNextLine()) {
                shet++;
                System.out.println(shet + ": " + scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }



    }
}