package calc4;

public class Calculator4 {
    public double tax = .05;
    public double tip = .15;
    
    //Include the cost of Alex's and Forgetful's meals in your calculations
    //Return the total after calculating
    public double calculate(double price){
        return price*(1+tax+tip);

    }
}
