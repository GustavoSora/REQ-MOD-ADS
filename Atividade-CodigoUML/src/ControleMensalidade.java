public class ControleMensalidade {
    private double valorMensalidade;
    private String dataPagamento;
    private boolean pagamento;
    public String getBoleto() {
        return boleto;
    }

    private String boleto;
    private String status;

    public String gerarBoleto(double valorMensalidade, String dataPagamento) {
        this.boleto = boleto;
        return boleto;
    }

    public String MensalidadeVencimento(double valorMensalidade, String dataPagamento) {
        this.valorMensalidade = valorMensalidade;
        return dataPagamento;
    }

    public boolean validarPagamento(Boolean pagamento) {
        if(pagamento == true){
            return true;
        } else {
            return false;
        }
    }

}
