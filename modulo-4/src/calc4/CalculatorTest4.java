package calc4;

public class CalculatorTest4 {
    public static void main(String[] args) {
        
        Calculator4 calc = new Calculator4();
        double total=0;
        //Name your friends
        total+=calc.calculate(10);
        total+=calc.calculate(12);
        total+=calc.calculate(9);
        total+=calc.calculate(8);
        total+=calc.calculate(7);
        total+=calc.calculate(15);
        total+=calc.calculate(11);
        total+=calc.calculate(30);

        //Find and print the entire table's total, including tax and tip
        System.out.println("table total: $"+total);
    } 
}
