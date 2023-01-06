import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter student email: ");
        String stud = scan.nextLine();
        System.out.print("Enter student number: ");
         stud = scan.nextLine();
    
        Pattern pattern = Pattern.compile("\\w+@student.national-u.edu.ph");
        Matcher matcher = pattern.matcher(stud);

        boolean match = matcher.matches();

        if (match) {
            System.out.println("valid student email");
        } else {
            System.out.println("invalid student email");
            
       
         pattern = Pattern.compile("09+[0-9]{9,9}");
         matcher = pattern.matcher(stud);

         match = matcher.matches();

        if (match) {
            System.out.println("valid number");
        } else {
            System.out.println("invalid number");
        
        }
    }
}}
