import java.util.Scanner;
public class Arrays {
    public  static void main (String [] args){
//        array ();
//        predicationGame();
//        racingTime();
//        codeChallenge1();
//        codeChallenge2();
//        codeChallenge3 ();
        favoriteFoods();
//        int [] nums = {75, 29,350,7,204,88,67};
//        int counter = 0;
//        int sum = 0;
//        for(int i = nums.length-1; i>=0 ; i-- ){
//            if(nums[i]> 100) {
//                counter++;
//            }
//            sum = sum+nums[i];
//        }
//        double mean = (double)sum / nums.length;
//        System.out.println(counter);
//        System.out.format("\nThe total sum the array is : %d", sum);
//        System.out.format("\nNumber of values greater than 100 is: %d\n",counter);
//        System.out.println("The mean number is: " +mean);
    }
    public static void array () {
        int[] foo = {1,2,3,4,5,6,7};
        //cannot change the length of the array
        //initialing an array with/out content allows for length changes
        int[] bar = new int[3]; //100 in the array size, all elements have a default value of zero
        bar[0]= 1;
        bar[1]= 2;
        bar[2]= 3;
        System.out.println(bar[0]);
    }
    public static void predicationGame (){
        Scanner scanner = new Scanner(System.in);

        String[] predication = new String [3];
        predication[0]= "a pioneer";
        predication[1]= "loved by many";
        predication[2]= "very wealthy";
        System.out.print("I will predicate your future choose 1, 2 or 3: ");
        int userChoice = scanner.nextInt();
        for(int i = 0; i<predication.length; i++){
            if(i == (userChoice-1)){
                System.out.println("In your future you  will be: "+predication[i]);
            }
        }
    }
    public static void racingTime(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of laps: ");
        int numLaps = scanner.nextInt();

        double[] lapTimes = new double[numLaps];

        for(int i = 0; i<lapTimes.length;i++){
            System.out.println("Enter your lat times in seconds: ");
            lapTimes[i]= scanner.nextDouble();

        }
        double fastesTime = lapTimes[0];
        for(int i = 1; i<lapTimes.length; i++){
            if(lapTimes[i]<fastesTime){
                fastesTime = lapTimes[i];
            }
        }
        System.out.println("Fastest times is: " + fastesTime);
        System.out.println(lapTimes[0]);
    }
    public static void codeChallenge1(){
         int[] num = {1,2,3,4,5,6,7,8,9,10};
         for(int i = 0; i<num.length; i++){
             System.out.println(num[i]);
         }
    }
    public static void codeChallenge2(){
        Scanner scanner = new Scanner(System.in);

        int[] userNumPicks = new int[5];

        for(int i = 0 ; i<userNumPicks.length; i++) {
            System.out.print("Pick 5 number from 0-20: ");
            int userNums = scanner.nextInt();
            userNumPicks[i] = userNums;

        }
        for(int i = userNumPicks.length-1; i>=0; i--) {
            System.out.println(userNumPicks[i]);
        }
    }
    public static void codeChallenge3 (){
        double[] nums = {11.34,67.1,12.34,24.67,8.37};
        double sumOfArray = 0;
        for(int i = 0; i<nums.length; i++){
            sumOfArray = sumOfArray+nums[i];
        }
        System.out.format("The sum of the array is: %.1f and the mean is: %.1f", sumOfArray, sumOfArray/nums.length);
    }

    public static void favoriteFoods(){
        Scanner scanner = new Scanner(System.in);
        String[] favFoods = new String[3];
        String favFoodsChoice;

        for(int i = 0; i<favFoods.length; i++){

                System.out.println("What are your top five favorite foods?");
                favFoodsChoice = scanner.nextLine();
                favFoods[i] = favFoodsChoice;
                System.out.println(favFoods[i]);
        }



        System.out.println("No more memory available!");

//        System.out.println(favFoods[0]);
    }
}
