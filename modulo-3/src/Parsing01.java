public class Parsing01 {
    public static void main(String[] args) {
        //Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
        String shirtPrice = "67";
        String taxRate = "0.15";
        String gibberish = "887ds7nds87dsfs";
        
        //Parse shirtPrice and taxRate, and print the total tax
        System.out.println(Integer.parseInt(shirtPrice)*Double.parseDouble(taxRate));

    }
    
}
