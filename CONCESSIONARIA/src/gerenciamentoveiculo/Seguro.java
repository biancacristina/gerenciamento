package gerenciamentoveiculo;

public class Seguro {
    private String numero;
    private Veiculo veiculo;

    public Seguro(String numero, Veiculo veiculo) {
        this.numero = numero;
        this.veiculo = veiculo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public void imprimirDadosSeguro() {
        System.out.println("Seguro do Veículo:");
        System.out.println("Número do Seguro: " + numero);
        veiculo.imprimirDados();
    }
}

// comentario: A relação entre Seguro e Veículo é uma composição, porque a vida do seguro está vinculada à existência do veículo.
// Se o Veículo for excluído, o Seguro também deixa de ter sentido ou pode ser excluído junto com ele.