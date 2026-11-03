import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double total = 0;
        double itemPrice;

        do
        {
            itemPrice =
                    SafeInput.getRangedDouble(
                            in,
                            "Enter item price",
                            0.50,
                            10.00);
            total += itemPrice;
        }
        while(
                SafeInput.getYNConfirm(
                        in,
                        "Do you have another item")
        );
        System.out.printf(
                "\nTotal Cost: $%.2f\n",
                total);
    }
}