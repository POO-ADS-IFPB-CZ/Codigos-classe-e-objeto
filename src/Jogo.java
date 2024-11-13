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
        if(ehInvalido(numero) || estaContido(numero)){
            return false;
        }
        numeros[numerosAdicionados++] = numero;
        return true;
    }

    private boolean ehInvalido(int numero){
        return numero <1 || numero >60;
    }

    private boolean estaContido(int numero){
        for(int i: numeros){
            if(i == numero) return true;
        }
        return false;
    }

    public int[] getNumeros(){
        return numeros;
    }

}
