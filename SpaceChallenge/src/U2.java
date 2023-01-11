import java.util.Random;

public class U2 extends Rocket {
    private static final int ROCKET_WEIGHT = 18000;
    public static final int ROCKET_COST = 120000000;
    private static final int MAX_ROCKET_WEIGHT = 29000;

    public U2() {
        super(MAX_ROCKET_WEIGHT, ROCKET_WEIGHT, ROCKET_COST);
    }

    @Override
    public boolean launch() {
        double launchExplosionProbability = 0.04 * (this.totalWeight - ROCKET_WEIGHT) / (MAX_ROCKET_WEIGHT - ROCKET_WEIGHT);
        Random random = new Random();
        if (random.nextDouble() > launchExplosionProbability) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean land() {
        double landExplosionProbability = 0.08 * (this.totalWeight - ROCKET_WEIGHT) / (MAX_ROCKET_WEIGHT - ROCKET_WEIGHT);
        Random random = new Random();
        if (random.nextDouble() > landExplosionProbability) {
            return true;
        } else {
            return false;
        }
    }
}
