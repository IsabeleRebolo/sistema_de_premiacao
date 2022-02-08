public class Cliente {

    private String nomeCliente;
    private int telCliente;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getTelCliente() {
        return telCliente;
    }

    public void setTelCliente(int telCliente) {
        this.telCliente = telCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", telCliente=" + telCliente +
                '}';
    }
}
