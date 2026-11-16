import java.util.Scanner;

public class AppEstoque {

    static Scanner entrada = new Scanner(System.in);
    static Estoque estoque = new Estoque();

    public static void main(String[] args) {
        FazerLogin();
    }

    public static Boolean FazerLogin() {
        String usuarioCorreto = "admin";
        String senhaCorreta = "123";
        String senhaCorretaAdmin = "456";
        System.out.println("usuario: ");
        String usuario = entrada.nextLine();
        System.out.println("senha: ");
        String senha = entrada.nextLine();

        if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
            System.out.println("Login realizado com sucesso!");
            int opcao;

            System.out.println("----ESTOQUE FACIL----");
            System.out.println("1- listar produto");
            System.out.println("2- adicionar produto");
            System.out.println("3- Editar produto");
            System.out.println("4- remover produto");
            System.out.println("0- sair");

            System.out.println("escolha uma opção:");
            opcao = entrada.nextInt();
            entrada.nextLine();
            while (opcao != 0) {
                if (opcao == 1) {
                    estoque.listar();
                } else if (opcao == 2) {
                    System.out.println("adicione a senha de administrador");
                    String senhaAdmin = entrada.nextLine();
                    if (senhaAdmin.equals(senhaCorretaAdmin)) {
                        System.out.println("nome do produto:");
                        String nome = entrada.nextLine();
                        System.out.println("preço:");
                        double preco = entrada.nextDouble();
                        System.out.println("quantidade:");
                        int quantidade = entrada.nextInt();
                        entrada.nextLine();

                        estoque.cadastrar(new Produto(nome, preco, quantidade));
                        System.out.println("Produto cadastrado com sucesso!");
                    } else {
                        System.out.println("usuario não autorizado");
                    }
                } else if (opcao == 3) {
                    System.out.println("adicione a senha de administrador:");
                    String senhaAdmin = entrada.nextLine();
                    if (senhaAdmin.equals(senhaCorretaAdmin)) {
                        System.out.println("qual produto deseja editar?");
                        String produtoEditar = entrada.nextLine();
                        System.out.println("novo nome:");
                        String nome = entrada.nextLine();
                        System.out.println("novo preço:");
                        double preco = entrada.nextDouble();
                        System.out.println("nova quantidade:");
                        int quantidade = entrada.nextInt();
                        entrada.nextLine();

                        boolean editou = estoque.editar(produtoEditar, new Produto(nome, preco, quantidade));
                        if (editou) {
                            System.out.println("Produto editado com sucesso!");
                        }
                    } else {
                        System.out.println("usuario não autorizado");
                    }
                } else if (opcao == 4) {
                    System.out.println("adicione a senha de administrador");
                    String senhaAdmin = entrada.nextLine();
                    if (senhaAdmin.equals(senhaCorretaAdmin)) {
                        System.out.println("qual produto deseja excluir?");
                        String produtoExcluir = entrada.nextLine();

                        boolean excluiu = estoque.excluir(produtoExcluir);
                        if (excluiu) {
                            System.out.println("Produto excluído com sucesso!");
                        }
                    } else {
                        System.out.println("usuario não autorizado");
                    }
                } else {
                    System.out.println("opção invalida");
                }

                System.out.println("escolha uma opção:");
                opcao = entrada.nextInt();
                entrada.nextLine();
            }
            return true;
        } else {
            System.out.println("senha ou usuario incorreto!");
            return false;
        }
    }
}