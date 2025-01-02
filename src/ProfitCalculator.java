public class ProfitCalculator {
    private int timePerMap;
    private int totalRevenue;
    private int totalInvestment;
    private int mapsRan;
    private int costPerMap;
    private int profitPerMap;
    private int profitPerHour;
    private int totalProfit;

    public ProfitCalculator(int totalInvestment, int mapsRan, int timePerMap, int totalRevenue) {
        this.totalInvestment = totalInvestment;
        this.timePerMap = timePerMap;
        this.totalRevenue = totalRevenue;
        this.mapsRan = mapsRan;
    }

    private int getCostPerMap(){
        return totalInvestment / timePerMap;
    }
    private int getTotalProfit(){
        return totalRevenue - totalInvestment;
    }
    private int getProfitPerMap(){
        return totalProfit / mapsRan;
    }
    private int getProfitPerHour(){
        return 60/timePerMap * profitPerMap;
    }
    private void setVariables(){
        totalProfit = getTotalProfit();
        costPerMap = getCostPerMap();
        profitPerMap = getProfitPerMap();
        profitPerHour = getProfitPerHour();
    }
    public void sendData (){
        setVariables();
        System.out.printf("The cost per map is %s\n",costPerMap);
        System.out.printf("The profit per map is %s\n",profitPerMap);
        System.out.printf("The profit per hour is %s\n",profitPerHour);
        System.out.printf("The total profit is %s\n",totalProfit);
    }
}
