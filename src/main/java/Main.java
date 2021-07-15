import java.util.Arrays;

public class Main {
    public static void main(String args[]) {
        Pikachu hudsPikachu = new Pikachu(5);
        System.out.println(hudsPikachu.speed);
        Bulbasaur blakeBulbasaur = new Bulbasaur(2);
        MewTwo hudsMewTwo = new MewTwo(70);
        Pokemon[] arr = {blakeBulbasaur, blakeBulbasaur, blakeBulbasaur, hudsMewTwo, blakeBulbasaur, blakeBulbasaur};
        Trainer hudson = new Trainer(arr);
        System.out.println(Arrays.toString(hudson.pokemon));
        hudsMewTwo.futureSight(blakeBulbasaur);
        blakeBulbasaur.heal();
        hudsMewTwo.cry();
        Pikachu dedpPikachu = new Pikachu(2);
        //      System.out.println(blakeBulbasaur.hp);
        //    System.out.println(blakeBulbasaur.isFainted());
        System.out.println(hudson.isAllPokemonFainted());
        System.out.println(Pikachu.pokedex);
        System.out.println(Pikachu.pikachuCounter);
    }
}
