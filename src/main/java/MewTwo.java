public class MewTwo extends Pokemon {
    public MewTwo(int level) {
        hp = 106 + level;
        attack = 110 + level;
        defence = 90 + level;
        speed = 130 + level;
    }

    public void futureSight(Pokemon target) {
        int damage = 120 * (attack / 100);
        target.hp -= damage;
    }



}
