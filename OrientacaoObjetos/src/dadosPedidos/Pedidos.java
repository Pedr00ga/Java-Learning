package OrientacaoObjetos.src.dadosPedidos;

public class Pedidos {
    int codigo;
    int desconto;
    double subTotal;
    double total;

    public double getTotal() {
        return total = this.subTotal - ((this.subTotal * this.desconto) / 100);
    }

    public int getCodigo() {
        return codigo;
    }

    public int getDesconto() {
        return desconto;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }
}
