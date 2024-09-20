import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Associado associado1 = new Associado();
        associado1.setNome("Joao");
        associado1.setIdUsuario(12345);
        associado1.setProduto("celular");
        associado1.setPreco(1000.00);

        Associado associado2 = new Associado();
        associado2.setNome("Maria");
        associado2.setIdUsuario(56789);
        associado2.setProduto("carro");
        associado2.setPreco(25000.00);

        associado1.vender("Celular", 1000.00);
        associado2.vender("Carro", 25000.00);

        System.out.println("O usuario " + associado1.getNome() + " esta vendendo um "
                + associado1.getProduto() + " por " + associado1.getPreco() + " reais");

        System.out.println("O usuario " + associado2.getNome() + " esta vendendo um "
                + associado2.getProduto() + " por " + associado2.getPreco() + " reais");

        associado1.comprar("carro", 25000.00);

        System.out.println("O associado " + associado1.getNome() +
                " comprou o " + associado2.getProduto() + " de " + associado2.getNome());

        associado1.emitirComprovante();
    }
}




