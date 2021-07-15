public class Trainer {
    public Pokemon[] pokemon;

    public Trainer(Pokemon[] pokemon_) {
        pokemon = pokemon_;
        if (pokemon_.length > 6) {
            throw new Error("Too many Pokemon");
        }
    }

    public boolean isAllPokemonFainted() {
        for (int i = 0; i < 6; i++) {
            if (!pokemon[i].isFainted()) {
                return false;
            }
        }
        return true;
    }
}
