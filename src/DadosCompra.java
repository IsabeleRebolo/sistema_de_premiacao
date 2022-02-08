public class DadosCompra {

    private int valorCompra;
    private String unidade;
    private int data;
    private Cliente pessoa;

    public int getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(int valorCompra) {
        this.valorCompra = valorCompra;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Cliente getPessoa() {
        return pessoa;
    }

    public void setPessoa(Cliente pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public String toString() {
        return "DadosCompra{" +
                "valorCompra=" + valorCompra +
                ", unidade='" + unidade + '\'' +
                ", data=" + data +
                '}';
    }

    public void toPremio(){
        if (valorCompra>=1000){
            System.out.printf("você ganhou um premio");

        }else{
            System.out.println("você ainda não ganhou o premio");
        }

    }

}
