package gerenciamentoveiculo;

import java.util.List;
import java.util.ArrayList;

public class Proprietario {
    private String nome;
    private List<Veiculo> veiculos;

    public Proprietario(String nome) {
        this.nome = nome;
        this.veiculos = new ArrayList<>();
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Veiculo> getVeiculos() {
        return this.veiculos;
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void imprimirVeiculos() {
        System.out.println("Veículos do Proprietário " + nome + ":");
        for (Veiculo veiculo : veiculos) {
            veiculo.imprimirDados();
            System.out.println();
        }
    }
}
//comentario: A relação entre Proprietário e Veículo é uma agregação, pois o Veículo pode existir
//independentemente do Proprietário (e vice-versa), podendo ser compartilhado entre diferentes proprietários ou existir sem um proprietário.