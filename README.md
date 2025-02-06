🚀 Como Executar o Projeto

🔧 Pré-requisitos

Antes de começar, você precisará ter instalado na sua máquina:

Git

Java 17+

Maven

MySQL

Docker (opcional para rodar o banco de dados)

🛠️ Clonando o Repositório

# Clone o repositório
$ git clone https://github.com/seu-usuario/SESI-java-project.git

# Acesse o diretório do projeto
$ cd SESI-java-project

🔥 Configuração do Banco de Dados

No MySQL, crie um banco de dados:

CREATE DATABASE sesi_db;

Configure as credenciais no arquivo application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/sesi_db
spring.datasource.username=root
spring.datasource.password=senha_aqui



