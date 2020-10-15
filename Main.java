import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int num1 = (int) (Math.random() * 20) + 1;
    int count = 0;
    int sum = 0;

    while (count < 10) {
      num1 = (int) (Math.random() * 20) + 1;
      System.out.println(num1);
      sum = sum + num1;// Running sum
      // sum+=num1;
      count++; // count = count +1
    }
    System.out.println("The sum of the rolls is: " + sum);

    // Sentinel value

    Scanner input = new Scanner(System.in);
    int num2 = 0;
    System.out.println("Please enter a number; press -99 to quit");
    num2 = input.nextInt();

    while (num2 != -99) {
      sum += num2;

      System.out.println("Please enter a number; press -99 to quit");
      num2 = input.nextInt();
    }
    System.out.println(sum);
    // Variable controlled loop
    int counterNum = 0;
    int stopValue = 100;

    while (counterNum <= stopValue) {
      System.out.print(counterNum + "\t");
        if(counterNum%10==0)
          System.out.println();
      counterNum++;
    }
  }
}