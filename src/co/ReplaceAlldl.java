package co;

import java.util.Scanner;

public class ReplaceAlldl {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String : ");
        String line=sc.nextLine();
        System.out.println(line.toLowerCase().replaceAll("d","f").replaceAll("l","t"));
    }
}
