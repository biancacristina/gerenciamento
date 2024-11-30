package gerenciamentoveiculo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o nome do proprietário: ");
        String nomeProprietario = scanner.nextLine();

        
        System.out.print("Digite a marca do carro: ");
        String marcaCarro = scanner.nextLine();
        System.out.print("Digite o modelo do carro: ");
        String modeloCarro = scanner.nextLine();
        System.out.print("Digite o ano do carro: ");
        int anoCarro = scanner.nextInt();
        System.out.print("Digite a quantidade de portas do carro: ");
        int quantidadePortas = scanner.nextInt();


        Proprietario proprietario = new Proprietario(nomeProprietario);
        Carro carro = new Carro(marcaCarro, modeloCarro, anoCarro, quantidadePortas);
        
        
        proprietario.adicionarVeiculo(carro);


        proprietario.imprimirVeiculos();
        
        scanner.close();
    }
}
