# Padrões de Projeto - Visitor

---

## Estrutura do Projeto

- **Interface Elemento:** `Cliente` → Define o contrato base com o método `aceitar(Visitor)`, que atua como a porta de entrada. Ele obriga que qualquer tipo de cliente do banco saiba receber um "visitante" (a avaliação de crédito).
- **Elementos Concretos:** `ClienteComum`, `ClientePremium` e `ClienteEmpresarial` → Implementam a interface `Cliente`. O segredo da arquitetura está aqui: ao implementar o método `aceitar`, o cliente repassa a si mesmo para o visitante (`visitor.calcularCreditoComum(this)`), informando exatamente qual o seu tipo sem a necessidade de condicionais (`if/else`).
- **Interface Visitante:** `Visitor` → Declara uma operação de visita para cada classe concreta de elemento (`calcularCreditoComum`, `calcularCreditoPremium`, etc.). Isso garante que quem assinar este contrato deve obrigatoriamente saber lidar com todos os perfis de clientes do banco.
- **Visitante Concreto:** `CreditoVisitor` → Implementa a interface `Visitor` e guarda **toda a inteligência e regra de negócio**. Os cálculos matemáticos complexos (percentual sobre salário, faturamento ou investimentos) ficam centralizados aqui, mantendo as classes de clientes limpas e com a única responsabilidade de guardar os dados cadastrais.
- **Testes:** `CreditoVisitorTest` → Valida com JUnit a correta aplicação das regras matemáticas de crédito para cada tipo de cliente. Os testes provam que o mecanismo de "Double Dispatch" roteia a execução para o bloco de código correto de forma dinâmica e elegante.

---

## Diagrama de Classes

Abaixo está o diagrama de classes representando a estrutura da implementação. O grande destaque arquitetural é o padrão de **Double Dispatch (Despacho Duplo)**, evidenciado pelo cruzamento das setas de dependência: os `Clientes` concretos dependem do `Visitor` (para aceitá-lo), e o `CreditoVisitor` concreto depende dos `Clientes` (para extrair os dados e aplicar as regras financeiras). Isso garante extrema flexibilidade para adicionar novas lógicas de negócio no futuro sem alterar o núcleo das classes de entidade.

<img width="697" height="610" alt="Diagrama - Visitor" src="https://github.com/user-attachments/assets/f3613eb0-724a-49d1-a639-82b41df0146b" />
