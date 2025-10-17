public class Tester {
    public static void main(String[] args) {
        WalkingZombie wz = new WalkingZombie(60, 1);
        JumpingZombie jz = new JumpingZombie(50, 2);
        Barrier b = new Barrier(150);

        Plant plant1 = new Plant();
        Plant plant2 = new Plant();

        int attackPlant1 = 2;
        int attackPlant2 = 4; 

        System.out.println("=== STATUS AWAL ===");
        System.out.println(wz.getZombieInfo());
        System.out.println(jz.getZombieInfo());
        System.out.println(b.getBarrierInfo());
        System.out.println("-----------------------------");

        int round = 1;

        while (true) {
            System.out.println("\n=== RONDE " + round + " ===");

            System.out.println("Plant 1 menyerang sebanyak " + attackPlant1 + " kali");
            for (int i = 0; i < attackPlant1; i++) {
                plant1.doDestroy(wz);
                plant1.doDestroy(jz);
                plant1.doDestroy(b);
            }

            System.out.println("Plant 2 menyerang sebanyak " + attackPlant2 + " kali");
            for (int i = 0; i < attackPlant2; i++) {
                plant2.doDestroy(wz);
                plant2.doDestroy(jz);
                plant2.doDestroy(b);
            }

            if (wz.health > 0) wz.heal();
            if (jz.health > 0) jz.heal();

            System.out.println("\n Status Setelah Ronde " + round);
            System.out.println(wz.getZombieInfo());
            System.out.println(jz.getZombieInfo());
            System.out.println(b.getBarrierInfo());
            System.out.println("-----------------------------");

            if ((wz.health <= 0 && jz.health <= 0) || b.isBroken()) {
                System.out.println("\n=== PERTARUNGAN SELESAI ===");
                if (wz.health <= 0 && jz.health <= 0)
                    System.out.println("Semua zombie telah dikalahkan!");
                if (b.isBroken())
                    System.out.println("Barrier telah hancur!");
                break;
            }

            if (round >= 10) {
                System.out.println("\nPertarungan mencapai 10 ronde!");
                if (wz.health > 0 || jz.health > 0)
                    System.out.println("Zombie berhasil bertahan hidup lebih dari 10 ronde! Zombie menang!");
                else
                    System.out.println("Plant berhasil menahan zombie!");
                break;
            }

            round++;
        }

        System.out.println("\n=== STATUS AKHIR ===");
        System.out.println(wz.getZombieInfo());
        System.out.println(jz.getZombieInfo());
        System.out.println(b.getBarrierInfo());
    }
}
