//Starting with a number n, if n is even divide it by 2. If n is odd, subtract 1. Repeat.
//For example, if you start with n = 2, the answer is 2. Details: 2 (even, divide by 2) --> 1 (odd, subtract 1) --> 0.
// In Reduce.java, write a main method that prints how many steps it takes to reach 0 if you start at 100.


public class Reduce {
    public static void main(String[] args) {
        int steps = 0;
        int num = 100;
        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            steps += 1;
        }
        System.out.println(steps);
    }
}
