# BOTS

Resumo


## Pré-requisitos
* homebrew (mac)
* docker
* docker-compose
* Java 8
* Maven
* MySql
* Junit

## Resources
## User
* /bots/{id} - GET
* /bots      - POST
* /bots      - DELETE

## Message
* /message      - GET
* /message      - GET (com @RequestParam conversationId )
* /message/{id} - GET

## Setup do projeto (execucao local)
```
# crie o .jar
mvn clean package
# crie as imagens e os container(api e mysql)
docker-compose up -d
# ver se os containers estão up, deve existir um container para api e um para o banco de dados.
docker ps
```

### Acesso ao banco de dados docker
```
docker exec -it <containerId> /bin/bash
mysql -h 127.0.0.1 -P 3306 -u root -p
senha: password
use bots (database)
```
