public class Battle {

    public void fight(Soldier soldier, Enemy enemy) {
        while (soldier.getHp() > 0 && enemy.getHp() > 0) {
//            System.out.println("Soldier hp:" + soldier.getHp());
//            System.out.println("Enemy hp:" + enemy.getHp());
//            soldier.setHp(soldier.getHp() - enemy.getAttack());
//            enemy.setHp(enemy.getHp() - soldier.getAttack());
//            System.out.println("Soldier new hp" + soldier.getHp());
//            System.out.println("Enemy new hp: " + enemy.getHp());
            System.out.println("Soldier hp: " + soldier.getHp());
            System.out.println("Enemy hp:" + enemy.getHp());
                enemy.attack(soldier);
                soldier.attack(enemy);
            System.out.println("Soldier new hp: " + soldier.getHp());
            System.out.println("Enemy new hp: " + enemy.getHp());
            if (soldier.getHp() <= 0 || enemy.getHp() <= 0 ) break;
        }
        if (enemy.getHp() <= 0) {
            System.out.println("Soldier wins");
            System.out.println(enemy.dropLoot());
        } else {
            System.out.println("You lost");
        }
    }
}
