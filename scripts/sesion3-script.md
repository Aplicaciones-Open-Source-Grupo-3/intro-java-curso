### INTRODUCCIÓN: <br>
Hola a todos. En esta sesión vamos a aprender algo súper importante en Java: los operadores y las estructuras de control.
Esto es lo que permite que un programa tome decisiones y repita acciones, igual que lo hacemos en la vida real.
No te preocupes si nunca has programado antes, vamos paso a paso y lo verás funcionar en pantalla.”

### OPERADORES <br>
Un operador es un símbolo o palabra especial que permite realizar operaciones sobre datos o variables. Con ellos, los programas pueden calcular, comparar y tomar decisiones.

### OPERADORES ARITMETICOS: <br>
Continuando con los operadores aritméticos.
Estos son como los signos que usamos en matemáticas: sumar, restar, multiplicar y dividir.
En programación se usan para trabajar con números.
Veamos un ejemplo muy fácil en jdoodle en donde calcularemos una cantidad utilizando los operadores aritmeticos:
 
Aquí Primero crearemos la clase llamada main, escribimos public class Main que es simplemente el nombre del archivo principal donde irá nuestro programa, como si fuera una carpeta. Y creamos la siguiente función public static void main() para que el programa ejecute las instrucciones, como si fuera un botón de “Play”. No te preocupes, no tienes que memorizar todo, esto es algo que siempre veremos en Java. 
Y ahora declaramos y asignamos valores a las variables, para después imprimir el resultando. Aquí calculamos cuánto pagarías si cada producto vale 20 y compras 3.


### OPERADORES DE COMPARACIÓN Y LÓGICOS <br>
Ahora vamos con algo clave para que un programa pueda decidir: los operadores de comparación.
Los operadores de comparación permiten evaluar relaciones entre valores, como igualdad o desigualdad, comparan valores y responden un resultado booleano true o false. ‘¿Es mayor?’, ‘¿Es igual?’, ‘¿Es diferente?’, así decide una computadora.
Ahora en jdoodle veremos un ejercicio el cual permita verificar la edad de una persona.
 
Crearemos la clase llamada main y escribimos public static void main para que java empieze a ejecutar el código, declaramos la variable de la edad y con boolean le decimos que solo sea verdadero si la edad a comparar es mayor a 18. Finalmente imprimimos el resultado con system.out.println.


### ESTRUCTURAS DE DECISIÓN (if / else) <br>
Ahora que ya sabemos comparar, viene lo más útil: Las estructuras de decisión permiten que el programa ejecute diferentes acciones según una condición. Las más comunes en Java son if / else if / else y switch. Es como decir: si tengo hambre, como; si hace frío, me pongo una casaca. Java funciona igual. Evalúa una condición y decide qué instrucción ejecutar.

If es como preguntarle algo al programa:
‘Si pasa esto… entonces haz esto otro’. Si la condición es verdadera, se ejecuta el bloque. Si no, se ignora. Aunque aveces hay dos opciones: Si pasa esto, haz A. Si no pasa, haz B. 
Para eso usamos if y else.
¿Y que pasa cuando hay mas de dos opciones?. Por ejemplo, cuando queremos decir si una nota es Excelente, Buena, Regular o Mala.
Ahí usamos else if, que significa: ‘si no se cumplió lo anterior, prueba esta otra condición’.” 
Y por ultimo cuando ya tienes varias opciones específicas, como un menú usamos el switch que es más limpio que escribir muchos else if.

Una vez mas vamos a jdoodle, con un ejemplo practico en el cual calcularemos si una nota es aprobatoria o no, en que categoría se encuentra y un ejemplo de opciones con switch.
 
Empezaremos creando la clase main, seguido de public static void main(string [] args), declararemos la variable. Y aquí entra la lógica, si la nota es mayor a 11 se mostrará el mensaje “Aprobado”, si no, saldrá “Desaprobado”, y si la nota es mayor a 18, se mostrará otro mensaje diciendo “Excelente”, si no podría ser muy bueno, bueno, o necesita mejorar.
Ahora, el switch es como un menú donde cada número activa una acción distinta.
Es útil cuando tienes muchas opciones fijas que el usuario puede escoger. En este caso si la opción es 1, se mostrará este mensaje (Mostrando información de notas), pero si es otro numero se mostraran las otras opciones respectivamente. 


### BUCLES O ESTRUCTURAS REPETITIVAS: <br>
Un bucle es una estructura que hace que el programa repita una acción muchas veces de manera automática. Lo usamos cuando queremos que algo se repita sin escribir el mismo código una y otra vez. En la vida real, unos ejemplos serían repetir 10 saltos, contar del 1 al 100, revisar una lista de alumnos uno por uno, etc. <br>

FOR:
El for se usa cuando sabemos exactamente cuántas veces queremos repetir algo. Es conciso y fácil de entender y reduce el riesgo de crear bucles infinitos.<br>

WHILE:
Por el contrario, el bucle while se usa cuando no sabemos cuántas repeticiones habrá, y solo sabemos que tiene que repetirse mientras se cumpla una condición.

DO WHILE:
Por ultimo, El do-while es como el while, pero asegura que el código se ejecute al menos una vez, aunque la condición sea falsa.”
Ahora veremos ejemplos en jdoodle para aplicar los conocimientos:

Creamos la función main y el public static void main para ejecutar el código.
A for le damos el numero desde donde empezará, hasta donde tiene que ir, y con cada repetición le sumamos 1. Es como decir imprime del 1 al 5. Para while creamos una variable y la repetimos mientras contador sea mayor que 0. Para que cuando llegue a 0, el bucle se detenga solo.”
Para el do-while también creamos una variable y la usamos para asegurarnos de que el código se ejecute mínimo una vez.”

Ahora un repaso rápido:
For se utiliza cuando sabes cuántas veces se va a repetir.
While, depende de una condición.
Do-while, igual que el while pero siempre garantizando la primera ejecución
 
Ahora si estas preparado para el mini reto:
PASO 1: Crea la clase y declara las notas <br>
PASO 2: Calcula el promedio <br>
PASO 3: Usa if para ver si está aprobado / desaprobado <br>
PASO 4: Usa ELSE IF para mostrar la categoría <br>
PASO 5: Usa FOR para mostrar las notas registradas <br>

