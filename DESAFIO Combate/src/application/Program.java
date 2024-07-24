package application;

import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite os dados do primeiro campeão: ");
		System.out.print("Nome: ");
		String name = sc.next();
		System.out.print("Vida inicial: ");
		int life = sc.nextInt();
		System.out.print("Ataque: ");
		int attack = sc.nextInt();
		System.out.print("Armadura: ");
		int armor = sc.nextInt();

		Champion a = new Champion(name, life, attack, armor);

		System.out.println();

		System.out.println("Digite os dados do segundo campeão: ");
		System.out.print("Nome: ");
		String name1 = sc.next();
		System.out.print("Vida inicial: ");
		int life1 = sc.nextInt();
		System.out.print("Ataque: ");
		int attack1 = sc.nextInt();
		System.out.print("Armadura: ");
		int armor1 = sc.nextInt();

		Champion b = new Champion(name1, life1, attack1, armor1);

		System.out.println();

		System.out.print("Quantos turnos você deseja executar? ");
		int n = sc.nextInt();
		
		System.out.println();

		for (int i = 0; i < n; i++) {
			System.out.println("Resultado do turno " + (i + 1) + ":");

			a.takeDamage(b);
			b.takeDamage(a);

			System.out.println(a.status());
			System.out.println(b.status());

			if (a.getLife() == 0 || b.getLife() == 0) {
				break; // Termina o combate se um dos campeões morrer
			}

			System.out.println();
		}

		System.out.println();

		System.out.println("FIM DO COMBATE");

		sc.close();
	}
}
