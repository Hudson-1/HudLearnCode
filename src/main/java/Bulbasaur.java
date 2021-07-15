public class Bulbasaur extends Pokemon {

    @Override
    public void cry() {
        System.out.println("waaaaaaaaaaaah");
    }

    public Bulbasaur (int level){
        hp = 45 + level;
        attack = 49 + level;
        defence = 49 + level;
        speed = 45 + level;
        type = Type.GRASS;
    }
}
