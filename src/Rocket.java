public class Rocket implements SpaceShip {

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
        return false;
    }

    @Override
    public void carry(Item item) {

    }
}
