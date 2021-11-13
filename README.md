# Patron_de_estructura_Decorator

## En la creacion del patron de diseño de decorator tomaremos como ejemplo la creacion de un ejercicio que sea capaz de lograr que haya una tasa de prestamos que sean de ciertamanera con intereses a un cierto plazo.


### Primero creamos una calse de tipo Cliente en esta clase vamos a colocar todos los datos que sean referentes al cliente.
<img src="capturas\1.PNG" alt="Caso1"/>

### Luego de eso los vamos a inicializar en un constructor
<img src="capturas\2.PNG" alt="Caso1"/>

### Y luego extraemos todos los metodos que se necesitan de cada uno de estos datos.
<img src="capturas\3.PNG" alt="Caso1"/>

## Se crea la clase CUenta que es una clase de tipo interface la cual tendra dentro de sus metodos el valor, e ingreso al igual que obtendra datos del cliente atraves de los metodos gets.
<img src="capturas\4.PNG" alt="Caso1"/>

## Creamos la clase CuentaCorriente esta clase sera capaz de tener los datos de otra clase de tipo abstracta que obtiene metodos importantes de utilizar bien primero cremos las variable sde tarjeta de credito que esto sera usando de la clase decorate.
<img src="capturas\5.PNG" alt="Caso1"/>

### Luego hacemos un constructor el cual sera capaz de retornar lel valor de la funcion anterior.
<img src="capturas\6+.PNG" alt="Caso1"/>

### Usamos la funcion de la clase abstracta de aplicar interes donde realiza la funcion matematica de un porcentaje especifico para el valor que se le haya pasado el cual tendra afectaciones en la cuenta actual. y sera retornado en un String
<img src="capturas\7.PNG" alt="Caso1"/>

## Creamos la clase Decorador

### En esta clase abstracta se hace uso de todos los valores y metodos establecidos que son implememtados desde la clase de tipo interfaz de cuenta.en esta clase realizaremos el retorno de cada uno de los valores que tienen estos metodos en sus funciones 
<img src="capturas\8.PNG" alt="Caso1"/>

## Creamos la clase cuenta general
### Creamos las variables de la clase
<img src="capturas\9.PNG" alt="Caso1"/>

### Luego creamos el constructor y inicializamos las variables
<img src="capturas\10.PNG" alt="Caso1"/>

### Y cada uno de los metodos retornara su valor segun se le haya asignado en su funcion.
<img src="capturas\11.PNG" alt="Caso1"/>

## Creamos la clase Cuenta Plazos
### dentro de esta clase sera la clase donde determinamos en cuanto plazo sera el retorno de pago del usuario o cliente y el valor en interes a devolver
### Declaramos las variables e inicializamos el constructor
<img src="capturas\12.PNG" alt="Caso1"/>

### Aplizamos la funcion de aplicar interes al plazo ingresado.
<img src="capturas\13.PNG" alt="Caso1"/>

### que retorne el interes en una funcion, que retorne el plazo final en una funcion
<img src="capturas\14.PNG" alt="Caso1"/>

## Creamos la clase Prueba del patron donde colocamos los datos a imprimir para poder tomar losvalores necesarios como la cantidad de dinero de 2 diferentes usuarios al cual uno si tendra intereses y un plazo mas extenso a pagar de manejera final, haciendo uso de la clase fecha para asi llevar un orden de tiempo el cual el cliente tendra a cabo, y la contatenado de varios strings para el resultado de la impresion del compilad
<img src="capturas\15.PNG" alt="Caso1"/>

# Resultados

## Asi seria el resultado para un cliente con intereses y otro sin intereses
<img src="capturas\16.PNG" alt="Caso1"/>
