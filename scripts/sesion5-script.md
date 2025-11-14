INTRODUCCIÓN
Bienvenidos a esta nueva sesión del curso. Hoy iniciaremos un tema fundamental en Java y en la mayoría de lenguajes modernos: la Programación Orientada a Objetos.
La Programación Orientada a Objetos permite modelar elementos del mundo real dentro del programa mediante clases y objetos. Esto hace que el código sea más organizado, más fácil de mantener y más escalable.

CLASES VS. OBJETOS
Para empezar, es importante distinguir entre clase y objeto.
Una clase es una plantilla o modelo que define qué características y comportamientos tendrá un tipo de elemento. Dentro de una clase se encuentran los atributos, que son los datos, y los métodos, que son las acciones que ese elemento puede realizar.
Un objeto, en cambio, es una instancia concreta creada a partir de una clase. Es decir, es un ejemplo real basado en la plantilla. Si la clase es la idea general, el objeto es la versión específica con valores propios.
Una misma clase puede generar múltiples objetos, cada uno con datos diferentes pero compartiendo la misma estructura y comportamientos.

ATRIBUTOS Y MÉTODOS
Los atributos representan las características de un objeto. Pueden describir información como nombre, edad, precio, color, tamaño, entre otros.
Los métodos representan los comportamientos o acciones que ese objeto puede realizar. Por ejemplo, un método puede mostrar datos, modificar un valor, calcular un resultado o ejecutar una acción específica.
Una clase bien diseñada separa claramente sus atributos y sus métodos, logrando un objeto funcional y coherente.

ENCAPSULACIÓN
La encapsulación es uno de los principios más importantes en la Programación Orientada a Objetos. Consiste en proteger los datos internos de una clase evitando que cualquier parte del programa pueda modificarlos directamente.
Para lograr esto, normalmente los atributos se declaran como privados y se utilizan métodos públicos para controlarlos.
De esta manera se evita que los datos cambien sin control y se garantiza que siempre se acceda a ellos de manera segura y ordenada.

CONSTRUCTORES
Un constructor es un método especial cuya función es inicializar los objetos cuando se crean.
Cuando se instancia un objeto, el constructor asigna valores iniciales a los atributos.
El constructor tiene el mismo nombre que la clase y no devuelve ningún tipo. Se utiliza para garantizar que cada objeto comience con un estado válido y completo.

EJERCICIO PRÁCTICO
Para reforzar estos conceptos vamos a realizar un ejercicio práctico que cumpla con los pasos previstos:

Crear una clase llamada Producto.

Agregar dos atributos privados que representen las características del producto.

Definir un constructor que reciba valores y los asigne a los atributos.

Crear un método que muestre la información del producto.

En la clase principal, crear dos objetos de Producto con valores distintos y llamar al método que muestra la información.

EXPLICACIÓN DEL EJERCICIO
El ejercicio permite aplicar lo aprendido de una forma clara. Primero se crea la clase con sus atributos encapsulados.
Luego se define el constructor que se encargará de asignar valores iniciales.
El método mostrarInfo será el encargado de imprimir la información del producto.
Finalmente, en la clase principal se instancian dos productos diferentes y se llama al método para visualizar sus datos.
Este ejercicio permite entender cómo funcionan las clases, los objetos, los constructores y la encapsulación trabajando en conjunto.

CIERRE
En esta sesión hemos aprendido los elementos esenciales de la Programación Orientada a Objetos: clases, objetos, atributos, métodos, constructores y encapsulación.
Estos conceptos forman la base para desarrollar programas más complejos, estructurados y fáciles de mantener.
Dominar la Programación Orientada a Objetos te permitirá resolver problemas de forma más organizada y eficiente.
