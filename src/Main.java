import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        InputMethods input = new InputMethods();
//        System.out.println("What was your total investment?");
//        int investment = input.getInt();
//        System.out.println("How many maps did you run?");
//        int mapsRan = input.getInt();
//        System.out.println("How long was each map to run?");
//        int timePerMap = input.getInt();
//        System.out.println("How much money did you earn in total?");
//        int totalRevenue = input.getInt();
//        ProfitCalculator profitCalculator = new ProfitCalculator(investment,mapsRan,timePerMap,totalRevenue);
//        profitCalculator.sendData();
//        System.out.println("Press enter to exit.");
//        scanner.nextLine();
//        String exit = scanner.nextLine();

        String title = "POE Profit Calculator";
        int frameWidth = 420;
        int frameHeight = 420;
        boolean setVisible = true;
        String headerText = "Rat's Profit Calculator";

        JLabel header = new JLabel();
        header.setText(headerText);
        header.setHorizontalAlignment(JLabel.CENTER);
        header.setVerticalAlignment(JLabel.TOP);
        header.setFont(new Font("Times New Roman",Font.BOLD,40));
        header.setForeground(Color.WHITE);

        JFrame frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(frameWidth,frameHeight);
        frame.setVisible(setVisible);
        frame.getContentPane().setBackground(new Color(50, 50, 50));
        frame.add(header);
    }
}