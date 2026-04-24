public abstract class Unit {
    private double hp;
    private double attack;
    private String name;
    private String weapon;
    private double initialHp;

    public Unit(double hp, double attack, String name, String weapon) {
        this.hp = hp;
        this.attack = attack;
        this.name = name;
        this.weapon = weapon;
        this.initialHp = hp;
    }


    public double getHp() {
        return hp;
    }

    public void setHp(double newHp) {
        this.hp = newHp;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double newAttack) {
        this.attack = newAttack;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String newWeapon) {
        this.weapon = newWeapon;
    }

    public double getInitialHp() {
        return initialHp;
    }



    public abstract void attack(Unit target);
}
