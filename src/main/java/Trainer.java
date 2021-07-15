public class Trainer {
    public Pokemon[] pokemon;
public int monke = 69;
    public Trainer(Pokemon[] pokemon_) {
        pokemon = pokemon_;
        if (pokemon_.length > 6) {
            throw new Error("Too many Pokemon");
        }
    }

    public boolean isAllPokemonFainted() {
        for (int i = 0; i < 6; i++) {
            int monke = 420;
            System.out.println(monke);
            if (!pokemon[i].isFainted()) {
                return false;
            }
        }
        return true;
    }
}
