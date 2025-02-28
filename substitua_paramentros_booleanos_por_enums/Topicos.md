# Substitua Parâmetros Booleanos por Enums

## Por que evitar booleanos como parâmetros?

- Parâmetros booleanos podem tornar o código menos legível.
- Eles não deixam claro o significado do argumento ao chamar a função.
- Se houver mais de um booleano, a confusão aumenta.

## Benefícios do uso de Enums

- Código mais expressivo e legível.
- Evita erros ao passar valores errados.
- Permite maior flexibilidade para adicionar novos valores no futuro.

## Exemplo

### Código Ruim (usando booleano)

```javascript
function setUserStatus(user, isActive) {
  if (isActive) {
    user.status = "active";
  } else {
    user.status = "inactive";
  }
}

setUserStatus(user, true); // O que significa esse `true`?
```

### Código Melhor (usando Enum)

```javascript
enum UserStatus {
    ACTIVE = "active",
    INACTIVE = "inactive"
}

function setUserStatus(user, status) {
    user.status = status;
}

setUserStatus(user, UserStatus.ACTIVE); // Agora fica claro!
```

## Conclusão

Usar enums torna o código mais expressivo e reduz ambiguidades, melhorando a manutenibilidade e clareza do código.
