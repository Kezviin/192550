
Primero que todo me doy cuenta que esta la misma estructura repetida varias veces para eso voy a  usar un for que me permitira hacer un bucle y sin que se escriba tanto contenido
con el for vamos a optimizar y ocupar menos espacio , como no me define cuantos estudiantes son en el total entonces voy a colocar como limite que pregunte 5 estudiantes que decia en la estructura principal

- como hay 2 tipos de scanners numeros y nombres entonces los separo para que no me den problemas en el futuro y los separo de esta manera:
        Scanner escanearNumeros = new Scanner(System.in);
        Scanner escanearNombres = new Scanner(System.in);
- como la edad no es mayor a 137 entonces vamos a usar byte
- como tambien me dan otra estructura de mayor o menor de edad pues lo meto dentro del for para optimizar y que el usuario se de cuenta en el mismo momento si es mayor o menor de edad
- para optimizar dentro del codigo vamos a poner que si i==5 entonces va a salir el comando de calcular el promedio de la edad y que se acabo el codigo


CALCULADORA COMPARACIONES Y REPETICION:
¿Sabías que Scanner.nextInt() no consume el salto de línea? Si mezclas tipos de entrada (por ejemplo, int y luego String), puede traerte problemas.
El operador % no es solo para saber si un número es par… 👀
Usa Math.round() para redondear si quieres impresionar, pero recuerda que el casting explícito también tiene su encanto.
El while(true) tiene su fuerza, pero salir de él con un break bien ubicado es arte ninja.
No subestimes Scanner.nextLine() para hacer una pregunta tipo “¿Deseas continuar?” y evaluar con .equalsIgnoreCase("si").

solucion:
como no me dice que tengo que comparar me imagino que puedo elegir que quiero comparar porque leyendo y re leyendo lo que me dice es que tengo que comparar por el titulo y los puntos que hay despues son como consejos entonces
voy a comparar 2 nombres y ordenarlos alfabeticamente y luego lo voy a repetir si es que el usuario asi lo desea

- creo 2 scanner 1 para los nombres y otro scanner para si quiere continuar con el codigo el usuario o no
- utilizo for para hacer un ciclo pero como son 2 valores a comparar se dejan separados
- usare el comparetoignorecase para comparar los 2 nombres si es el nombre1<0 entonces el nombre 1 va primero que el segundo , si el nombre1>0 entonces el nombre 2 va primero que el 1 , si los nombres son iguales entonces dirá : los nombres son iguales
- luego le pido al usuario que escriba 1 si quiere repetir el codigo o otro numero cualquiera si quiere dejar de repetir con esto cumplo el repetir del ejercicio y la comparacion
- para evitar mayusculas y minusculas del la decision decidi colocar 1 para si por eso
- luego creo un if que me dira si ingresa 1 le diga al usuario que se repite el codigo
- y 2 o cualquier otro numero si quiere que el codigo se finalice al final el codigo dice "Fin del codigo"

!FIN DE LAS RESPUESTAS GRACIAS POR LEER!

