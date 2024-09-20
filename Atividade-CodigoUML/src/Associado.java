public class Associado extends Vendas {
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String nome;

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    private String dataNascimento;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    private int idUsuario;


    public void cancelarAssociacao(String motivo){

    }

    public void comprar(String produto, double valor){
    }

    public void quitarPagamento(double valor){

    }

    public void depositar(double valor){

    }

    public void retirarSaldo(double valor){

    }
    public boolean confirmarAcao(boolean comfirma){
        return true;
    }
}
