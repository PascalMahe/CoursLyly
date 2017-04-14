import java.util.*;

public class Cours14LesBasesIO {

	public static void main(args[]){
		
		System.out.println("Hello world!"); // c'est la tradition : quand on apprend un nouveau 
											// langage, le premier programme qu'on réalise 
											// c'est un programme qui ne fait qu'écrire Hello world!
											
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println(str);
		
		// Ecrire un programme qui calcule demande deux nombres à l'utilisateur, affiche le résultat 
		// de la division et affiche un message d'erreur si le deuxième vaut 0.
		// /!\ Une division renvoie un réel (pas un entier) 
		// => impossible de faire :
		//							int i = 5;
		//							int j = 2;
		//							int k =  i / j;
		
		// Il faut faire			float k =  i / j;
		
		
		
		// Ecrire un programme qui note dans un tableau les valeurs écrites par 
		// l'utilisateur jusqu'à ce qu'il écrive "stop"
		// /!\ Pur comparer 2 chaînes, == ne fonctionne pas, il faut utiliser equalsIgnoreCase :
		// String chain = "ah";
		// String autreChaine = "ah";
		// chain == autreChaine est FAUX
		//chain.equalsIgnoreCase(autreChaine) est VRAI
	}                  

}                      