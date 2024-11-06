import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        ContaCorrente c1 = new ContaCorrente(1, 1, "João");

        c1.depositar(200);
        if(c1.sacar(100)){
            System.out.println("Saque realizado com sucesso!");
        }
        if(c1.sacar(1000)){
            System.out.println("Saque realizado com sucesso!");
        }else{
            System.out.println("Falha");
        }

        System.out.println(c1.getSaldo());

    }
}