package symphonysolutions.matrix.generators;

import java.util.Random;

public class RandomNumberGenerator {
    private static final Random r = new Random();

    public static int generateInt(int min, int max) {
        // add a check if max > min
        return r.nextInt(max - min + 1) + min;
    }

    public static int generateInt(int max) {
        return generateInt(0, max);
    }

    public static double generateDouble(){
        return (r.nextDouble()) * 2 - 1;
    }
}
