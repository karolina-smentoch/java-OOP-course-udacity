public class Rocket implements SpaceShip {
    public int maxWeight;
    public int totalWeight;
    public int rocketCost;

    public Rocket(int maxWeight, int totalWeight, int rocketCost) {
        this.maxWeight = maxWeight;
        this.totalWeight = totalWeight;
        this.rocketCost = rocketCost;
    }

    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public boolean canCarry(Item item) {
        return !(totalWeight + item.weight > maxWeight);
    }

    @Override
    public int carry(Item item) {
        totalWeight += item.weight;
        return totalWeight;
    }

}
