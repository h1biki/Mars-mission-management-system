import java.util.Scanner;

public class Input
{

    public Input()
    {
    }


    public char acceptCharInput(String displayMessage, int index)
    {
        System.out.println(displayMessage);
        Scanner console = new Scanner(System.in);
        char input = console.nextLine().charAt(index);
        return input;
    }


    public double acceptDoubleInput(String displayMessage)
    {
        System.out.println(displayMessage);
        Scanner console = new Scanner(System.in);
        double input = console.nextDouble();
        return input;
    }

    public int acceptIntegerInput(String displayMessage)
    {
        System.out.println(displayMessage);
        Scanner console = new Scanner(System.in);
        int input = console.nextInt();
        return input;
    }

    public String acceptStringInput(String displayMessage)
    {
        System.out.println(displayMessage);
        Scanner console = new Scanner(System.in);
        String input = console.nextLine().trim();
        return input;
    }
}