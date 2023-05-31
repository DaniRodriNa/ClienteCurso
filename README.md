# ClienteCurso
## Resumen
Microservicio ClienteCurso que interactua con el crud de curso, lee los cursos y registra formaciones evaluando la duracion de los cursos y asignando asignaturas. 
## Estructura
### Paquetes
* com.curso.inicio
  - Clase **Application.java**
* com.curso.model
  - Clase **Formacion.java**
    - curso: nombre del curso
    - asignaturas: numero entero, cantidad de asignaturas que tiene la formacion
    - precio: numero decimal, precio de la formacion
  - Clase **Curso.java**
    - codCurso numero entero, identificador del curso
    - nombre: nombre del curso
    - duracion: numero entero, duracion en horas del curso
    - precio: numero con decimales, precio del curso
* com.curso.service
  - Interfaz **FormacionesService.java**
  - Clase **FormacionesServiceImpl.java** (Implementa la interfaz **FormacionesService.java**)
* com.curso.controller
  - Clase **FormacionesController.java**
  
  > GET: Recoger la lista de los cursos
  
  > POST: Dar de alta un curso

### Metodos
* listaCursos() -> Lista de pedidos almacenados
* altaCurso -> Da de alta un pasando el curso como parametro
## Autor
* Daniel Rodriguez
## Estado
🟢Terminado🟢
