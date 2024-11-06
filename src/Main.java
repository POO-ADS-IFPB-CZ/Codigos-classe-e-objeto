import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Usuario titular = new Usuario("111.111.111-01", "João",
                LocalDate.of(2005,10,15));
        ContaCorrente c1 = new ContaCorrente(1, 1, titular);

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
        System.out.println(c1.getTitular().getNome().toUpperCase());

    }
}