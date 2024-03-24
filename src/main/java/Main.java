public class Main {
    public static void main(String[] args) {
        System.out.println("Lojas Quase Dois - Tabela de preços");

        // Loop para calcular e exibir os preços de 1 a 50 produtos
        for (int quantidade = 1; quantidade <= 50; quantidade++) {
            double preco = quantidade * 1.99; // Preço de cada quantidade de produtos
            System.out.println(quantidade + " - R$ " + preco);
        }
    }
}
