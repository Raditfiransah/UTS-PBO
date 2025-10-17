class Barrier {
    private int strength;

    public Barrier(int strength) {
        this.strength = strength;
    }

    public void destroyed() {
        strength -= 9;
        if (strength < 0) strength = 0;
    }

    public String getBarrierInfo() {
        return "Barrier Strength: " + strength;
    }

    public boolean isBroken() {
        return strength <= 0;
    }
}
