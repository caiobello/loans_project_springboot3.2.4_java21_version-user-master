# Loans project with Clean-Achitecture


## Arquitetura Limpa
Este projeto adota os princípios da Arquitetura Limpa (Clean Architecture) para garantir uma estrutura modular, utilizando o Spring Framework e altamente testável.
Documentação da API com Swagger UI:
http://loans2024java20.sa-east-1.elasticbeanstalk.com/swagger-ui/index.html



## Estrutura de Pacotes
A seguir, descrevemos a estrutura de pacotes:

- **controller**: Este pacote contém as classes que atuam como controladores, responsáveis por manipular as requisições HTTP e direcioná-las para o serviço apropriado.

- **documentation**: Aqui está o arquivos relacionado às especificações de API do sistema, utilizando o Swagger.

- **dto**: As classes DTO (Data Transfer Object) residem neste pacote. Elas são utilizadas para transferir dados entre o cliente e o servidor, fornecendo uma abstração dos detalhes de implementação interna.

- **Enum**: Enumerações importantes para o funcionamento do sistema são definidas neste pacote.

- **exception**: Classes de exceção personalizadas são colocadas aqui. Elas são usadas para lidar com exceções específicas do domínio ou da aplicação.

- **model**: Este pacote contém as classes de modelo, que representam as entidades principais do domínio da aplicação.

- **repository**: Aqui são definidas as interfaces de repositório, que fornecem métodos para acessar e manipular os dados no banco de dados.

- **security**: Contém as configurações de segurança, como autenticação e autorização.

- **service**: As classes de serviço residem neste pacote. Elas encapsulam a lógica de negócios da aplicação e são responsáveis por coordenar as operações entre os controladores e os repositórios.