public class Fachada {
    ServiceProduto servico = new ServiceProduto();
    private Produto novoPorduto;

    private void criarProdutos(String nome, String fabricante, double valor){
        servico.criarProdutos(nome, fabricante, valor);
    }
    private void criarLotes(String validade, Integer quantidade, Produto produto){


    }
}
