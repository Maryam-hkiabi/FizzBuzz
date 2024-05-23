//write a main method that prints how many multiples of 3 or 5 there are below 1000.

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

//OR
//public class Multiples {
//    public static void main(String[] args) {
//        final int MAX_NUM = 1000;

//        int count = 0;

//        for (int i = 1; i < MAX_NUM; i++) {
//            if (i % 3 == 0 || i % 5 == 0) {
//                count++;
//            }
//        }

//        System.out.println(count);
//    }
//}
