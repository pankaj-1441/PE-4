package co;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindNameRegularExpression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your String : ");
        String string=sc.nextLine().toLowerCase();
        String regex="harry";
        Pattern pattern=Pattern.compile(regex);
        Matcher m=pattern.matcher(string);
        boolean flag=false;
        while (m.find()){
            flag=true;
        }
        System.out.println("Is Harry here ? "+flag);

    }
}
