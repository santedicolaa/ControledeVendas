public class Produto {
    private Integer codigo;
    private String descricao;
    private float valorProduto;

    public Produto(Integer codigo, String descricao, float valorProduto) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valorProduto = valorProduto;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(float valorProduto) {
        this.valorProduto = valorProduto;
    }
}
