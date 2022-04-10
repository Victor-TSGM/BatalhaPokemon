package pokexex;

public class Batalha {
    private double meuPokemonPoder;
    private double outroPokemonPoder;
    
    public void meuPokemon(Pokemon myPokemon){ 
        double meuPoder = myPokemon.calculaPoder();
        this.meuPokemonPoder = meuPoder;
        
    }
    
    public void outroPokemon(Pokemon otherPokemon){        
        double oponentePoder = otherPokemon.calculaPoder();
        this.outroPokemonPoder = oponentePoder;
    }
    
    public void startBattle(){     

        
        if(meuPokemonPoder > outroPokemonPoder){
            
            System.out.println("Meu poder: " + meuPokemonPoder + "Oponente: " + outroPokemonPoder);
            
            System.out.println("Você Venceu!");
            
        }else{
            
            System.out.println("Meu poder: " + meuPokemonPoder + "Oponente: " + outroPokemonPoder);
            
            System.out.println("Você Perdeu");
            
        }
        
    }
}
