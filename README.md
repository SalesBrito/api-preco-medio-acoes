# 📈 API Preço Médio de Ações

Serviço REST em Java (Spring Boot) que calcula o preço médio ponderado de compras e vendas de ações.

---

## 💡 Funcionalidades

- Registra operações de compra e venda (`Operacao`)
- Calcula o preço médio ponderado com base nas operações registradas
- Exposição de endpoint via `OperacaoController` para envio e retorno dos cálculos

---

## 🧩 Estrutura do Projeto

- `Operacao.java`: modelo de operação (tipo, quantidade, preço, data)
- `CalculadoraPrecoMedio.java`: lógica de cálculo do preço médio
- `OperacaoController.java`: endpoint REST para receber operações e retornar resultado
- `application.properties`: configurações da aplicação
- `pom.xml`: dependências Maven

---

## 🚀 Como rodar

```bash
git clone https://github.com/SalesBrito/api-preco-medio-acoes.git
cd api-preco-medio-acoes
./mvnw spring-boot:run
