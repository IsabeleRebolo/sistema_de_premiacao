import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner ler = new Scanner (System.in);

        String nomeCliente;
        String unidade;
        int telCliente;
        int valorCompra;
        int dia;

        System.out.printf("Digite o nome do cliente: \n");
        nomeCliente=ler.next();

        System.out.printf("Digite o telefone do cliente:\n");
        telCliente=ler.nextInt();

        System.out.printf("Digite o valor da compra realizada:\n");
        valorCompra=ler.nextInt();

        System.out.printf ("Digite o nome da Unidade do Mercado:\n");
        unidade=ler.next();

        System.out.printf("Digite o dia da compra realizada:\n");
        dia=ler.nextInt();


        Cliente cliente = new Cliente();
                cliente.setNomeCliente(nomeCliente);
                cliente.setTelCliente(telCliente);

       DadosCompra dados = new DadosCompra ();
                dados.setData(dia);
                dados.setUnidade(unidade);
                dados.setValorCompra(valorCompra);
                dados.setPessoa(cliente);

       System.out.printf(dados.getPessoa().getNomeCliente() + " " + "você gastou R$" + dados.getValorCompra() + " na unidade " + dados.getUnidade() + " ,portanto, ");

                dados.toPremio();




    }




}
