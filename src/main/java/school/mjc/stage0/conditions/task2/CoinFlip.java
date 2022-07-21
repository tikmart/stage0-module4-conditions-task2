package school.mjc.stage0.conditions.task2;

public class CoinFlip {
    public static void throwCoin(int from1UpTo1000) {


        if (from1UpTo1000 > 500) {

            System.out.println("Tail");
        } else if (from1UpTo1000 == 500) {
            System.out.println("Tail");
        }
        else {
            System.out.println("Eagle");
        }
    }

    public static void main(String[] args) {

        throwCoin(499);
        throwCoin(500);
        throwCoin(501);


    }
}
