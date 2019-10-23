package PrimerProyect;

public class Main {

	//Creado por Henry Nuñez

	//Modificado por Nicolas Inchiglema

    //Gabriela Talavera

	public static void main(String[] args) {
		
		System.out.println("Software II");
		

	}

	public void start(Stage primaryStage) {
		int answer = MessageBox.show(primaryStage,
						"Ejemplo de un DialogBox.\n\nLas opciones son las siguientes.\n[MessageBox.ICON_INFORMATION | MessageBox.OK | MessageBox.CANCEL]",
						"Information dialog", 
						MessageBox.ICON_INFORMATION| MessageBox.OK | MessageBox.CANCEL);

		if (answer == MessageBox.OK) {
			System.out.println("Ok");
		} else if (answer == MessageBox.CANCEL) {
			System.out.println("Cancel");
		}

		answer = MessageBox.show(primaryStage,
						"Ejemplo de un mensaje de error.\n\nLas opciones son las siguientes.\n[MessageBox.ICON_ERROR]",
						"Error dialog", 
						MessageBox.ICON_ERROR);
		System.out.println(answer);


		

		// Nicolas Inchiglema
	}

	
}
