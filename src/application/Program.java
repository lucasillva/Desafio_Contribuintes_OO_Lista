package application;

import java.util.Locale;
import java.util.Scanner;

import entites.Champion;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	
		
		System.out.println("Digite os dados do primeiro campeão: ");
		System.out.print("Nome: ");
		String champName = sc.next();
		
		System.out.print("Vida inicial: ");
		int champLife = sc.nextInt();
		
		System.out.print("Ataque: ");
		int champAttack = sc.nextInt();
		
		System.out.print("Armadura: ");
		int champArmor = sc.nextInt();
		
	Champion champ1 = new Champion (champName, champLife, champAttack, champArmor);	
		System.out.println();
		
		System.out.println("Digite os dados do segundo campeão: ");
		System.out.print("Nome: ");
		String champName2 = sc.next();
		
		System.out.print("Vida inicial: ");
		int champLife2 = sc.nextInt();
		
		System.out.print("Ataque: ");
		int champAttack2 = sc.nextInt();
		
		System.out.print("Armadura: ");
		int champArmor2 = sc.nextInt();
	Champion champ2 = new Champion(champName2, champLife2, champAttack2, champArmor2);
	
	System.out.println();
	
	
		System.out.print("Quantos turnos você deseja executar? ");
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++ ) {
		 System.out.println();
	     champ1.takeDamage(champ2.getAttack());
         champ2.takeDamage(champ1.getAttack());
         System.out.println("Resultado do turno " + (i+1));
         System.out.println(champ1.status());
         System.out.println(champ2.status());
         System.out.println();
           if(champ1.getLife() == 0 || champ2.getLife() == 0) {
             
           break;
           
          }
		}
        
             System.out.println("FIM DO COMBATE");
         sc.close();

	}
}

