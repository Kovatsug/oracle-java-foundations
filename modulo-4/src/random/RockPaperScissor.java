package random;

import java.util.Random;

public class RockPaperScissor {

    public static void main(String[] args) {
        Random num = new Random();

        int result = num.nextInt(3);
        System.out.println(result);
        System.out.println(switch (result){
            case 0->"rock";
            case 1 ->"paper";
            case 2 ->"scissors";
            default -> " ";
        });

    }
}
