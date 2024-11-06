import java.time.LocalDate;

public class Pessoa {

    private static int contPessoa;
    private int id;
    //Encapsulamento
    private String nome;
    /*CPF é uma constante
        *não precisa fazer o set
        * obrigatoriamente precisa inicializar
    */
    private final String cpf;
    private String estadoCivil;
    private float renda;
    private LocalDate nascimento;

    public Pessoa(String nome, String cpf, String estadoCivil,
                  float renda, LocalDate nascimento){
        this.id = ++contPessoa;
        this.nome = nome;
        this.cpf = cpf;
        this.estadoCivil = estadoCivil;
        this.renda = renda;
        this.nascimento = nascimento;
    }

    //Sobrecarga de operador
    public Pessoa(String nome, String cpf){
        this.id = ++contPessoa;
        this.nome = nome;
        this.cpf = cpf;
    }

    public int getId(){
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf(){
        return cpf;
    }

    public String getEstadoCivil(){
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil){
        this.estadoCivil = estadoCivil;
    }

    public float getRenda(){
        return renda;
    }

    public void setRenda(float renda){
        this.renda = renda;
    }

    public LocalDate getNascimento(){
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento){
        this.nascimento = nascimento;
    }

}
