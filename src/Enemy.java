import java.util.Random;

public class Enemy extends Unit{


    public Enemy(double hp, double attack, String name, String weapon) {
        super(hp, attack, name, weapon);
    }

    public String dropLoot() {
        final String[] lootDropped = {"HP", "LevelUp", "Weapon"};
        Random random = new Random();
        int randomElement = random.nextInt(lootDropped.length);
        return lootDropped[randomElement];
    }

    public void attack(Unit target) {
        target.setHp(target.getHp() - this.getAttack());
    }

    public void reset() {
        setHp(getInitialHp());
    }
}

