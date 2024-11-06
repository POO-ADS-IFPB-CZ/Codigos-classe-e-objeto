import java.time.LocalDate;

public class Produto {

    private int codigo;
    private String descricao;
    private float preco;
    private int quantidade;
    private LocalDate validade;

    public Produto(int codigo, String descricao, float preco, int quantidade,
                   LocalDate validade) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
        this.validade = validade;
    }

    public int getCodigo(){
        return codigo;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public float getPreco(){
        return preco;
    }

    public void setPreco(float preco){
        this.preco = preco;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public LocalDate getValidade(){
        return validade;
    }

    public void setValidade(LocalDate validade){
        this.validade = validade;
    }

}