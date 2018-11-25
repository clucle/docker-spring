# Docker-Spring

## Usage

```bash
$ mvn clean install
$ docker build -f Dockerfile -t docker-spring .
$ docker run -p 1124:1124
```

## Database

```bash
docker pull mysql
docker run --name docker-spring-mysql -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=db-name -e MYSQL_USER=user-name -e MYSQL_PASSWORD=user-password -d mysql:latest
docker rm docker-spring-mysql
```