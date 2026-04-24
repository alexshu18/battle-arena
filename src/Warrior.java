public class Warrior extends Soldier {

    public Warrior(double hp, double attack, String name, String weapon) {
        super(hp, attack, name, weapon);
    }

//    public void attack(Unit target) {
//        System.out.println(target.getHp());
//       target.setHp(target.getHp() - this.getAttack());
//        System.out.println(target.getHp());
//    }


    @Override public void attack(Unit target) {
        target.setHp(target.getHp() - this.getAttack() * 1.5);
    }
}
