import java.time.LocalDate;

public class Usuario {

    private String cpf;
    private String nome;
    private LocalDate nascimento;

    public Usuario(String cpf, String nome, LocalDate nascimento){
        this.cpf = cpf;
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public String getNome(){
        return nome;
    }

    //TODO: Fazer getters e setters

}
