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

    public boolean adicionar(int numero){
        //TODO: Adicionar condições de erro
        numeros[numerosAdicionados++] = numero;
        return true;
    }

    public int[] getNumeros(){
        return numeros;
    }

}
