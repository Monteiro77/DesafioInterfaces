# 📚 Desafios de Fixação - Interface e DDD em Java

## Informações
- **Nome:** Vinícius Monteiro Araújo
- **RM:** 555088
- **Professor:** Salatiel Marinho
- **Data:** 16/04/2025
- **Tema:** Fixação dos conceitos de **Interface** e **Domain Driven Design** com Java

Este repositório contém a resolução dos 3 desafios propostos em aula, com foco na aplicação de boas práticas de orientação a objetos, uso de interfaces, divisão por camadas (`model`, `service`, `repository`) e implementação de testes unitários com JUnit 5.

> ✅ A entrega dos desafios será feita via link do repositório no Teams e contará como presença na aula!

---

## ✅ Desafio 1: Gestão de Campeonato de Futebol Feminino

### Objetivo:
Criar um sistema para gerenciar **times**, **jogadoras**, **partidas** e a **pontuação do campeonato**.

### Regras de Negócio:
- Cadastro de times com cidade e lista de jogadoras
- Cadastro de jogadoras com nome, idade, posição e número
- Registro de partidas entre dois times com placar final
- Cálculo automático de pontuação:
  - Vitória: +3 pontos
  - Empate: +1 ponto
  - Derrota: 0 pontos
- Exibição da tabela de classificação atualizada

### Funcionalidades:
- Cadastrar times e jogadoras
- Registrar jogos e placar
- Ver classificação geral

---

## ✅ Desafio 2: Cadastro e Acompanhamento de Pessoas com Necessidades Especiais

### Objetivo:
Desenvolver um sistema para cadastrar **pessoas com deficiência** e registrar seus **atendimentos**.

### Regras de Negócio:
- Cadastro de pessoas com nome, idade, tipo de deficiência, grau e endereço
- Registro de atendimentos com data, tipo e profissional
- Filtros por tipo de deficiência e grau
- Geração de relatórios individuais por pessoa

### Funcionalidades:
- Cadastrar e listar pessoas
- Registrar atendimentos
- Filtrar por tipo/grau de deficiência
- Gerar relatórios por pessoa

---

## ✅ Desafio 3: Sistema de Controle de Pedágios

### Objetivo:
Simular o controle de veículos que passam por praças de pedágio no estado de São Paulo.

### Regras de Negócio:
- Cadastro de veículos com placa, tipo (carro, moto, caminhão) e eixos
- Cada praça tem localização e tarifa-base
- Cálculo do valor:
  - Carro: tarifa-base
  - Moto: 50% da tarifa-base
  - Caminhão: tarifa-base × número de eixos
- Registro de passagens de veículos
- Relatórios por praça com total arrecadado

---

## 🧪 Testes Unitários

Todos os desafios possuem testes unitários implementados com **JUnit 5**, focando nas regras principais de negócio, como:

- Cadastro de jogadoras e times
- Cálculo de pontuação de campeonato
- Registro e filtragem de atendimentos
- Cálculo de tarifa de pedágio por tipo de veículo

---

## 💻 Tecnologias Utilizadas

- Java 17+
- JUnit 5 (testes)
- Maven ou Gradle (build)
- Interface + Orientação a Objetos
- Domain Driven Design (DDD) simples

---

## ▶️ Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/desafios-interface-ddd.git
   cd desafios-interface-ddd
