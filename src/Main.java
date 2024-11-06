import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Pessoa joao = new Pessoa("João", "111.111.111-01",
                "solteiro", 2000f,
                LocalDate.of(2000,1,20));
        Pessoa maria = new Pessoa("Maria", "222.222.222-02",
                "Casada", 3000f,
                LocalDate.of(1993,2,6));
        Pessoa jose = new Pessoa("José", "333.333.333-03");

        System.out.println(joao.getId());
        System.out.println(maria.getId());
        System.out.println(jose.getId());
    }
}