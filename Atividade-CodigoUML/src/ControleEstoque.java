public class ControleEstoque {

    public String getProdutos() {
        return produtos;
    }

    public void setProdutos(String produtos) {
        this.produtos = produtos;
    }

    private String produtos;
    private int quantidadeEstoque;
    private int idProduto;

    public  String exibirEstoque(){
        return produtos;
    }

    public boolean emEstoque(String produto) {
        if (quantidadeEstoque < 1) {
            return true;
        } else {
            return false;
        }
    }

    public void renomearProduto(String produto) {
        ;
    }

    public void adicionarAoEstoque(){
        quantidadeEstoque++;
    }

    public void removerDoEstoque(){
        quantidadeEstoque--;
    }


}

