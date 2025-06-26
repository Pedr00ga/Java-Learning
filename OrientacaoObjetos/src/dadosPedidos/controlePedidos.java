package dadosPedidos;

import OrientacaoObjetos.src.dadosPedidos.Pedidos;

public class controlePedidos {
    public static void main(String[] args) {
        Pedidos pedidos = new Pedidos();

        pedidos.setCodigo(123456);
        pedidos.setDesconto(15);
        pedidos.setSubTotal(127.0);

        System.out.printf("O produto comprado de código " + pedidos.getCodigo() + " tem um total valor total de " + pedidos.getSubTotal()
        + " com um desconto de " + pedidos.getDesconto() + " porcento " + "o valor total é de " + pedidos.getTotal());

    }
}
