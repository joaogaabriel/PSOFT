public class ServiceProduto {
    RepositoryProduto repositorio = new RepositoryProduto();
    private Produto novoProduto;

    void criarProdutos(String nome, String fabricante, double valor){
        Produto novoProduto = new Produto(nome, fabricante, valor);
        repositorio.listadeProdutos.add(novoProduto);
    }
    void ListarProdutos(){
        repositorio.listadeProdutos.get(1);
    }
}
