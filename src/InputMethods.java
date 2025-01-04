import java.util.Scanner;

public class InputMethods {
    private Scanner scanner = new Scanner(System.in);
    public int getInt(){
        boolean finished = false;
        int input = 0;
        while (!finished){
            try{
                input = scanner.nextInt();
                finished = true;
            } catch (Exception e){
                System.out.println("Invalid input, please enter an integer");
                scanner.nextLine();
            }
        }
        return input;
    }

    public int getPercentageSize(int original,double percentage){
        double value = original * percentage;
        return (int)Math.round(value);


    }
}
