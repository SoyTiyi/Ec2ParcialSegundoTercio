# Parcial segundo corte 

Parcial segundo corte en donde me toco implemetar las funciones sin y asin

## Cedula
1010127126

## Correr proyecto

Primero Clonaremos el repositorio, para eso desde nuestro navegador nos dirigiremos al siguiente link

```sh
https://github.com/SoyTiyi/Ec2ParcialSegundoTercio.git
```

Para clonar el repositorio debemos de correr el siguiente comando en cmd o en la terminal 

```sh
git clone https://github.com/SoyTiyi/Ec2ParcialSegundoTercio.git
 ```

 Y luego entraremos a la carperta Ec2ParcialSegundoTercio

```sh
$ cd Ec2ParcialSegundoTercio
 ```
Compilaremos los proyectos taller-cinco y load-balancer con el siguiente comando, debemos de entrar a la carpeta de cada uno

 ```sh
$ mvn package
 ```

 Para ejecutar la aplicación. Nos dirigimos a la carpeta Docker-Compose.

```sh
$ cd Docker-Compose
 ```

Luego ejecutamos el siguiente comando

```sh
$ docker build --tag parcialsantiago .
$ docker run -d -p 5000:6000 --name parcialsantiago parcialsantiago
 ```


### Prerequisitos

* Docker
* Docker Compose
* UNIX / Linux
* Java SE Development Kit 8 -Java SE Runtime Environment 8 -Apache Maven.

## Correr Pruebas

Para correr las pruebas, ejecutamos el siguiente comando

```sh
$ mvn test
 ```

### Generar Javadoc

Para generar el javadoc, corremos el siguiente comando

```sh
$ mvn javadoc:javadoc 
 ```

## Construido con

* [Maven](https://maven.apache.org/) - Dependency Management
* [JUnit](https://mvnrepository.com/artifact/junit/junit) - Test framework
* [VIM](https://www.vim.org/download.php) - Editor de Texto VIM

## Author

 - Santiago Martínez Martínez 
 - Estudiante de la Escuela Colombiana De Ingeniería Julio Garavito 
 - Noveno Semestre

## License

Este proyecto está licenciado bajo la GNU v3.0 - ver el archivo LICENSE.md para más detalles
