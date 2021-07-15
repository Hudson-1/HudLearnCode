public class Pikachu extends Pokemon {
    public Pikachu(int level) {
        hp = 35 + level;
        attack = 55 + level;
        defence = 30 + level;
        speed = 90 + level;
        type = Type.ELECTRIC;
    }

    public void thunderbolt(Pokemon target) {
        target.hp -= attack;
    }


}
