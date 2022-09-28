public class Lote {
    private String nome;
    private Integer quantidade;
    private Produto produto;
    public Lote(String nome, Integer quantidade, Produto produto) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.produto = produto;
    }
}