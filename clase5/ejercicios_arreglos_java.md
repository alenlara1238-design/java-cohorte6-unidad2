# Ejercicios de Arreglos Unidimensionales en Java

##  Cómo leer y guardar datos en un arreglo usando Scanner

```java
import java.util.Scanner;

public class EjemploArreglo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arreglo = new int[5];

        // Llenar el arreglo
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Ingrese un número: ");
            arreglo[i] = sc.nextInt(); //guardanos en la posición arreglo[i] lo leído por consola
        }

        // Mostrar el arreglo
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Posición " + i + ": " + arreglo[i]);
        }
    }
}
```

---

# 🟢 NIVEL FÁCIL

## 1. Guardar y mostrar números
Crea un arreglo de 5 números enteros. Solicita al usuario que ingrese los valores y luego muéstralos en pantalla en el mismo orden.

**Guía:**
- Declara un arreglo de tamaño fijo.
- Usa un ciclo para llenarlo.
- Usa otro ciclo para imprimirlo.

---

## 2. Suma de elementos
Crea un arreglo de 6 números enteros, llénalo con datos ingresados por el usuario y muestra la suma total de sus elementos.

**Guía:**
- Usa una variable acumuladora.
- Recorre el arreglo sumando cada valor.

---

## 3. Promedio de notas
Almacena 4 notas en un arreglo y calcula el promedio.

**Guía:**
- Usa tipo double.
- Suma y divide entre la cantidad de elementos.

---

## 4. Mostrar en orden inverso
Llena un arreglo de 5 posiciones y muestra los valores en orden inverso.

**Guía:**
- Recorre el arreglo desde el final hacia el inicio.

---

# 🟡 NIVEL INTERMEDIO

## 5. Buscar un número
Llena un arreglo de 8 números. Luego pide un número y verifica si está en el arreglo.

**Guía:**
- Usa una variable boolean.
- Recorre comparando valores.

---

## 6. Número mayor
Solicita 7 números y determina cuál es el mayor.

**Guía:**
- Declara una variable nunMayor
- Inicializa con el primer valor del arreglo.
- Compara y actualiza.

---

## 7. Contar números pares
Llena un arreglo de 10 números y cuenta cuántos son pares.

**Guía:**
- Declara una variable int contador para almacenar la cantidad de numeros pares.
- Usa el operador %.
- Incrementa contador.

---

## 8. Posición de un elemento
Llena un arreglo de 6 elementos y luego solicita un número. Indica su posición.

**Guía:**
- Usa el índice del ciclo.
- Detén cuando lo encuentres.

---

# 🔴 NIVEL AVANZADO

## 9. Invertir un arreglo
Llena un arreglo de 5 números y crea otro arreglo invertido.

**Guía:**
- Usa un segundo arreglo.
- Copia en orden inverso.

---

## 10. Eliminar un elemento
Llena un arreglo de 6 números y elimina un valor desplazando elementos.

**Guía:**
- Busca la posición.
- Desplaza a la izquierda.

---

## 11. Ordenar arreglo
Llena un arreglo de 6 números y ordénalo de menor a mayor.

**Guía:**
- Usa ciclos anidados.
- Intercambia valores.

---

## 12. Frecuencia de un número
Llena un arreglo de 8 números y cuenta cuántas veces aparece un valor.

**Guía:**
- Usa un contador.
- Recorre todo el arreglo.
