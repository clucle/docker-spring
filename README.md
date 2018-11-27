## centos guide
상황에 따라 다름니다.. ㅎ

### setting user
```bash
$ useradd deployer
$ echo 'P@ssw0rd' | sudo passwd --stdin testuser
$ sudo su
$ [root]usermod -aG wheel "YOUR NAME"
$ su deployer
```

### install git, wget, java

```bash
$ sudo yum install git -y
$ # git --version
$ sudo yum install wget -y
$ # wget --version
$ sudo yum install -y java-1.8.0-openjdk-devel
$ # java -version
```

### install maven

```bash
$ cd /usr/local/src
$ sudo wget http://www-us.apache.org/dist/maven/maven-3/3.5.4/binaries/apache-maven-3.5.4-bin.tar.gz
$ sudo tar -xf apache-maven-3.5.4-bin.tar.gz
$ sudo mv apache-maven-3.5.4/ apache-maven/ 
```

### setting java

```bash
$ which javac # > /usr/bin/javac
$ readlink -f /bin/javac # /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.191.b12-1.el7_6.x86_64/bin/javac
$ cd ~
$ sudo vim .bash_profile
# ~/.bash_profile
# export JAVA_HOME=/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.191.b12-1.el7_6.x86_64
$ source .bash_profile
```

### setting maven

```bash
$ cd /etc/profile.d/
$ sudo vim maven.sh
# /etc/profile.d/maven.sh
# export M2_HOME=/usr/local/src/apache-maven
# export PATH=${M2_HOME}/bin:${PATH}
$ sudo chmod +x maven.sh
$ source /etc/profile.d/maven.sh
$ mvn --version
```

### install docker

```bash
$ sudo yum install -y yum-utils device-mapper-persistent-data lvm2
$ sudo yum-config-manager --add-repo https://download.docker.com/linux/centos/docker-ce.repo
$ sudo yum makecache fast

# centos?
$ sudo yum install --setopt=obsoletes=0 \
   docker-ce-17.03.2.ce-1.el7.centos.x86_64 \
   docker-ce-selinux-17.03.2.ce-1.el7.centos.noarch
# red hat?
$ sudo yum -y --enablerepo=rhui-REGION-rhel-server-extras install container-selinux

$ sudo yum -y install docker-ce
$ sudo systemctl start docker
```

### settings docker

```bash
$ sudo su
$ [root]usermod -aG docker "YOUR NAME"
$ su deployer
$ sudo systemctl start docker
$ docker system prune -a
```
