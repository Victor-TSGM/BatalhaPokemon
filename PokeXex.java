
package pokexex;

import java.util.*;

public class PokeXex {

    

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        int selectedPokemon;
        
        Batalha battle = new Batalha();
        
        
        Pokemon charmander = new Pokemon("Charmander", "fogo", 80);
        Pokemon pikachu = new Pokemon("Pikachu", "eletrico", 100);
        Pokemon bulbasaur = new Pokemon("Bulbasaur", "planta", 50);
        Pokemon squirtle = new Pokemon("Squirtle", "agua", 60);
        Pokemon onix = new Pokemon("Onix", "terra", 70);
        
        System.out.println("Bem Vindo a Batalha Pokemon");
        System.out.println("Selecione o pokemon que deseja:");
        System.out.println("[1] - Charmander");
        System.out.println("[2] - Pikachu");
        System.out.println("[3] - Bulbasaur");
        System.out.println("[4] - Squirtle");
        System.out.println("[5] - Onix");
        
        selectedPokemon = ler.nextInt();
        
        switch(selectedPokemon){
            case 1:
                battle.meuPokemon(charmander);
                break;
            case 2:
                battle.meuPokemon(pikachu);
                break;
            case 3:
                battle.meuPokemon(bulbasaur);
                break;
            case 4:
                battle.meuPokemon(squirtle);
                break;
            case 5:
                battle.meuPokemon(onix);
                break;
        }
        
        
        
        System.out.println("Selecione o pokemon inimigo:");
        System.out.println("[1] - Charmander");
        System.out.println("[2] - Pikachu");
        System.out.println("[3] - Bulbasaur");
        System.out.println("[4] - Squirtle");
        System.out.println("[5] - Onix");
        
        selectedPokemon = ler.nextInt();
        
        
        switch(selectedPokemon){
            case 1:
                battle.outroPokemon(charmander);
                break;
            case 2:
                battle.outroPokemon(pikachu);
                break;
            case 3:
                battle.outroPokemon(bulbasaur);
                break;
            case 4:
                battle.outroPokemon(squirtle);
                break;
            case 5:
                battle.outroPokemon(onix);
                break;
        }
        
        System.out.println("A Batalha vai começar!!");
        
        battle.startBattle();   
        
    }
    
}
