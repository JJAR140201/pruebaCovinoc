# Prueba Covinoc 
Este repositorio contiene el código fuente de la solución de
la prueba de Covinoc. La solución fue desarrollada utilizando Spring Boot y Java 11, 
y se recomendó utilizar PostgreSql como base de datos.


# Rquerimientos
Antes de ejecutar la aplicación, es necesario tener instalado lo siguiente:

- Java 11
- PostgreSql

# Ejecución de la aplicación
Para ejecutar la aplicación, es necesario seguir los siguientes pasos:

- Clonar el repositorio
- Abrir una terminal y navegar hasta la carpeta del repositorio
- Ejecutar el comando ./mvnw spring-boot:run
- La aplicación estará disponible en la siguiente URL: http://localhost:8080

# Documentacion PERSONA
Este repositorio contiene el código fuente de la solución de la prueba de Covinoc.
La solución fue desarrollada utilizando Spring Boot y Java 11, y se recomendó utilizar 
PostgreSql como base de datos.

La aplicación permite realizar las siguientes operaciones:

- Crear un registro de persona: Para crear un registro de persona, se debe enviar una petición 
HTTP POST a la siguiente URL: http://localhost:8080/persona.

- Consultar un registro de persona: Para consultar un registro de persona, se debe enviar una petición 
HTTP GET a la siguiente URL: http://localhost:8080/persona/{id}, donde {id} es el identificador de la 
persona que se desea consultar.

- Actualizar un registro de persona: Para actualizar un registro de persona, se debe enviar una petición 
HTTP PUT a la siguiente URL: http://localhost:8080/persona/{id}, donde {id} es el identificador de la persona que se 
desea actualizar. 

- Eliminar un registro de persona: Para eliminar un registro de persona, se debe enviar una petición HTTP DELETE a la 
siguiente URL: http://localhost:8080/persona/{id}, donde {id} es el identificador de la persona que se desea eliminar.

# Documentacion PAIS

- Consultar un registro de pais: Para crear un registro de pais, se debe enviar una petición 
HTTP GET a la siguiente URL: http://localhost:8080/pais.

- Consultar un registro de pais por Id: Para crear un registro de pais, se debe enviar una petición 
HTTP GET a la siguiente URL: http://localhost:8080/pais/ {id}.

# Documentacion Estado 

- Consultar un registro de estado: Para crear un registro de estado, se debe enviar una petición 
HTTP GET a la siguiente URL: http://localhost:8080/estado.

- Consultar un registro de estado por Id: Para crear un registro de estado, se debe enviar una petición 
HTTP GET a la siguiente URL: http://localhost:8080/estado/ {id}.
