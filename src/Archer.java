public class Archer extends Soldier{

    public Archer(double hp, double attack, String name, String weapon) {
        super(hp, attack, name, weapon);
    }



    @Override public void attack(Unit target) {
        target.setHp(target.getHp() - this.getAttack() * 0.7);
    }
}
