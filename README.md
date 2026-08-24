# 🔗 Lista Duplamente Encadeada (Linear)

---

### Sobre o Projeto

Este projeto foi desenvolvido como um estudo prático e aprofundado sobre Estruturas de Dados Lineares não-contíguas. O objetivo principal foi implementar, do zero, uma Lista Duplamente Encadeada na linguagem Java, focando na manipulação segura de ponteiros duplos e na alocação dinâmica de memória, conceitos indispensáveis para o desenvolvimento de softwares otimizados na Engenharia da Computação.

### Sobre o Sistema

O sistema é uma aplicação interativa de terminal (CLI) que simula um gerenciador de produtos. 

A arquitetura foi dividida em três partes principais: a classe `No` (que armazena o valor do produto e as referências para o nó `anterior` e `proximo`), a classe controladora `ListaDuplamenteEncadeada` e a classe principal com o menu de execução. O grande diferencial técnico desta implementação é o algoritmo de exclusão, que foi desenhado para tratar corretamente todos os cenários críticos (casos de borda) da estrutura: remoção de nó único, remoção na cabeça (início), remoção na cauda (fim) e remoção no meio da lista, garantindo a integridade dos ponteiros e evitando falhas de memória (NullPointerException).

### Funcionalidades

⚙️ **Estrutura de Dados**
* **Inserção Dinâmica:** Alocação de novos nós sempre ao final da estrutura, atualizando os ponteiros duplos.
* **Remoção por Valor:** Busca sequencial pelo nome do produto (ignorando diferenças de maiúsculas/minúsculas) com reestruturação automática da cadeia de ponteiros.
* **Travessia Bidirecional:** Exibição visual da estrutura mostrando os nós e os limites (`null <-> [Produto] <-> null`).

🖥️ **Interação e UX (User Experience)**
* Menu interativo executado em laço de repetição (`while`).
* Tratamento de exceções (`try/catch`) para evitar quebras de sistema caso o usuário digite texto no lugar de números nas opções do menu.

### Tecnologias Utilizadas

* Java
* `java.util.Scanner` (Para leitura de fluxo de entrada do usuário)
