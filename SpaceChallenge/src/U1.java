import java.util.Random;

public class U1 extends Rocket {
    private static final int ROCKET_WEIGHT = 10000;
    public static final int ROCKET_COST = 100000000;
    private static final int MAX_ROCKET_WEIGHT = 18000;

    public U1() {
        super(MAX_ROCKET_WEIGHT, ROCKET_WEIGHT, ROCKET_COST);
    }

    @Override
    public boolean launch() {
        double launchExplosionProbability = 0.05 * (this.totalWeight - ROCKET_WEIGHT) / (MAX_ROCKET_WEIGHT - ROCKET_WEIGHT);
        Random random = new Random();
        if (random.nextDouble() > launchExplosionProbability) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean land() {
        double landExplosionProbability = 0.01 * (this.totalWeight - ROCKET_WEIGHT) / (MAX_ROCKET_WEIGHT - ROCKET_WEIGHT);
        Random random = new Random();
        if (random.nextDouble() > landExplosionProbability) {
            return true;
        } else {
            return false;
        }
    }
}
