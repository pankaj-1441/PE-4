package co;

import java.util.Arrays;
import java.util.Scanner;

public class SortAllWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String : ");
        String line=sc.nextLine();
        String[] words=line.split(" ");
        Arrays.sort(words);
        for(String s : words){
            System.out.println(s);
        }

    }
}
