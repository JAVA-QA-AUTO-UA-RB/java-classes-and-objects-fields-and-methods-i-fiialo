public class Superhero {

    String name;
    int attackPower;
    int defensePower;
    int health = 100;

    boolean isAlive = true;

    public void attack(Superhero opponent) {
        System.out.println(this.name + " атакує ");
        opponent.takeDamage(attackPower);
    }

    public void takeDamage(int damage) {
        int actualDamage = damage - defensePower;

        if (actualDamage < 1) {
            actualDamage = 1;
        }

        System.out.println(this.name + " отримав " + actualDamage + " ушкоджень (захист: " + defensePower + ")");
        health -= actualDamage;

        if (health <= 0) {
            health = 0;
            isAlive = false;
            System.out.println(this.name + " загинув у бою");
        } else {
            System.out.println(this.name + " ще живий. Залишилось здоров'я: " + health);
        }
    }

    public void celebrate() {
        System.out.println("Superhero " + this.name + " перемагає!");
    }

    public void showStats() {
        System.out.println("Статистика:");
        System.out.println("Ім'я: " + name);
        System.out.println("Атака: " + attackPower);
        System.out.println("Захист: " + defensePower);
        System.out.println("Здоров'я: " + health);
        System.out.println("Статус: " + (isAlive ? "Живий" : "Мертвий"));
    }
}