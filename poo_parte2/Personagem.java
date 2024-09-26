public class Personagem{
    String nome;
    private int energia;
    private int fome;
    private int sono;
    Personagem(){
        System.out.println("Construindo novo personagem");
        energia = 10;
        fome = 0;
        sono = 0;
    }

    Personagem(int energia, int fome, int sono){
        System.out.println("Construindo novo personagem");
        this.energia = energia < 0 || energia > 10 ? 10 : energia;
        this.fome = fome >= 0 && fome <= 10 ? fome : 0;
        this.sono = sono >= 0 && sono <= 10 ? sono : 0;
    }

    void cacar(){
        if(energia >=2){
            System.out.printf("%s caçando\n", nome);
            energia -= 2;    
        }else{
            System.out.printf(
                "%s Sem energia para caçar\n", 
                nome
            );

        }
        if (fome < 10) fome = fome + 1; 
  
        sono =sono == 10 ? sono:sono + 1;
        
    }
    
    void comer(){
        if(fome >=1){
            System.out.println(nome + " comendo");
            energia = Math.min(energia + 1, 10) ;
            fome--;

        }else{
            System.out.println(nome + " sem fome");
        }
            
    }

    void dormir(){
        if(sono >=1){
            System.out.print(nome + " dormindo\n");
            energia = energia == 10 ? energia:energia + 1;
            sono--;
        }else{
            System.out.println(nome + " sem sono");
        }
        
    }
    public String toString(){
        //redefiniu o metodo 
        //quero que a representação visual do personagem seja essa:
        
        return String.format(
            " %s: e:%d, f:%d, s:%d",
            nome, energia,fome,sono
        );
    }
}

//byte, short, int, long, boolean, float, double, char = variáveis primitivas
//variáveis de referência começam com letra maiúscula (funcionam como o ponteiro em C)
//variáveis de instância 
//um metodo pode ser de dois tipos diferentes: efeito colateral ou produz valor
//operador ternário (?:): opera com 3 operandos. Funciona como um if/else em uma linha só
// "?" como if e ":" como else.

