class WalkingZombie extends Zombie {

    public WalkingZombie(double health, int level) {
        super(health, level);
    }

    @Override
    void heal() {
        if (level == 1) health += health * 0.2;
        else if (level == 2) health += health * 0.3;
        else if (level == 3) health += health * 0.4;
    }

    @Override
    void destroyed() {
        health -= health * 0.2;
        if (health < 0) health = 0;
    }

    @Override
    String getZombieInfo() {
        return "Walking Zombie -> Health: " + (int) health + ", Level: " + level;
    }
}