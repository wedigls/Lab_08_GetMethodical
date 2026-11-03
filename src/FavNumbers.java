import java.util.Scanner;

public class FavNumbers
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int favoriteInt;
        double favoriteDouble;

        favoriteInt = SafeInput.getInt(
                in,
                "Enter favorite integer");

        favoriteDouble = SafeInput.getDouble(
                in,
                "Enter favorite double");

        System.out.println(
                "\nFavorite Integer: "
                        + favoriteInt);

        System.out.println(
                "Favorite Double: "
                        + favoriteDouble);
    }
}