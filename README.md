# Proyecto final Bootcamp Ironhack-Accenture---Animal Crossing

### 🍃 Proyecto de Animal Crossing para listar colecciones
<p align="center">
    <img src = '5b4a216ec051e602a568cd7e.png'
width='450'>
</p>

### 👩🏻‍🏫 Proyecto realizado por: 
* Rocío Arellano López

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

Te doy la bienvenida a mi proyecto final del bootcamp de Ironhack para Accenture en el que he creado una web donde podrás hacerte tu usuario del juego, así como listas de las diferentes colecciones que nos ofrece el juego, como por ejemplo de vecinos, peces, insectos,...y próximamente seguiré añadiendo colecciones.
A continuación te invito a conocer qué he realizado en el proyecto, y cuál ha sido la lógica usada y la tecnología empleada.

Espero que pueda ser útil al resto de jugadores, y que pases un buen rato revisando el proyecto.
<p align="center">
<img src = 'https://raw.githubusercontent.com/rocarelop/AnimalCrossing-proyectoFinalBootcamp/main/632236-animal-crossing-new-horizons-nintendo-switch-front-cover.webp?token=GHSAT0AAAAAABXDOZKXWIYFU7WXIQUDB5Q4YXD2XXA' width='450'>

-----------------------------------------------------------------------------------------------------------------------------------------

###  💻 ¿Cómo está conformado el proyecto?¿Qué tecnologías he usado?

- Cuenta con una parte API-REST backend realizada en `Java` y `Spring-Boot` que se encuentra en el puerto 8080 y que se conecta a la base de datos de `MySQL`. 
- En los controladores cuenta con todo tipo de peticiones `GET, POST, PUT Y DELETE`; también cuenta con los servicios respectivos donde está la lógica de negocio.
- He realizado tests con `JUnit`.
-Y cuenta con seguridad realizada con `Spring Security`

-La parte frontend está realizada en `Angular` con `HTML`, `CSS`, y `TS` principalmente, aunque también he usado `Angular Material` y `primeNG` para algunos componentes. 
-También cuenta con una parte de seguridad y registro. 
-He usado también una API externa para traer algunos datos esenciales a la web: https://api.nookipedia.com/doc

Aquí muestro el diagrama de clases que he usado para el proyecto: 

<p align="center">
    <img src = 'diagrama proyecto final Animal Crossing.png' width='1000'>


-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

### 🎮 ¿Cómo jugar? 
En primer lugar tendrás que descargarte los proyectos, y en Angular recuarda usar el `npm install` por consola.

Para que  funcione correctamente, tendrás que levantar las terminales de cada proyecto. 
Para ello:
-	 en java usaremos por terminal: ` mvn spring-boot:run `
-	En angular usaremos por terminal: `ng serve`

Te recomendamos que te crees una connection titulada ironhacker con contraseña Ir0nh4ck3r!. 
Y para dar los privilegios: `GRANT ALL PRIVILEGES ON animalcrossing.* TO 'ironhacker'@'127.0.0.1';`

Y para los tests igual pero cambianto: `GRANT ALL PRIVILEGES ON animalcrossing_test.* TO 'ironhacker'@'127.0.0.1';`

Cuando tengas esto listo vas a tu navegador y pones: `http://localhost:4200/`

En la primera pantalla te aparecerá el formulario de signup, si aún no tienes cuenta, primero tendrás que darle a crear cuenta, y una vez lo hagas, poder identificarte. 
Te aparecerá una pantalla de bienvenida y le darás a `Home`

Aquí te llevará a la página principal, y verás en la parte superior una barra de navegación con botones. 
`Villager`, `Fish`, `Bug` son páginas que te muestran toda la colección de lo que tenemos en la API externa de cada uno de ellos. 
`Island Leader` podrás crear tu usuario principal. 
`Island` podrás generar tu isla con el id del island leader, y seleccionar 10 villagers(importante este dato, no te dejará crear isla si no tienes 10, ni con menos ni con más vecinos).
`Fish Catched` podrás generar la lista de peces que vas capturando según el id de tu island leader.
`Bug Catched` podrás generar la lista de insectos que vas capturando según el id de tu island leader.
En estos listados, podremos tanto borrar como modificar, como seguir creando más. 

También encontrarás un botón `logout` para poder salir de la aplicación. 


<p align="center">
    <img src = 'https://raw.githubusercontent.com/rocarelop/AnimalCrossing-proyectoFinalBootcamp/main/Canela_%2528New_Leaf%2529.webp?token=GHSAT0AAAAAABXDOZKXXZ6G4GX6RV7GHKNUYXD3PPQ'
width='250'>



-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
### 😊 Datos adicionales que me gustaría explicarte: 

* El proyecto ha sido realizado en un plazo de unos 5-6 días. 
* Realicé una presentación en clase con un power point, además de enseñar la funcionalidad de la web en directo, y, el cual adjunto en formato pdf; habrá algunas imágenes que no se visualicen correctamente ya que eran gifs para hacer más dinámica la presentación. 
* Hace 9 semanas, cuando comencé este bootcamp, había visto muy poca programación, ya que, anteriormente he estado trabajando como enfermera durante 7 años, ya que es la carrera que estudié, y, este ha sido mi primer contacto con el mundo de la programación para reinventarme y cambiar de profesión. 
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Quería agradecer esta oportunidad tanto al equipo de Ironhack como al de Accenture, han sido 9 semanas de muchísimo trabajo, pero ha merecido la pena por todo lo aprendido. Nunca imaginé que en tan poco tiempo iba a poder realizar un proyecto de estas características. 
Gracias en especial a Víctor y Arnoldo, que han sido nuestros profesores y que han hecho todo esto posible. 

Agradecer también a mi familia y amigos, a mis compañeras (y ahora muchas de ellas amigas) de bootcamp, y en especial a Carlos, por todo el apoyo y la confianza en mi. 

Y, por último, agradecerte tu tiempo por probar e interesarte en mi proyecto; espero haber estado a la altura de lo que se nos pedía y que te hayas divertido mientras lo revisabas.

<p align="center">
    <img src = 'https://github.com/rocarelop/AnimalCrossing-proyectoFinalBootcamp/blob/cd42ad874e71be39253780e690c30207ac37279c/5b4a2106c051e602a568cd70.png' width='250'>

