import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InputMethods input = new InputMethods();
        System.out.println("What was your total investment?");
        int investment = input.getInt();
        System.out.println("How many maps did you run?");
        int mapsRan = input.getInt();
        System.out.println("How long was each map to run?");
        int timePerMap = input.getInt();
        System.out.println("How much money did you earn in total?");
        int totalRevenue = input.getInt();
        ProfitCalculator profitCalculator = new ProfitCalculator(investment,mapsRan,timePerMap,totalRevenue);
        profitCalculator.sendData();
        System.out.println("Press enter to exit.");
        scanner.nextLine();
        String exit = scanner.nextLine();
    }
}