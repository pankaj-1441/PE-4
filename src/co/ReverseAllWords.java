package co;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReverseAllWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String : ");
        String line=sc.nextLine();
        String[] words=line.split(" ");

        String[] line2=new String[words.length];
        for(int i=0;i<line2.length;i++){
            line2[i]="";
        }
        String ans="";
        for(int i=0;i<words.length;i++){
            char[] ch=words[i].toCharArray();

            char[] ch2=new char[ch.length];
            for(int j=0;j<ch.length;j++) {
                ch2[j]=ch[ch.length-j-1];
            }

            line2[i]=new String(ch2);
            ans=ans+" "+line2[i];


        }


        String result=ans.trim();
        System.out.println(result);

    }

}
