package FolhaPagamento;

public class Main {
    public static void main(String[] args) {
        FolhaPagamento pagamento = new FolhaPagamento();
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Cleber Santos";
        pagamento.valorHora = 4.5;
        pagamento.valorHoraExtra = 9.0;
        pagamento.quantidadeHorasExtras = 10;
        pagamento.quantidadeHorasTrabalhadas = 190;

        ContratoTrabalho contrato = pagamento.calcularSalario();

        System.out.printf(funcionario.nome + "salario é: " + contrato.resultadoFinal);


    }
}
