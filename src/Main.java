public class Main {
    public static void main(String[] args) {

        Superhero batman = new Superhero();
        Superhero superman = new Superhero();

        batman.name = "Batman";
        batman.attackPower = 40;
        batman.defensePower = 25;

        superman.name = "Superman";
        superman.attackPower = 45;
        superman.defensePower = 15;

        batman.attack(superman);
        superman.attack(batman);

        batman.attack(superman);
        superman.attack(batman);

        batman.attack(superman);
        superman.attack(batman);
        batman.attack(superman);

        if (batman.isAlive) {
            batman.celebrate();
        } else {
            superman.celebrate();
        }

        batman.showStats();
        superman.showStats();
    }
}