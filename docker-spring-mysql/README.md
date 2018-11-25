## Usage

```bash
$ mvn clean package docker:build
$ docker run --name container-mysql -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=test -e MYSQL_USER=user -e MYSQL_PASSWORD=password -d mysql:5.6
$ docker run -p 8080:8080 --name container-spring --link container-mysql:mysql -d clucle/docker_spring_mysql
```