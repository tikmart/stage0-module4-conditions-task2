package school.mjc.stage0.conditions.task2;

public class CoinFlip {
    public void throwCoin(int from1UpTo1000) {
        from1UpTo1000 = 499;
        if (from1UpTo1000 < 500){

            System.out.println("Eagle");
        }

        from1UpTo1000 = 500;
        if (from1UpTo1000 == 500){

            System.out.println("Tail");
        }

        from1UpTo1000 = 501;

        if (from1UpTo1000 > 500) {

            System.out.println("Tail");
        }
    }
}
