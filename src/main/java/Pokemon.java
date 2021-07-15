public abstract class Pokemon {
    public int hp;
    public int maxHP;
    public int attack, defence, speed;
    public Type type;

    public void heal() {
        hp = maxHP;
    }

    public abstract void cry();

    public boolean isFainted() {
        return (hp < 1);
    }
}
