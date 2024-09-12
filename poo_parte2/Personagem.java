public class Personagem {
    String nome;
    int energia = 10;
    int fome = 0;
    int sono = 0;

    void cacar(){
        if (energia >=2){
            System.out.printf("%s caçando\n", nome);
            energia -=2; //energia = energia - 2
        }else{
            System.out.printf(
                "%s sem energia para caçar",
                nome
            );
            if (fome < 10)
                fome = fome + 1; // = fome +=1 fome++ ++fome
            sono = sono == 10 ? sono : sono + 1; //operador ternário (?:): opera com 3 operandos
        }        
    }

    void comer(){
        if(fome >= 1) {
            System.out.println(nome + " comendo");
            energia = Math.min(energia + 1, 10);
            fome--;
        }
        else{
            System.out.println(nome + " sem fome");
        }
    }

    void dormir(){
        if(sono >= 1){
            System.out.print(nome + " dormindo\n");
            energia = energia == 10 ? energia : energia + 1;
            sono -= 1;
        }else{
            System.out.println(nome + " sem sono");
        }
    }
}

//byte, short, int, long, boolean, float, double, char = variáveis primitivas
//variáveis de referência começam com letra maiúscula (funcionam como o ponteiro em C)
//variáveis de instância 
//um metodo pode ser de dois tipos diferentes: efeito colateral ou produz valor
//operador ternário (?:): opera com 3 operandos. Funciona como um if/else em uma linha só
// "?" como if e ":" como else.

