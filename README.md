# 📋 Tarefas API

API desenvolvida em **Java** com o framework **Spring Boot** para gestão de uma lista de tarefas. Este projeto permite criar, listar, atualizar e remover tarefas, servindo como backend para aplicações de produtividade.

## 🚀 Tecnologias Utilizadas

* **Java** (versão 17 ou superior)
* **Spring Boot** (Web, JPA)
* **Maven** (Gerenciador de dependências)
* **Base de Dados** (Configurada via `application.properties`)

## 📦 Pré-requisitos

Antes de começar, certifique-se de ter instalado em sua máquina:
* [Java JDK](https://www.oracle.com/java/technologies/downloads/)
* [Maven](https://maven.apache.org/)
* [Git](https://git-scm.com/)

## 🔧 Como Executar o Projeto

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/Buraddomoon/Tarefas-API.git](https://github.com/Buraddomoon/Tarefas-API.git)
    ```

2.  **Entre na pasta do projeto:**
    ```bash
    cd Tarefas-API
    ```

3.  **Instale as dependências e compile:**
    ```bash
    mvn clean install
    ```

4.  **Execute a aplicação:**
    ```bash
    mvn spring-boot:run
    ```

A API estará disponível em `http://localhost:8080`.

## 🧪 Testando a API

Para testar as requisições, recomenda-se o uso de ferramentas como **[Postman](https://www.postman.com/downloads/)** ou **[Insomnia](https://insomnia.rest/download)**.

### Passos para testar:
1. Abra o Postman ou Insomnia.
2. Crie uma nova requisição (Request).
3. Selecione o método HTTP (GET, POST, PUT, DELETE) conforme a tabela abaixo.
4. Insira a URL (ex: `http://localhost:8080/tarefas`).
5. Para métodos **POST** e **PUT**, vá na aba **Body** -> **Raw** -> **JSON** e insira o objeto JSON da tarefa.

## 🔌 Endpoints Principais

| Método | Rota | Descrição |
| :--- | :--- | :--- |
| **GET** | `/tarefas` | Lista todas as tarefas cadastradas |
| **GET** | `/tarefas/{id}` | Busca uma tarefa específica pelo ID |
| **POST** | `/tarefas` | Cria uma nova tarefa |
| **PUT** | `/tarefas/{id}` | Atualiza os dados de uma tarefa existente |
| **DELETE** | `/tarefas/{id}` | Remove uma tarefa do sistema |

### Exemplo de JSON (Body para POST/PUT)

```json
{
  "titulo": "Finalizar API",
  "descricao": "Implementar os controllers e testar endpoints",
  "concluida": false
}
