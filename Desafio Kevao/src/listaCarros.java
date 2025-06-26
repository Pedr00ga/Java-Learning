public class listaCarros {

    static final int QUANTIDADE_LISTA = 5;

    Carros[] lista = new Carros[QUANTIDADE_LISTA];

    int tamanhoLista = 0;

    void adicionar(Carros carro){
        if(tamanhoLista == lista.length){
            Carros[] novoLista = new Carros[lista.length * 2];

            for ( int i = 0; i < lista.length; i++){
                novoLista[i] = lista[i];
            }
            lista = novoLista;
        }

        lista[tamanhoLista] = carro;
        tamanhoLista++;
    }
}