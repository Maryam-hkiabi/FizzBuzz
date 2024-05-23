public class Multiples {
    public static void main(String[] args) {
        int multiples = 0;
        for (int i = 1; i < 1000; i+=1) {
            if (i % 3 == 0 && i % 5 == 0 ) {
                multiples += 1;
            }
        }
        System.out.println(multiples);
    }
}
