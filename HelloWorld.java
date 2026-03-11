package SchoolCodePractise;

import java.util.Random;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        //if(args.length > 0){
        //  System.out.println("Hello " + args[0]);
        System.out.println("Enter your name: ");
        String name=sc.nextLine();
        System.out.println("Hello " + name);
        int a=r.nextInt(10);
    }
}

