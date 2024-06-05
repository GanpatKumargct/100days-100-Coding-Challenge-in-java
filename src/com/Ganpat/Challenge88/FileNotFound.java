package com.Ganpat.Challenge88;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.Scanner;

public class FileNotFound {
    public static void main(String[] args) {
        System.out.println("Welcome to file Operation");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the FileName : ");
        String fileName = sc.next();

        System.out.println("Your File name is : "+fileName);

        try(FileReader reader = new FileReader(fileName)){
            int read;
            while ((read = reader.read())!=-1){
                System.out.print((char)read);
            }

        }catch (FileNotFoundException FNF){
            System.out.printf("%s File is Not Found",fileName);


        } catch (IOException e){
            System.out.printf("\nException Occurred : %s ",e.getMessage());
        }

    }
}
