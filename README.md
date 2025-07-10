<br></br>
:clipboard:<h1>Descripción:</h1>
<p>Este sitio web a sido desarrollado para los usuarios que requieran realizar conversión de divisas.
Esta aplicación obtiene los datos desde la API Exchange Rate con los valores actualizados de las monedas de cada pais y entregando el calculo preciso en base al monto ingresado por el usuario.</p>

<br></br>
:wrench:<h1>Funcionalidad:</h1>
- `Menú:`
La aplicación dispone de un menú en el cual el usuario puede elegir la opción en base a sus necesidades.

- `Validaciones:`
El codigo de divisa de cada pais es validado en base a lo entregado por la API e indicando al usuario si ingresó la divisa incorrectamente.
Tambien está configurada la validación en el ingreso del monto a convertir. La aplicación solo acepta valores numericos enteros, de lo contrario muestra en pantalla un mensaje de error.

- `Conversión de datos:`
El usuario al momento de elegir la opcion de conversión de monedas, la aplicación obtiene los datos de la API Exchange Rate en base a las divisas indicadas por el usuario. Además, dentro de la aplicación existe un calculo que permite obtener correctamente el monto ingresado por el usuario y el valor de la moneda base. 


- `Sorteo limitado:`
Existe un limite por defecto de 5 amigos, esto con la finalidad de que sea mas simple para el usuario y evitar confusiones por si existen amigos con el mismo nombre.

<br></br>

:computer:<h1>Tecnologías utilizadas:</h1>
- `Java`
- `Gson`
- `CSS`
