import java.util.ArrayList;

public class Estoque implements Iestoque {
    private ArrayList<Produto> produtos = new ArrayList<>();

    public Estoque() {
        produtos.add(new Produto("monitor", 800.00, 10));
        produtos.add(new Produto("teclado", 150.00, 25));
        produtos.add(new Produto("mouse", 80.00, 40));
    }

    @Override
    public void listar() {
           for (Produto p : produtos) {
            System.out.println(p);
        }
    }

    @Override
    public void cadastrar(Produto produtoCadastrar) {
        produtos.add(produtoCadastrar);

    }

    @Override
    public boolean editar(String produtoEditar, Produto novoProduto) {
        int indice = buscarIndice(produtoEditar);

        if (indice != -1) {

            produtos.set(indice, novoProduto);

            System.out.println(produtos);
            return true;

        } else {
            System.out.println("Produto não encontrado!");
            return false;
        }
    }

    @Override
    public boolean excluir(String produtoExcluir) {
        int indice = buscarIndice(produtoExcluir);

        if (indice != -1) {

            produtos.remove(indice);
            return true;

        } else {
            System.out.println("Produto não encontrado!");
            return false;
        }

    }
     private int buscarIndice(String nome) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getNome().equalsIgnoreCase(nome)) {
                return i;
            }
        }
        return -1;
    }

}