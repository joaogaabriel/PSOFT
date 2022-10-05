public class Lote {
    private String validade;
    private Integer quantidade;
    private Produto produto;
    public Lote(String validade, Integer quantidade, Produto produto) {
        this.validade = validade;
        this.quantidade = quantidade;
        this.produto = produto;
    }
}