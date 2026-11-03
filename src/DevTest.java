import java.util.Scanner;

public class DevTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String ssn;

        ssn = SafeInput.getRegExString(
                in,
                "Enter SSN",
                "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("SSN: " + ssn);
    }
}