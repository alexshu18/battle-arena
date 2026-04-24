public class Main {
    public static void main (String[] args) {

        Warrior myWarrior = new Warrior(100, 10, "John", "Sword");
        Archer myArcher = new Archer(100, 20, "Mary", "Bow");
        Enemy myEnemy = new Enemy(100, 5, "Zombie1", "No");
        Battle myBattle = new Battle();

//        myWarrior.attack(myEnemy);
//        myArcher.attack(myEnemy);
        int choice;

        while((choice = Menu.menu()) != 3) {
            switch (choice) {
                case 1:
                    myBattle.fight(myWarrior, myEnemy);
                    break;
                case 2:
                    myEnemy.reset();
                    myBattle.fight(myArcher, myEnemy);
                    break;
            }
        }
    }
}