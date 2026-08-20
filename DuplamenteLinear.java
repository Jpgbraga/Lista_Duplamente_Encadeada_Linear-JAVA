import java.util.Scanner;


class No {
    String produto;
    No anterior;
    No proximo;

    public No(String produto) {
        this.produto = produto;
        this.anterior = null;
        this.proximo = null;
    }
}


class ListaDuplamenteEncadeada {
    private No inicio;
    private No fim;

    public ListaDuplamenteEncadeada() {
        this.inicio = null;
        this.fim = null;
    }

    
    public void inserirProduto(String produto) {
        No novoNo = new No(produto);

        if (inicio == null) {
            
            inicio = novoNo;
            fim = novoNo;
        } else {
            
            fim.proximo = novoNo;
            novoNo.anterior = fim;
            fim = novoNo;
        }
        System.out.println("=> Produto '" + produto + "' inserido com sucesso!");
    }

    
    public void excluirProduto(String produto) {
        if (inicio == null) {
            System.out.println("=> A lista já está vazia.");
            return;
        }

        No atual = inicio;

        
        while (atual != null) {
            if (atual.produto.equalsIgnoreCase(produto)) {
                // Caso 1: É o único elemento da lista
                if (atual == inicio && atual == fim) {
                    inicio = null;
                    fim = null;
                } 
                
                else if (atual == inicio) {
                    inicio = inicio.proximo;
                    inicio.anterior = null;
                } 
                
                else if (atual == fim) {
                    fim = fim.anterior;
                    fim.proximo = null;
                } 
                
                else {
                    atual.anterior.proximo = atual.proximo;
                    atual.proximo.anterior = atual.anterior;
                }
                
                System.out.println("=> Produto '" + produto + "' excluido com sucesso.");
                return; 
            }
            atual = atual.proximo;
        }
        
        System.out.println("=> Produto '" + produto + "' não encontrado na lista.");
    }

    
    public void exibirLista() {
        if (inicio == null) {
            System.out.println("=> A lista está vazia.");
            return;
        }

        No atual = inicio;
        System.out.print("=> Lista de Produtos: null <-> ");
        while (atual != null) {
            System.out.print("[" + atual.produto + "] <-> ");
            atual = atual.proximo;
        }
        System.out.println("null");
    }
}


public class DuplamenteLinear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
        int opcao = -1;

        while (opcao != 0) {
            
            System.out.println("\n-------------------------");
            System.out.println("LISTA DUPLAMENTE ENCADEADA");
            System.out.println("-------------------------");
            System.out.println("|0| Sair");
            System.out.println("|1| Inserir produto");
            System.out.println("|2| Excluir produto");
            System.out.println("|3| Exibir lista");
            System.out.println("-------------------------");
            System.out.print("Escolha sua opcao: ");

            
            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("=> Por favor, digite um número válido.");
                continue;
            }

          
            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do produto para inserir: ");
                    String produtoInserir = scanner.nextLine();
                    lista.inserirProduto(produtoInserir);
                    break;
                case 2:
                    System.out.print("Digite o nome do produto para excluir: ");
                    String produtoExcluir = scanner.nextLine();
                    lista.excluirProduto(produtoExcluir);
                    break;
                case 3:
                    lista.exibirLista();
                    break;
                case 0:
                    System.out.println("=> Encerrando o programa...");
                    break;
                default:
                    System.out.println("=> Opção inválida! Tente novamente.");
            }
        }
        
        scanner.close();
    }
}