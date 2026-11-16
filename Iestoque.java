public interface Iestoque {
   void listar();
    void cadastrar(Produto produto);
    boolean editar(String nomeAntigo, Produto novoProduto);
    boolean excluir(String nome);
}
