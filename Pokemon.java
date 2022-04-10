package pokexex;

public class Pokemon {
    private String nome;    
    private String tipo;
    double vida = 200;
    private double dano = 100;
    private double defesa = 50;
    private int level;

    public Pokemon(String nome, String tipo, int level) {
        this.nome = nome;
        this.tipo = tipo;
        this.level = level;
        calculaAtributos();
        calculaLevel();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getDano() {
        return dano;
    }

    public void setDano(double dano) {
        this.dano = dano;
    }

    public double getDefesa() {
        return defesa;
    }

    public void setDefesa(double defesa) {
        this.defesa = defesa;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }    
    
    //Métodos
    
    private void calculaLevel(){
        this.vida = vida + (level * 1.7);
        this.dano = dano + (level * 1.6);
        this.defesa = defesa + (level * 1.2);
    }
    
    public double calculaPoder(){
        double poder = 0;
        poder = this.dano + this.defesa + this.vida;
        System.out.println(poder);
        return poder;
    };
    
     void imprimeAtributos(){
        System.out.println("Nome: "+this.nome + " | Tipo: " + this.tipo + " | Dano: " + this.dano + " | Defesa: " + this.defesa + " | Vida: " + this.vida );

             
    }    
    
     void calculaAtributos(){
        switch(this.tipo){
            case "fogo":
                this.dano = 100;
                this.defesa = 50;
                this.vida -= 20;
            break;
            
            case "agua":
                this.dano = 150;
                this.defesa = 30;
                this.vida += 50;
            break;
            
            case "electro":
                this.dano = 200;
                this.defesa = 80;
                this.vida = 170;
            break;
            
            case "planta":
                this.dano = 130;
                this.defesa = 60;
                this.vida = 250;
            break;
            
            case "psiquico":
                this.dano = 130;
                this.defesa = 60;
                this.vida = 250;
            break;
        }
    }
}


