import java.util.Scanner;

public class SafeInput
{
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = "";

        do
        {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        }
        while(retString.length() == 0);

        return retString;
    }

    public static int getInt(Scanner pipe, String prompt)
    {
        int value;

        while(true)
        {
            System.out.print("\n" + prompt + ": ");

            if(pipe.hasNextInt())
            {
                value = pipe.nextInt();
                pipe.nextLine();
                return value;
            }
            else
            {
                String trash = pipe.nextLine();
                System.out.println("Invalid integer.");
            }
        }
    }

    public static double getDouble(Scanner pipe, String prompt)
    {
        double value;

        while(true)
        {
            System.out.print("\n" + prompt + ": ");

            if(pipe.hasNextDouble())
            {
                value = pipe.nextDouble();
                pipe.nextLine();
                return value;
            }
            else
            {
                String trash = pipe.nextLine();
                System.out.println("Invalid double.");
            }
        }
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int value;

        while(true)
        {
            value = getInt(pipe,
                    prompt + " [" + low + " - " + high + "]");

            if(value >= low && value <= high)
            {
                return value;
            }
            else
            {
                System.out.println("Value must be between "
                        + low + " and " + high + ".");
            }
        }
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        double value;

        while(true)
        {
            value = getDouble(pipe,
                    prompt + " [" + low + " - " + high + "]");

            if(value >= low && value <= high)
            {
                return value;
            }
            else
            {
                System.out.println("Value must be between "
                        + low + " and " + high + ".");
            }
        }
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        String response;

        while(true)
        {
            System.out.print("\n" + prompt + " [Y/N]: ");

            response = pipe.nextLine();

            if(response.equalsIgnoreCase("Y"))
            {
                return true;
            }
            else if(response.equalsIgnoreCase("N"))
            {
                return false;
            }
            else
            {
                System.out.println("Please enter Y or N.");
            }
        }
    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx)
    {
        String response;

        while(true)
        {
            System.out.print("\n" + prompt + ": ");
            response = pipe.nextLine();

            if(response.matches(regEx))
            {
                return response;
            }
            else
            {
                System.out.println("Invalid input.");
            }
        }
    }

    public static void prettyHeader(String msg)
    {
        int spaces;
        int frontSpaces;
        int backSpaces;

        for(int i = 0; i < 60; i++)
        {
            System.out.print("*");
        }

        System.out.println();

        spaces = 54 - msg.length();

        frontSpaces = spaces / 2;
        backSpaces = spaces - frontSpaces;

        System.out.print("***");

        for(int i = 0; i < frontSpaces; i++)
        {
            System.out.print(" ");
        }

        System.out.print(msg);

        for(int i = 0; i < backSpaces; i++)
        {
            System.out.print(" ");
        }

        System.out.println("***");

        for(int i = 0; i < 60; i++)
        {
            System.out.print("*");
        }

        System.out.println();
    }
}