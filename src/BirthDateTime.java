import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int year;
        int month;
        int day;
        int hour;
        int minute;
        int maxDays;

        year = SafeInput.getRangedInt(
                in,
                "Enter birth year",
                1950,
                2015);

        month = SafeInput.getRangedInt(
                in,
                "Enter birth month",
                1,
                12);

        switch(month)
        {
            case 4:
            case 6:
            case 9:
            case 11:
                maxDays = 30;
                break;

            case 2:
                maxDays = 29;
                break;

            default:
                maxDays = 31;
        }

        day = SafeInput.getRangedInt(
                in,
                "Enter birth day",
                1,
                maxDays);

        hour = SafeInput.getRangedInt(
                in,
                "Enter birth hour",
                1,
                24);

        minute = SafeInput.getRangedInt(
                in,
                "Enter birth minute",
                1,
                59);

        System.out.println(
                "\nBirth Date: "
                        + month + "/"
                        + day + "/"
                        + year);

        System.out.println(
                "Birth Time: "
                        + hour + ":"
                        + minute);
    }
}