# Elimine Números e Palavras Mágicas

## O que são Números e Palavras Mágicas?

- Números ou strings literais que aparecem no código sem explicação.
- Difíceis de entender e manter.
- Podem causar bugs ao serem alterados sem contexto.

## Problemas de Usar Valores Mágicos

- **Falta de significado**: Quem lê o código não entende o motivo do valor.
- **Dificuldade de manutenção**: Mudanças requerem busca e substituição em todo o código.
- **Erros inadvertidos**: Valores duplicados podem ser alterados erroneamente.

## Solução: Substituir por Constantes

- Use constantes nomeadas para dar significado ao valor.

### Exemplo Ruim:

```javascript
if (user.role === 1) {
  grantAdminAccess();
}
```

### Exemplo Bom:

```javascript
const ADMIN_ROLE = 1;

if (user.role === ADMIN_ROLE) {
  grantAdminAccess();
}
```

## Quando Utilizar Enums

- Para representar um conjunto fixo de valores relacionados.
- Evita o uso de strings ou números mágicos espalhados pelo código.

### Exemplo com Enum:

```typescript
enum UserRole {
  ADMIN = 1,
  USER = 2,
  GUEST = 3,
}

if (user.role === UserRole.ADMIN) {
  grantAdminAccess();
}
```

## Conclusão

- Evite números e strings sem significado no código.
- Substitua por constantes ou enums.
- Melhora a legibilidade, manutenção e reduz erros.

Manter o código limpo é essencial para um desenvolvimento eficiente!
