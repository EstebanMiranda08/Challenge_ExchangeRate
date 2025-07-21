<br></br>
:clipboard:<h1>Descripción:</h1>
<p>Esta aplicacion ha sido desarrollada para los usuarios que requieran realizar conversión de divisas.
Se obtienen los datos desde la API Exchange Rate con los valores actualizados de las monedas de cada pais y entregando el calculo preciso en base al monto a convertir ingresado por el usuario.</p>

<br></br>
:wrench:<h1>Funcionalidad:</h1>
- `Menú:`
La aplicación dispone de un menú con las siguientes opciones: Lista de Divisas, Conversor de monedas, Historial de conversiones y Salida del programa.

- `Validaciones:`
El codigo de divisa de cada pais es validado en base a lo entregado por la API e indicando al usuario si ingresó la divisa incorrectamente.
Tambien está configurada la validación en el ingreso del monto a convertir. La aplicación solo acepta valores numericos enteros, de lo contrario muestra en pantalla un mensaje de error.

- `Conversión de datos:`
La aplicación obtiene el valor de las monedas desde la API Exchange Rate, por lo cual el usuario ingresa el monto de la moneda base y la moneda a convertir. Como resultado, dentro de la aplicación existe un calculo que permite obtener correctamente la conversion de la divisa. 

- `Lista de divisas:`
Dentro de las opciones para elegir existe la posibilidad de que el usuario pueda obtener la lista de divisas disponibles junto con el codigo de la moneda, es decir, puede saber a que país corresponde cada codigo de la moneda e ingresarlo correctamente en la aplicación.

- `Historial de conversiones:`
Existe la opcion de que el usuario pueda consultar el historial de conversiones que ha realizado mientras utiliza  la aplicación, este historial se guarda e imprime con la fecha y hora local.

<br></br>

:computer:<h1>Tecnologías utilizadas:</h1>
- `Java`
- `API Exchange Rate`
