package velox;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);		//input da tastiera
		
		//Dichiaro le variabili
		
		int limiteVelocità;
		int velocitàRilevata;
		int tolleranza; 
		
				//Loop do, while per verificare che il dato del limite esista
		do {
			System.out.print("Inserisci limite di velocità: ");
			limiteVelocità = sc.nextInt();
			sc.nextLine();
			if (limiteVelocità <= 0)
				System.out.println("Dati non validi, riprovare");
		} while (limiteVelocità <= 0);
		
				//Loop come prima
		do {
			System.out.print("Inserisci velocità rilevata: ");
			velocitàRilevata = sc.nextInt();
			sc.nextLine();
			if (velocitàRilevata <= 0)
				System.out.println("Dati non validi, riprovare");
		} while (velocitàRilevata <= 0);
		
		if (velocitàRilevata <= limiteVelocità ) {													
			System.out.println("Non hai preso la multa!");
		} else if (velocitàRilevata - limiteVelocità < 10) {
			System.out.println("La tua multa è tra 42 e 172 euro");
		} else if (velocitàRilevata - limiteVelocità >= 10 && velocitàRilevata - limiteVelocità < 40) {
			System.out.println("La tua multa è tra 173 e 694 euro.");
	    } else if (velocitàRilevata - limiteVelocità >= 40 && velocitàRilevata - limiteVelocità < 60) {
	    	System.out.println("La tua multa è tra 543 e 2170 euro.");
	    } else {
	    	System.out.println("La tua multa è tra 845 e 3382 euro");
	    
	    }
			
	}

}
