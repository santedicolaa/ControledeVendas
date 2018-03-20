import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        Produto p1 = new Produto(1, "Calota Aro 13pol", 25.00f);
        Produto p2 = new Produto(2, "Sensor Estacionamento", 1300.00f);
        Produto p3 = new Produto(3, "GPS Garmin", 1500.00f);

        Cliente c1 = new Cliente(1, "Egel Locadora", TipoCliente.PESSOA_JURIDICA);
        Cliente c2 = new Cliente(2, "Francisco José", TipoCliente.PESSOA_FISICA);

        Vendedor vd1 = new Vendedor(1, "José Emanuel", 5.00f);

        Veiculo v1 = new Veiculo(1, "Fiat Siena 2011", 32000.00f);
        Veiculo v2 = new Veiculo(2, "Wolks Gol 2011", 33000.00f);

        ItemdoPedido ip1 = new ItemdoPedido(1, p1, 4);
        ItemdoPedido ip2 = new ItemdoPedido(2, p2, 1);
        ItemdoPedido ip3 = new ItemdoPedido(3, p3, 1);

        PedidoVenda pv1 = new PedidoVenda(1, c1, vd1, v2);

        pv1.AddItemDoPedido(ip1);
        pv1.AddItemDoPedido(ip2);
        pv1.AddItemDoPedido(ip3);

        pv1.CalcularPedido();

        pv1.toString();
    }
}
