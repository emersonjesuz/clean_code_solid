# Tópicos sobre Tratamento de Erros

## 1. Evite o Uso de Códigos de Retorno

Em vez de usar códigos de retorno, prefira lançar exceções para lidar com erros.

### Exemplo:

```javascript
// Ruim: Códigos de retorno
function process(data) {
  if (!data) return -1; // Erro
  // Lógica principal
  return 0; // Sucesso
}

// Bom: Usando exceções
function process(data) {
  if (!data) throw new Error("Dados inválidos");
  // Lógica principal
}
```

## 2. Use Exceções para Condições Excepcionais

Exceções devem ser usadas apenas para situações anormais ou inesperadas, não para controle de fluxo.

## 3. Forneça Mensagens de Erro Significativas

Mensagens de erro devem ser claras, específicas e fornecer contexto suficiente.

- **Exemplo ruim:** `Error 404`.
- **Exemplo bom:** `Usuário com ID 123 não encontrado no banco de dados`.

## 4. Evite Swallowing de Exceções

Não ignore exceções silenciosamente, pois isso dificulta o rastreamento de problemas.

### Exemplo ruim:

```javascript
try {
  executeTask();
} catch (error) {
  // Silêncio absoluto: erro ignorado
}
```

## 5. Seja Específico ao Capturar Exceções

Evite capturar exceções genéricas; prefira capturar tipos específicos, se a linguagem permitir.

### Exemplo em Python:

```python
try:
    process_data()
except ValueError:
    print("Erro nos dados de entrada.")
```

## 6. Use Finally para Limpeza

Utilize o bloco `finally` para garantir a liberação de recursos, como arquivos ou conexões de banco de dados.

### Exemplo:

```javascript
try {
  const connection = db.connect();
  performQuery(connection);
} catch (error) {
  console.error("Erro durante a consulta:", error);
} finally {
  db.close();
}
```

## 7. Propague Erros com Contexto

Ao relançar uma exceção, adicione contexto adicional sobre onde ocorreu o erro.

### Exemplo:

```javascript
try {
  readFile();
} catch (error) {
  throw new Error(`Falha ao ler o arquivo: ${error.message}`);
}
```

## 8. Valide Dados Antes de Processar

Sempre que possível, evite exceções ao validar dados antes do processamento.

### Exemplo:

```javascript
if (!isValid(data)) {
  throw new Error("Os dados fornecidos são inválidos.");
}
```

## Dicas para Melhorar o Tratamento de Erros

### 1. Crie Exceções Específicas

Defina classes de erro personalizadas para diferentes tipos de problemas.

```javascript
class DatabaseError extends Error {}
class ValidationError extends Error {}
```

### 2. Centralize o Tratamento de Erros

Use middlewares, interceptadores ou handlers globais para centralizar o tratamento de erros em sistemas web.

**Exemplo com Express:**

```javascript
app.use((error, req, res, next) => {
  console.error(error);
  res.status(500).json({ message: error.message });
});
```

### 3. Log de Erros

Sempre registre erros para monitoramento e depuração.

Use bibliotecas como Winston, Log4j ou serviços como Sentry.

### 4. Forneça Feedback ao Usuário

Informe o usuário sobre o erro de maneira amigável e, se possível, ofereça soluções.

**Exemplo:** "Erro ao processar sua solicitação. Tente novamente mais tarde."

### 5. Não Revele Detalhes Internos

Ao exibir mensagens de erro para o usuário final, evite mostrar detalhes sensíveis, como stack traces.

### 6. Use Tratamento de Erros para Garantir Resiliência

Sempre planeje o que fazer em caso de erro. Por exemplo:

- **Retry automático**.
- **Fallbacks** (ex.: usar um cache em vez de acessar o banco de dados).

### 7. Teste Cenários de Erro

Crie testes unitários e de integração que simulem falhas e garantam que o sistema se comporte corretamente.

### 8. Trate Exceções Assíncronas

Em linguagens assíncronas, como JavaScript, trate erros em promessas ou `async/await`.

```javascript
async function fetchData() {
  try {
    const data = await api.getData();
    return data;
  } catch (error) {
    console.error("Erro ao buscar dados:", error);
  }
}
```

## Exemplo de Código Antes e Depois

### Antes: Código com Tratamento Frágil

```javascript
function processData(data) {
  try {
    const result = data.map((item) => item.value);
    return result;
  } catch (error) {
    console.log("Algo deu errado.");
  }
}
```

### Depois: Código Robusto e Informativo

```javascript
function processData(data) {
  if (!Array.isArray(data)) {
    throw new TypeError("O parâmetro 'data' deve ser um array.");
  }

  try {
    return data.map((item) => item.value);
  } catch (error) {
    console.error("Erro ao processar os dados:", error.message);
    throw new Error("Processamento falhou. Verifique os dados de entrada.");
  }
}
```
