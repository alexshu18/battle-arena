public class Soldier extends Unit {
    private int level = 1;
    public Soldier(double hp, double attack, String name, String weapon) {
        super(hp, attack, name, weapon);
    }

    public void levelUp() {
        level++;
    }

    public void attack(Unit target) {
        target.setHp(target.getHp() - this.getAttack());
    }

}
