# Tópicos sobre Funções e Métodos

## 1. Tamanho Ideal

- Funções devem ser pequenas.
- Idealmente, devem ter de 5 a 20 linhas, focando em um único propósito.

## 2. Um Único Propósito

- Cada função/método deve fazer apenas uma coisa e fazê-la bem.
- Evite funções que realizem múltiplas tarefas.

## 3. Nomeação Descritiva

- O nome de uma função deve descrever exatamente o que ela faz.
- Exemplo:
  - **Ruim**: `handleData()`
  - **Bom**: `validateUserData()`

## 4. Curto Alcance de Variáveis

- Use variáveis locais e minimize dependências globais dentro da função.
- Variáveis devem ser declaradas o mais próximo possível de onde são usadas.

## 5. Evite Muitos Parâmetros

- Idealmente, funções devem ter de 0 a 3 parâmetros.
- Para funções com muitos parâmetros, utilize objetos ou estruturas de dados.

## 6. Sem Efeitos Colaterais

- Funções devem evitar alterar variáveis externas ou produzir efeitos colaterais inesperados.
- Preferencialmente, retorne valores em vez de modificar o estado.

## 7. DRY (Don't Repeat Yourself)

- Evite duplicação de lógica.
- Se a mesma lógica é usada em vários lugares, transforme-a em uma função reutilizável.

## 8. Estrutura Lógica Clara

- Use uma estrutura de código clara e direta:
  - **Sequência Lógica**: Entrada → Processamento → Saída.
  - **Sem Else Desnecessário**: Prefira early returns.

### Exemplo:

```javascript
// Ruim
if (isValid) {
  process();
} else {
  return;
}

// Bom
if (!isValid) return;
process();
```

## 9. Classes como Primeira Opção

- Métodos em classes devem refletir a funcionalidade do objeto.
- Eles devem agir diretamente sobre o estado do objeto.

## 10. Funções Puras

- Sempre que possível, escreva funções puras:
  - O mesmo input sempre retorna o mesmo output.
  - Sem alterar o estado externo.

## Dicas para Melhorar Funções e Métodos

### 1. Refatore Sem Medo

- Refatore funções que estão grandes ou com muitas responsabilidades.
- Divida em várias funções menores, cada uma com um propósito específico.

### 2. Pense como o Leitor

- Leia suas funções como se estivesse lendo uma história.
- Pergunte: "Alguém que não conhece o código entenderia isso facilmente?"

### 3. Use Funções Privadas

- Sempre que possível, encapsule funções auxiliares como privadas (ou funções locais em linguagens que permitem).

### 4. Evite Aninhamentos Profundos

- Aninhamentos profundos tornam a lógica difícil de seguir.
- Prefira simplificar a lógica com early exits.

### 5. Teste Unitário

- Funções menores e bem projetadas são mais fáceis de testar.
- Escreva testes unitários para validar o comportamento esperado.

### 6. Documentação Natural

- O nome e o propósito da função devem ser tão claros que a documentação seja quase desnecessária.

### 7. Evite Comentários Desnecessários

- Se precisar de muitos comentários para explicar uma função, provavelmente o código precisa ser reescrito.

### 8. Use Padrões Consistentes

- Adote padrões claros de nomeação e estilo no seu projeto.
- Exemplo:
  - Para métodos de classes: `getUser`, `setUser`, `deleteUser`.
  - Para funções auxiliares: `formatDate`, `calculateTotal`.

### 9. Evite "Funções Deus"

- Uma função que faz tudo (ex: 200+ linhas) é difícil de entender e manter.
- Divida-a em funções menores, que deleguem responsabilidades.

## Exemplo de Código

### Antes: Código Confuso

```javascript
function processOrder(order) {
  if (order.status === "paid") {
    if (order.items.length > 0) {
      let total = 0;
      for (let item of order.items) {
        total += item.price;
      }
      order.total = total;
    }
  }
}
```

### Depois: Código Limpo

```javascript
function calculateTotal(order) {
  return order.items.reduce((total, item) => total + item.price, 0);
}

function processOrder(order) {
  if (!isOrderPaid(order)) return;
  if (hasItems(order)) {
    order.total = calculateTotal(order);
  }
}

function isOrderPaid(order) {
  return order.status === "paid";
}

function hasItems(order) {
  return order.items.length > 0;
}
```
