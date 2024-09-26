import java.util.Random;

public class TesteVetorDinamico {
    public static void main(String[] args) throws Exception {
        //construir um vetor dinâmico de tamanho 8
        //use o operador de interência de tipo
        var teste = new VetorDinamico(8);
        var gerador = new Random();
        //loop infinito
        while(true){
            var valor = gerador.nextInt(10) + 1;
            //adiocionar
            teste.adicionar(valor);
            System.out.println(teste);
            System.out.println("=================");
            //dormir por 5 segundos
            Thread.sleep(5000);
        }
    }
    
}
