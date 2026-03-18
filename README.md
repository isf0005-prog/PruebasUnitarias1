# Tarea Evaluación Módulo 14
### Lo que has hecho es crear una clase de pruebas para comprobar que otra clase llamada ValidadorRegistro funciona bien. 
Es decir, no estás programando la lógica en sí, sino que estás comprobando que esa lógica responde correctamente cuando le pasas distintos datos. 
Básicamente estás haciendo que el programa se examine a sí mismo automáticamente

Primero importas herramientas de JUnit que sirven para hacer tests.Con la anotación @Test le dices al programa “esto es una prueba” y con @DisplayName le pones un nombre más claro para saber qué estás comprobando. Luego creas un objeto validador que es el que vas a usar en todos los tests para validar nombres, contraseñas, emails y edades
<img width="767" height="397" alt="image" src="https://github.com/user-attachments/assets/79e1a552-f141-4091-9206-acae71c62d5b" />

Cada método que has escrito es una prueba independiente. Por ejemplo en el de nombre válido le pasas "Carlos" al método validarNombre y guardas el resultado en una variable. Después usas assertTrue para decir “esto debería ser verdadero”. Si no lo es, el test falla y te indica que algo está mal
Luego haces lo contrario con el nombre vacío. Le pasas una cadena vacía y usas assertFalse porque esperas que el sistema lo rechace. Aquí estás comprobando un caso incorrecto, que también es muy importante
<img width="735" height="152" alt="image" src="https://github.com/user-attachments/assets/7342608a-f500-4d53-864b-8fe3d5efac32" />

Después haces lo mismo con las contraseñas. Pruebas una contraseña de 8 caracteres y esperas que sea válida, y luego pruebas una corta como "Admin" y esperas que sea inválida. Esto sirve para comprobar que tu regla de longitud funciona bien
<img width="786" height="151" alt="image" src="https://github.com/user-attachments/assets/bba9de8c-e478-484a-9115-3e6475e9ee66" />

Con el email haces algo parecido. Pasas un email sin arroba y compruebas que el sistema lo rechaza. Y por último con la edad compruebas que 16, que es el mínimo permitido, sí se acepta
<img width="765" height="176" alt="image" src="https://github.com/user-attachments/assets/b8ecfeac-3f13-44bf-99bf-4d6c1a6bc4af" />

En el fondo todos tus tests siguen la misma idea primero ejecutas una acción llamando a un método y luego verificas el resultado con un assert. Eso en testing se conoce como el patrón Arrange Act Assert aunque tú ya lo estás aplicando sin darte cuenta
<img width="698" height="171" alt="image" src="https://github.com/user-attachments/assets/14271df1-ccc9-4c88-93a4-96c6ce2d437f" />

## RESULTADO BIEN
<img width="879" height="327" alt="image" src="https://github.com/user-attachments/assets/f0da23da-7c76-4c7c-a4e5-4a1536a8511f" />
