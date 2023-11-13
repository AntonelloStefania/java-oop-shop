package org.lessons.java.shop;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		final int IVA = 21;
		final int PRODUCT_COUNT=10;
		
		String[] techProducts = {
		            "Smartphone",
		            "Laptop",
		            "Tablet",
		            "Smart TV",
		            "Game Console",
		            "Smartwatch",
		            "Headphones",
		            "Router",
		            "Digital Camera",
		            "Fitness Tracker"
		        };
		 
		 String[] techProductDescriptions = {
		            "Un dispositivo avanzato per la comunicazione mobile.",
		            "Un computer portatile altamente efficiente e leggero.",
		            "Una tavoletta elettronica per la navigazione web e l'intrattenimento.",
		            "Una TV intelligente con accesso a una vasta gamma di contenuti.",
		            "Una console di gioco per divertimento e intrattenimento.",
		            "Un orologio intelligente con molte funzionalità pratiche.",
		            "Audio di alta qualità per un'esperienza audio eccezionale.",
		            "Un dispositivo per la connessione a Internet wireless.",
		            "Una fotocamera digitale per catturare momenti speciali.",
		            "Un braccialetto per il monitoraggio dell'attività fisica."
		        };
		
		Random rnd = new Random();
		
		for(int x=0; x<PRODUCT_COUNT; x++) {
			Prodotto p = new Prodotto(rnd.nextInt(1000000000),techProducts[rnd.nextInt(techProducts.length)], techProductDescriptions[rnd.nextInt(techProductDescriptions.length)],rnd.nextFloat(0,299),IVA);
			System.out.println(p);
		}
	}
}
