public class CtoFTableDisplay
{
    public static void main(String[] args)
    {
        System.out.printf(
                "%-12s%-12s\n",
                "Celsius",
                "Fahrenheit");

        for(int c = -100; c <= 100; c++)
        {
            System.out.printf(
                    "%-12d%-12.2f\n",
                    c,
                    CtoF(c));
        }
    }
    public static double CtoF(double Celsius)
    {
        return Celsius * 9.0 / 5.0 + 32;
    }
}