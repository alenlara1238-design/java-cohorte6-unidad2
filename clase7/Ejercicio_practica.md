# Proyecto: Plataforma de Cursos de Programación

## Contexto general

Se desea desarrollar una aplicación en Java para gestionar una plataforma de cursos de programación.

En esta plataforma existen estudiantes que pueden matricularse en distintos cursos, y profesores encargados de impartir dichos cursos. Cada curso está compuesto por varias clases (lecciones), las cuales contienen información específica sobre su contenido.

El sistema debe modelarse utilizando **programación orientada a objetos** y haciendo uso exclusivo de **arreglos (`[]`)**, sin utilizar colecciones avanzadas.

---

## Reglas del sistema

A continuación, se describen las reglas de negocio que deben cumplirse. A partir de ellas, el estudiante deberá diseñar las clases y sus relaciones.

---

### Estudiantes y cursos

- Un estudiante puede matricularse en **varios cursos**.
- Un curso puede tener **varios estudiantes matriculados**.
- Si un estudiante se elimina del sistema, los cursos en los que estaba matriculado **siguen existiendo**.
- Si un curso se elimina, los estudiantes **siguen existiendo**.

---

### Profesores y cursos

- Cada curso tiene **un único profesor asignado**.
- Un profesor puede dictar **uno o varios cursos**.
- Si un profesor deja de trabajar en la plataforma, los cursos pueden ser **asignados a otro profesor**.
- Si un curso se elimina, el profesor **sigue existiendo en el sistema**.

---

### Cursos y clases (lecciones)

- Cada curso está formado por **varias clases (lecciones)**.
- Las clases pertenecen exclusivamente a un curso.
- No tiene sentido que una clase exista si no está asociada a un curso.
- Si un curso se elimina, todas sus clases **también deben eliminarse automáticamente**.

---

### Clases y video

- Cada clase tiene un **video asociado**.
- El video contiene información como:
  - nombre del archivo
  - duración
  - calidad
- Un video no puede existir sin una clase.
- Si una clase se elimina, su video **también debe eliminarse**.

---

## Actividades a realizar

1. Identificar las clases necesarias del sistema.
2. Definir los atributos de cada clase.
3. Establecer las relaciones entre las clases según las reglas dadas.
4. Implementar las clases en Java.
5. Crear un programa principal que permita:
   - Registrar estudiantes
   - Crear cursos
   - Asignar profesores a cursos
   - Matricular estudiantes en cursos
   - Agregar clases a un curso
   - Mostrar información del sistema
