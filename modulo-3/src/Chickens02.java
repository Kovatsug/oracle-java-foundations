public class Chickens02 {
    public static void main(String[] args) {
        //Put yout code here
        double dailyAverage;
        double monthlyAverage;
        double monthlyProfit;

        double eggs=0;
        //monday
        eggs+=100;

        //tuesday
        eggs+=121;

        //wednesday
        eggs+=117;

        dailyAverage = eggs/3;
        monthlyAverage = dailyAverage*30;
        monthlyProfit = monthlyAverage*0.18;

        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
}
