public class Pikachu extends Pokemon {
    public static int pokedex = 25;
    public static int pikachuCounter = 0;
    public Pikachu(int level) {
        hp = 35 + level;
        attack = 55 + level;
        defence = 30 + level;
        speed = 90 + level;
        type = Type.ELECTRIC;
        pikachuCounter++;
    }

    @Override
    public void cry() {
        System.out.println("pika pika");
    }

    public void thunderbolt(Pokemon target) {
        target.hp -= attack;
    }


}
