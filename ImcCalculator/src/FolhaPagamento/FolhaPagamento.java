package FolhaPagamento;

public class FolhaPagamento {

    final static double ADICIONAL_SALARIO_PORCENTAGEM = 10;
    final static double TOTAL_PORCENTAGEM = 100;
    double quantidadeHorasTrabalhadas;
    double quantidadeHorasExtras;
    double valorHora;
    double valorHoraExtra;
    Funcionario funcionario = new Funcionario();

    ContratoTrabalho calcularSalario(){
        ContratoTrabalho contrato = new ContratoTrabalho();
        funcionario.getQuantidadeFilhos();

        contrato.valorHora = valorHora;
        contrato.valorHoraExtra = valorHoraExtra;
        contrato.resultadoParcial = (quantidadeHorasTrabalhadas * valorHora) + (quantidadeHorasExtras * valorHoraExtra);
        contrato.resultadoFinal = ((ADICIONAL_SALARIO_PORCENTAGEM / TOTAL_PORCENTAGEM) * funcionario.quantidadeFilhos) *
                contrato.resultadoParcial + contrato.resultadoParcial;

        return contrato;

    }
}
