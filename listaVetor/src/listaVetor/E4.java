package listaVetor;
import java.util.*;
public class E4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int valor[] = new int[10];
		int maior = 0, menor = Integer.MAX_VALUE; 
		
		for(int i = 0; i < valor.length; i++){
			System.out.print("Digite o " +(i+1)+"º valor: ");
			valor[i] = in.nextInt();
			if(valor[i] > maior){ 
				maior = valor[i];
				if(valor[i] <= menor){
					menor = valor[i];
				}
			}
		}
	
		System.out.println("o maior numero é = "+ maior);
		System.out.println("o menor numero é = "+ menor);
	}
}