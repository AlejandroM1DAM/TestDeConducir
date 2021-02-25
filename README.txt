El programa se divide en 3 JFrames y una clase;
	1º Frame(JFrame_ppal): 
		-Se compone de 4 labels, uno para la imagen y los otros tres uno para cada linea.
		- Aqui esta la posibilidad de añadir nuevos tipos de carnets.
	2ª Frame(jFramepreguntas):
		- Se compone de 2 Label, 2 Button y 3 RadioButton.
		- Un label es una constante y el otro es la variable de la pregunta.
		- Los Button son para avanzar o retroceder de pagina.
		- Los radioButton son los valores de las respuestas.
	3ª Frame(Resultado):
		- Se compone de 6 Labels y 3 Buttons.
		- Cuatro de esos Labels, se corresponden a los aciertos y los errores.
		- Otro es la indicacion de que se ha finalizado el Test, y el ultimo es el que te dice si estas suspenso o has aprobado.
		- Un Button reinicias el mismo test, otro cierras la aplicacion.
		- Y el ultimo Button, Es el de volver al inicio, que tiene su funcionalidad pensada en la ampliacion de posibilidades a la hora de deleccionar distintos carnets. 
	El randomizado esta hecho en base de Collection.shuffel().
