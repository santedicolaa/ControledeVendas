import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PedidoVenda {
    private int codigo;
    private Date data;
    private ArrayList<ItemdoPedido> items;
    private Cliente cliente;
    private Vendedor vendedor;
    private Veiculo veiculo;
    private float valorPedido;

    public PedidoVenda(int codigo, Cliente cliente, Vendedor vendedor, Veiculo veiculo) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.veiculo = veiculo;
        this.items = new ArrayList<ItemdoPedido>();
        this.data = new Date();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public float getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(float valorPedido) {
        this.valorPedido = valorPedido;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void AddItemDoPedido(ItemdoPedido item){
        this.items.add(item);
    }

    public void CalcularPedido(){
        for(int i = 0; i<items.size();i++){
            this.valorPedido += items.get(i).getValoritem();
        }
        this.valorPedido += veiculo.getValor();
    }

    @Override
    public String toString() {
        SimpleDateFormat dms = new SimpleDateFormat("dd/MM/yyyy");
        String dataF = dms.format(this.data);

        System.out.println("\n");
        System.out.printf("%50s", "PEDIDO DE VENDA");
        System.out.println("\n");
        System.out.printf("%-45s  %45s","Numero do Pedido: " + getCodigo(), "Data do Pedido: " + dataF);
        System.out.println();
        System.out.printf("%-90s", "Cliente: " + this.cliente.getNome());
        System.out.println();
        System.out.printf("%-90s", "Vendedor: " + this.vendedor.getNome());
        System.out.println("\n");
        System.out.printf("%-75s %s %.2f", "Veiculo: " + this.veiculo.getDescricao(), "Valor: ", this.veiculo.getValor());
        System.out.println("\n");
        System.out.printf("%50s", "ITENS DO PEDIDO");
        System.out.println("\n");
        System.out.printf("%4.4s  %-49s %4.4s  %14.14s  %14.14s", "Item", "Descricao", "Qtd","Valor Unitario", "Valor Item");
        System.out.println();
        for(int i = 0;i<items.size();i++) {
            items.get(i).toString();
        }
        System.out.println("\n");
        for (int i = 0; i < 91; i++) {
            System.out.printf("-");
        }
        System.out.println();
        System.out.printf("%-22s %20.2f","Valor do Pedido: ", getValorPedido());
        System.out.println();
        System.out.printf("%-22s %20.2f","Comissao do Vendedor: ", (getValorPedido()/100)*this.vendedor.getComissao());
        System.out.println();
        return super.toString();
        }
}