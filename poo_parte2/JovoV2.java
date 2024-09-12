public class JovoV2 {
    public static void main(String[] args) {
        var cacador = new Personagem(); //var é operado de inferência de tipo
        cacador.nome = "HeroBrine";
        //loop infinito
        while(true){
            cacador.cacar();

        }
    }    
}
