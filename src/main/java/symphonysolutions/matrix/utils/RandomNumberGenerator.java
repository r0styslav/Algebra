package symphonysolutions.matrix.utils;

import java.util.Random;

public class RandomNumberGenerator {

    public static int generateInt(int min, int max) {
        // add a check if max > min
        return new Random().nextInt(max - min + 1) + min;
    }

    public static int generateInt(int max) {
        return generateInt(0, max);
    }

    public static double generateDouble(){
        return (new Random().nextDouble()) * 2 - 1;
    }
}
