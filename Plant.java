class Plant {
    public void doDestroy(WalkingZombie wz) {
        wz.destroyed();
        if (wz.health <= 0) System.out.println("💀 Walking Zombie kalah!");
    }

    public void doDestroy(JumpingZombie jz) {
        jz.destroyed();
        if (jz.health <= 0) System.out.println("💀 Jumping Zombie kalah!");
    }

    public void doDestroy(Barrier b) {
        b.destroyed();
        if (b.isBroken()) System.out.println("💥 Barrier hancur total!");
    }
}