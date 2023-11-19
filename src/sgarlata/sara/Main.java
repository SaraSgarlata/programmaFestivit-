package sgarlata.sara;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int data, mese;
		String risp ="";
		
		do
		{
			System.out.println("inserisci un giorno del mese che vada da 1-31");
			data=Integer.parseInt(sc.nextLine());
		
			if (data<1 || data>31) 
			{
				System.out.println("data errata");
				continue;
			}
			
			else {
				System.out.println("inserisci il mese tra 1-12");
				mese = Integer.parseInt(sc.nextLine());
			}
			if (mese < 1 && mese > 12) {
				System.out.println("data errata, ricomincia");
				continue;
			}
				else if (data==1 && mese==1)
					System.out.println("è capodanno!!! yeahhh");
					
				else if (data==6 && mese==1)
					System.out.println("è la befana");
					
			
				else if(data==15 && mese==8)
					System.out.println("è ferragosto andamo in vacanza");
					
			
				else if(data==25 && mese==12)
						System.out.println("è natale, che bello se magna");
				
				else 
					System.out.println("è un giorno normale");
			
			System.out.println("vuoi continuare? si o no");
			risp=sc.nextLine();
			
			
		}while (risp.equals("si"));
 			System.out.println("grazie e vaffanculo");
	   
				
				
	}
	}

