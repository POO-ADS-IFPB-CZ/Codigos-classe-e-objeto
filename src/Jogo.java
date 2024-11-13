public class Jogo {

    private int[] numeros;
    private int numerosAdicionados;

    public Jogo(int quantidade){
        this.numeros = new int[quantidade];
        numerosAdicionados = 0;
    }

    public boolean isCompleto(){
        return numerosAdicionados == numeros.length;
    }

}
