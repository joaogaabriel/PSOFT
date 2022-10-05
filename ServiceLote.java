public class ServiceLote {
    RepositoryLote repositorio = new RepositoryLote();
    private void criarLotes(String validade, Integer quantidade, Produto produto){
        Lote novoLote = new Lote(validade,quantidade,produto);
        repositorio.listadeLotes.add(novoLote);
    }
    void ListarLotes(){
        repositorio.listadeLotes.get(1);
    }
}
