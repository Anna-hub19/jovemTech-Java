# 📦 Estoque Fácil

Sistema de controle de estoque em **Java** (terminal), com login, controle de acesso e CRUD de produtos. Projeto desenvolvido no curso **Jovem Tech**.

## Funcionalidades

- Login de usuário
- Listar, cadastrar, editar e remover produtos
- Operações de escrita protegidas por senha de administrador

## Tecnologias e conceitos

**Java** · POO · Interface · Encapsulamento · `ArrayList` · `Scanner`

## Estrutura

```
AppEstoque.java   # menu e login
Estoque.java      # regras do estoque (implementa Iestoque)
Iestoque.java     # contrato dos métodos
Produto.java      # entidade produto
```

Acesso de teste: usuário `admin` / senha `123` / senha de administrador `456`.
