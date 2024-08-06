# Authorization Service

É uma API simples que responde a requisições do tipo GET no endereço 
`http://localhost:8080/authorize` para verificar a autorização.

## Funcionalidades

- **GET /authorize**: Verifica se a autorização é bem-sucedida ou não.

### Respostas

- **Autorização Falhou**
    - **Status HTTP:** 403 Forbidden
    - **Corpo da Resposta:**
      ```json
      {
        "status": "fail",
        "data": {
          "authorization": false
        }
      }
      ```

- **Autorização Bem-Sucedida**
    - **Status HTTP:** 200 OK
    - **Corpo da Resposta:**
      ```json
      {
        "status": "success",
        "data": {
          "authorization": true
        }
      }
      ```

## Como Executar

1. **Clone o Repositório**
```bash
   git clone https://github.com/PedroMagno11/Authorization-Service.git
   cd Authorization-Service
```
Compile e Execute a Aplicação
````bash
./mvnw spring-boot:run
````
## Acesse a API

Abra seu navegador ou ferramenta de requisições HTTP (como Postman) e faça uma requisição GET para http://localhost:8080/authorize.
