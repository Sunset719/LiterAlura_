# LiterAlura

# 📚 Gutendex API App

Aplicação Java com Spring Boot que consome a API pública [Gutendex](https://gutendex.com/) para busca de livros, persistência e exibição de dados.

---

## ✅ Funcionalidades
- 🔍 Buscar livros pelo título (via Gutendex API)
- 💾 Salvar o primeiro resultado no banco PostgreSQL
- 📋 Listar todos os livros salvos
- 📊 Exibir estatísticas básicas (futuro)

---

## 🚀 Tecnologias Utilizadas
- Java 24
- Spring Boot 3.5.3
- Spring Data JPA
- Maven
- PostgreSQL
- API Gutendex
- IntelliJ IDEA


---


## ▶️ Como executar o projeto
```bash
# Clone o repositório
git clone https://github.com/seu-usuario/gutendex-api-app.git
cd gutendex-api-app

# Compile e rode
./mvnw spring-boot:run
```

---

## 🔗 Endpoints disponíveis

| Método | Endpoint                      | Descrição                          |
|--------|-------------------------------|-----------------------------------|
| GET    | `/api/livros/search?q=nome`  | Busca e salva livro               |
| GET    | `/api/livros`                | Lista todos os livros salvos      |

---

## 🧪 Testes com Postman ou navegador
- [http://localhost:8080/api/livros/search?q=machado+de+assis](http://localhost:8080/api/livros/search?q=machado+de+assis)
- [http://localhost:8080/api/livros](http://localhost:8080/api/livros)
- Swagger UI: [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

---


