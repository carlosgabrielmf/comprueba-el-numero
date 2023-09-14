    // Estas son las importaciones necesarias para el manejo de entrada/salida y lectura de datos desde el teclado
    //Esta import se utiliza para leer líneas de texto desde la entrada estándar (teclado).
    import java.io.BufferedReader;

    // Esta import es una excepción que se maneja en caso de problemas con operaciones de entrada/salida.
    import java.io.IOException;

    // Esta import se utiliza para convertir la entrada estándar (System.in) en un flujo de caracteres legible.
    import java.io.InputStreamReader;

    // Declaramos nuestra clase
    public class Main {

        /*
        * Definimos el metodo Main que es el punto de entrada
        * Lanzamos una excepcion segun lo que importamos previamente y debe ser manejada
        * por mi entorno de ejecucion*/
        public static void main(String[] args) throws IOException {

            /*
            * Aqui lo que hicimos fue usar las importaciones para crear un objeto de tipo input
            * para ingresar datos en consola y le dimos un nombre*/
            InputStreamReader capturarTeclado = new InputStreamReader(System.in);
            // Luego creamos un objeto que pueda leer y regresar el input capturarTeclado
            BufferedReader buffer = new BufferedReader(capturarTeclado);

            // 1- Mostramos un mensaje en consola pidiendo que ingresen el primero numero
            System.out.println("Ingrese el primer numero");
            // 2- Se lee el dato ingresado y se almacena en strNumero1 por medio del metodo .readline()
            String strNumero1 = buffer.readLine();
            // 3- Se convierte la variable strNumero1 en un numero entero y se asigna otro nombre de variable
            Integer numero1 = Integer.parseInt(strNumero1);

            System.out.println("Ingrese el segundo numero");
            String strNumero2 = buffer.readLine();
            Integer numero2 = Integer.parseInt(strNumero2);

            System.out.println("Ingrese el tercer numero");
            String strNumero3 = buffer.readLine();
            Integer numero3 = Integer.parseInt(strNumero3);

            // Inicializamos el numeroMayor con el valor que ingrese el usuario en numero1
            Integer numeroMayor = numero1;

            /*
             * Luego, se compara numero2 y numero3 con numeroMayor y
             * se actualiza numeroMayor si alguno de los números ingresados es mayor.
             */

            if (numero2 > numeroMayor){
                numeroMayor = numero2;
            } if (numero3 > numeroMayor){
                numeroMayor = numero3;
            }

            // Inicializamos el numeroMenor con el valor que ingrese el usuario en numero1
            Integer numeroMenor = numero1;

            /*
             * Luego, se compara numero2 y numero3 con numeroMenor y
             * se actualiza numeroMenor si alguno de los números ingresados es menor.
             */

            if (numero2 < numeroMenor){
                numeroMenor = numero2;
            } if (numero3 < numeroMenor){
                numeroMenor = numero3;
            }

            // Se imprime el resultado del mayor
            System.out.println("El numero mayor es:" + " " + numeroMayor);

            // Se imprime el resultado del menor
            System.out.println("Y el numero menor es:" + " " + numeroMenor);
            }
        }