package CompanhiaAerea;

public class Aeronave {

    int totalAssentos;
    int assentosReservados;
    Boolean ativo = true;

    int calcularAssentosDisponiveis(){
       int totalAssentosDisponvieis = totalAssentos - assentosReservados;
       return totalAssentosDisponvieis;
    }
     
    void reservarAssentos(int numeroAssentos){
        if (ativo){
            assentosReservados += numeroAssentos;
        }else{
            System.err.println("Aeronave desativada. Assentos não reservados");
        }
    }

    void desativar(){
        ativo = false;
    }

    void ativar(){
        ativo = true;
    }
}
