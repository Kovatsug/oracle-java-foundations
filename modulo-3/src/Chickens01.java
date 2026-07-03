public class Chickens01 {
    public static void main(String[] args) {

        int totalEggs;
        int eggsPerChicken;
        int chickencount;

        //monday
        totalEggs=0;
        eggsPerChicken=5;
        chickencount=3;
        totalEggs+=chickencount*eggsPerChicken;

        //tuesday
        chickencount++;
        totalEggs+=chickencount*eggsPerChicken;

        //wednesday
        chickencount/=2;
        totalEggs+=chickencount*eggsPerChicken;


        System.out.println(totalEggs);

        //second scenario
        //monday
        totalEggs=0;
        eggsPerChicken=4;
        chickencount=8;
        totalEggs+=chickencount*eggsPerChicken;

        //tuesday
        chickencount++;
        totalEggs+=chickencount*eggsPerChicken;

        //wednesday
        chickencount/=2;
        totalEggs+=chickencount*eggsPerChicken;


        System.out.println(totalEggs);
    }   
}
