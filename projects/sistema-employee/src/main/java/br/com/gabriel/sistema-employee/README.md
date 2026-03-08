!

📘 README.md — Gerenciamento de Funcionários (Projeto em Java)
📌 Sobre o Projeto

Este projeto foi desenvolvido como parte dos meus estudos em Java.
O objetivo é criar um sistema simples de gerenciamento de funcionários, utilizando conceitos como:

Programação Orientada a Objetos (POO)

Listas (ArrayList)

Streams e filtros

Validação de dados

Ordenação de listas

Estrutura básica de menu interativo

O programa permite cadastrar funcionários e realizar diversas operações de consulta e atualização.

🧩 Funcionalidades
🔹 1. Cadastrar funcionários

O usuário informa:

ID (não pode repetir)

Nome

Salário

Departamento

Os funcionários são armazenados em uma lista.

🔹 2. Aumentar salário

O usuário escolhe o ID de um funcionário e define um percentual de aumento.

🔹 3. Mudar funcionário de departamento

Atualiza o departamento para um funcionário selecionado.

🔹 4. Remover funcionário

Remove um funcionário pelo ID.

🔹 5. Listar funcionários por departamento

Filtra e exibe apenas os funcionários que pertencem ao departamento informado.

🔹 6. Listar funcionários por salário (ordem crescente)

Mostra todos os funcionários ordenados pelo salário.

🔹 7. Listar funcionários em ordem alfabética

Exibe a lista de funcionários ordenada pelo nome.

🧱 Estrutura do Projeto
src/
 ├── entities/
 │     └── Employee.java
 └── application/
       └── Program.java

📄 Employee.java

Classe que representa o funcionário, contendo:

ID

Nome

Salário

Departamento

Métodos de aumento salarial e troca de departamento

Sobrescrita do toString()

📄 Program.java

Classe principal onde ocorre:

Leitura de dados com Scanner

Menu interativo

Lógica de filtros, ordenação e validações

Uso de Streams e List

▶️ Como Executar

Clone o repositório:

git clone https://github.com/GabrielBarbosa21/estudos.git


Abra o projeto no Eclipse ou outra IDE Java.

Compile e execute a classe:

application.Program


Siga o menu exibido no console.

🛠 Tecnologias Utilizadas

Java 17+

Eclipse IDE

Paradigma de Programação Orientada a Objetos

Java Streams / Collections

📚 Objetivo dos Estudos

Este projeto faz parte do meu processo de aprendizagem em:

POO

Estrutura de dados com listas

Criação e manipulação de objetos

Boas práticas em Java

Organização de código

✨ Melhorias Futuras (opcional)

Persistência em arquivo ou banco de dados

Interface gráfica (JavaFX ou Swing)

Tratamento de exceções mais detalhado

Separação em camadas (MVC)
