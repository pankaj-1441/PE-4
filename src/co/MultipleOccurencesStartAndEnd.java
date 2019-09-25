package co;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccurencesStartAndEnd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your String : ");
        String s=sc.nextLine();
        System.out.print("Enter word : ");
        String r=sc.next();

        Pattern p=Pattern.compile(r);
        Matcher m=p.matcher(s);
        while(m.find()){
            System.out.println("Found at : "+m.start()+"-"+m.end());
        }
    }
}
