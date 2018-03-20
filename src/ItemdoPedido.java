import java.io.PrintStream;

public class ItemdoPedido {
    private int sequencial;
    private int qtd;
    private Produto produto;
    private float valoritem;

    public ItemdoPedido(int sequencial, Produto produto, int qtd) {
        this.sequencial = sequencial;
        this.qtd = qtd;
        this.produto = produto;
        this.valoritem = qtd * produto.getValorProduto();
    }

    public int getSequencial() {
        return sequencial;
    }

    public void setSequencial(int sequencial) {
        this.sequencial = sequencial;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public float getValoritem() {
        return valoritem;
    }

    public void setValoritem(float valoritem) {
        this.valoritem = valoritem;
    }

    @Override
    public String toString() {
        System.out.printf("%4d  %-49s %4d  %14.2f  %14.2f", getSequencial(), getProduto().getDescricao(), getQtd(),
                getProduto().getValorProduto(), getValoritem());
        System.out.println();
        return super.toString();

    }
}
