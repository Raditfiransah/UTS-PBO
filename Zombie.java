abstract class Zombie {
    protected double health;
    protected int level;

    public Zombie(double health, int level) {
        this.health = health;
        this.level = level;
    }

    abstract void heal();
    abstract void destroyed();
    abstract String getZombieInfo();
}