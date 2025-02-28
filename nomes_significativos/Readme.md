# Tópicos sobre Nomes Significativos

## 1. Propósito Claro

- O nome deve explicar o porquê da existência da variável, função ou classe.
- Deve evitar ambiguidades e deixar claro o objetivo sem necessidade de comentários.

## 2. Evitando Abreviações Confusas

- Prefira nomes completos a abreviações obscuras.
- **Exemplo:** Em vez de `val` ou `tmp`, use `totalValue` ou `temporaryData`.

## 3. Nomes com Contexto

- Os nomes devem refletir o contexto onde estão sendo usados.
- **Exemplo ruim:** `value` (sem contexto).
- **Exemplo bom:** `invoiceTotal`.

## 4. Use Substantivos para Classes e Objetos

- Classes e objetos devem ser nomeados com substantivos.
- **Exemplo:** `User`, `OrderProcessor`.

## 5. Use Verbos para Métodos

- Métodos devem descrever ações, usando verbos ou frases verbais.
- **Exemplo:** `calculateTotal()`, `sendEmail()`.

## 6. Nomes Consistentes

- Siga padrões consistentes em todo o projeto.
- **Exemplo:** Se usar `getUser`, mantenha o padrão com `getOrder` em vez de `retrieveOrder`.

## 7. Evitar Informações Redundantes

- Não repita o mesmo conceito em nomes.
- **Exemplo ruim:** `userObject`.
- **Exemplo bom:** `user`.

## 8. Tamanho Adequado do Nome

- Nomes curtos para variáveis locais e nomes descritivos para elementos globais ou complexos.
- **Exemplo:**
  - **Variável local:** `i` (contador de um loop simples).
  - **Função complexa:** `calculateMonthlyRevenue`.

# Dicas para Melhorar os Nomes

## 1. Pense em Quem Vai Ler

- Considere o leitor como o próximo desenvolvedor (ou você no futuro).
- Pergunte: "Eu entenderia este nome daqui a 6 meses?".

## 2. Prefira Clareza a Brevidade

- Um nome longo e claro é melhor do que um curto e confuso.
- **Exemplo ruim:** `calc()`.
- **Exemplo bom:** `calculateInterest()`.

## 3. Evite Palavras Genéricas

- Palavras como `data`, `info` ou `stuff` não dizem muito.
- Seja específico: `userData` é melhor que `data`.

## 4. Refatore Quando Necessário

- Ao entender melhor o código, renomeie variáveis, funções ou classes para refletir o novo entendimento.

## 5. Teste com Frases

- Leia o código em voz alta e veja se faz sentido como uma frase.
- **Exemplo:** `if (user.isActive())` é mais claro do que `if (isUserActive(user))`.

## 6. Documente Padrões de Nomeação

- Tenha um guia compartilhado para o time, promovendo consistência.

## 7. Ferramentas e Revisões

- Use linters ou ferramentas de análise estática para verificar padrões.
- Nas revisões de código, peça feedback sobre a clareza dos nomes.

## 8. Evite Contextos Desnecessários

- Se o contexto já está claro, não repita.
- **Exemplo:**
  - Nome da classe: `Customer`.
  - **Evite:** `customer.customerName`.
  - **Use:** `customer.name`.
