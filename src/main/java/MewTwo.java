public class MewTwo extends Pokemon {
    public MewTwo(int level) {
        maxHP = 106 + level;
        hp = maxHP;
        attack = 110 + level;
        defence = 90 + level;
        speed = 130 + level;
    }

    @Override
    public void cry() {
        System.out.println("daBaDBAAAAaDbABBABAB");
    }

    public void futureSight(Pokemon target) {
        int damage = 120 * (attack / 100);
        target.hp -= damage;
    }


}
