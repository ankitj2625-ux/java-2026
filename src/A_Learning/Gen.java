package A_Learning;

import java.util.random.RandomGenerator;

public class Gen {
    public static void main(String[] args) {
//        String string= "ankit";
//        System.out.println(string.repeat(3));
//        System.out.println(string.isBlank());


        RandomGenerator rand = RandomGenerator.of("L64X128MixRandom");
        System.out.println(rand.nextInt(100));
    }
}
