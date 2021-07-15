public abstract class Pokemon {
    public int hp;
    public int attack, defence, speed;
    public Type type;

    public boolean isFainted() {
        return (hp < 1);
    }
}
