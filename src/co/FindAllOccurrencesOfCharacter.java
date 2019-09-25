package co;
import java.util.regex.Matcher;
import java.util.Scanner;

public class FindAllOccurrencesOfCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String : ");
        String line=sc.nextLine();
        System.out.println("Enter the character whose number of occurrences you want to find : ");
        String c=sc.next();
        String line2=line.replaceAll(c,"");
        System.out.println(line.length()-line2.length());
    }
}
