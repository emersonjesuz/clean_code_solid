# Use Const para Tornar Seus Ifs Mais Legíveis

## Problema

Em muitos códigos, encontramos condições utilizando valores "mágicos", o que torna o código menos legível e mais difícil de manter.

### Exemplo Ruim

```javascript
function calcularDesconto(tipoCliente, valor) {
  if (tipoCliente === "premium") {
    return valor * 0.9;
  } else if (tipoCliente === "vip") {
    return valor * 0.8;
  } else {
    return valor;
  }
}
```

Nesse exemplo, os valores "premium" e "vip" estão espalhados pelo código sem contexto claro.

## Solução

Usar constantes melhora a legibilidade e facilita a manutenção do código.

### Exemplo Melhorado

```javascript
const TIPOS_CLIENTE = {
  PREMIUM: "premium",
  VIP: "vip",
};

function calcularDesconto(tipoCliente, valor) {
  if (tipoCliente === TIPOS_CLIENTE.PREMIUM) {
    return valor * 0.9;
  }
  if (tipoCliente === TIPOS_CLIENTE.VIP) {
    return valor * 0.8;
  }
  return valor;
}
```

### Benefícios:

- Evita valores "mágicos" no código.
- Facilita a refatoração.
- Torna o código mais legível e intuitivo.

Sempre que possível, utilize `const` para armazenar valores fixos e tornar suas condições mais fáceis de entender!
