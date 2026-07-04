public class Tip01 {
    public static void main(String[] args) {
        //Find everyone's indivudlal total after tax(5%) and tip(15%)
        double tax = 0.05;
        double tip = 0.15;

        /*This is what everyone owes before tax and tip:
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15
        Person 7: $11
        Person 8: $30
        */
        System.out.println(10 + 10*(tax + tip));
        System.out.println(12 + 12*(tax + tip));
        System.out.println(9 + 9*(tax + tip));
        System.out.println(8 + 8*(tax + tip));
        System.out.println(7 + 7*(tax + tip));
        System.out.println(15 + 15*(tax + tip));
        System.out.println(11 + 11*(tax + tip));
        System.out.println(30 + 30*(tax + tip));
        
    }

}
