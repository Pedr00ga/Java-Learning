package CompanhiaAerea;

public class Main {
    public static void main(String[] args) {
        Aeronave aviaoAzul = new Aeronave();
        aviaoAzul.totalAssentos = 68;

        aviaoAzul.reservarAssentos(10);

        aviaoAzul.desativar();

        System.out.printf("AZUL (%s): %d assentos disponiveis%n",
                aviaoAzul.ativo ? "Ativo" : "Inativo", aviaoAzul.calcularAssentosDisponiveis());

    }
}
