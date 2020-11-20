public class Rocket implements SpaceShip {

    int cost;
    int currentWeight;
    int maxWeight;
    double chanceExplosionLanding;
    double chanceExplosionLaunch;


    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public boolean canCarry() {
        return (currentWeight + item.weight) >= maxWeight;
    }

    @Override
    public void carry(Item item) {
        currentWeight += item.weight;
    }



}
