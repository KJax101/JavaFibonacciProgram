package Q2FibonacciExercise;

public class Main {

    public static void main(String[] args) {

        int count = 25, num1 = 0, num2 = 1;
        System.out.print("Fibonacci Series of "+count+" numbers:");

        for (int i = 1; i <= count; ++i)
        {
            System.out.print(num1+" ");
            int sumOfPrevTwo = num1 + num2;
            //sum of most recent 2 nums is now = to num1
            num1 = num2;
            num2 = sumOfPrevTwo;
        }
    }
}

