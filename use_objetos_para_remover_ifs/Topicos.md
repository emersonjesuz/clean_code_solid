# Use Objetos para Remover Ifs

O uso excessivo de estruturas condicionais `if` pode tornar o código difícil de manter e entender. Em muitos casos, é possível substituí-los por objetos e estruturas mais organizadas.

## Benefícios de Remover Ifs

- **Código mais legível**: Evita longos blocos de condições aninhadas.
- **Facilidade de manutenção**: Adicionar novos casos se torna mais simples.
- **Melhor desempenho**: Em algumas situações, elimina verificações desnecessárias.
- **Aderência ao princípio Open/Closed**: Permite a extensão do código sem modificar o existente.

## Exemplo Antes e Depois

### Antes: Uso Excessivo de Ifs

```javascript
function calcularDesconto(tipoCliente, valor) {
  if (tipoCliente === "comum") {
    return valor * 0.05;
  } else if (tipoCliente === "vip") {
    return valor * 0.1;
  } else if (tipoCliente === "premium") {
    return valor * 0.15;
  } else {
    return 0;
  }
}
```

### Depois: Substituindo Ifs por Objetos

```javascript
const regrasDeDesconto = {
  comum: (valor) => valor * 0.05,
  vip: (valor) => valor * 0.1,
  premium: (valor) => valor * 0.15,
  default: () => 0,
};

function calcularDesconto(tipoCliente, valor) {
  return (regrasDeDesconto[tipoCliente] || regrasDeDesconto.default)(valor);
}
```

## Outros Exemplos de Aplicação

### Substituir Ifs por Objetos de Configuração

```javascript
const operacoes = {
  soma: (a, b) => a + b,
  subtracao: (a, b) => a - b,
  multiplicacao: (a, b) => a * b,
  divisao: (a, b) => a / b,
};

function calcular(operacao, a, b) {
  return operacoes[operacao] ? operacoes[operacao](a, b) : null;
}
```

### Substituir Switch Case por Objetos

```javascript
const mensagens = {
  sucesso: "Operação realizada com sucesso!",
  erro: "Ocorreu um erro na operação.",
  alerta: "Atenção! Verifique os dados informados.",
};

function exibirMensagem(tipo) {
  console.log(mensagens[tipo] || "Mensagem não definida.");
}
```

## Conclusão

O uso de objetos para substituir ifs torna o código mais modular, legível e fácil de manter. Sempre que possível, evite condicionais desnecessárias e prefira abordagens mais organizadas e escaláveis.
