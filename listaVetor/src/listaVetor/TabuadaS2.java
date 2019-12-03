package amanhaS2;
import java.util.*;
public class TabuadaS2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int a[], i2 = 0, b[], sn = 0;
		
		a = new int[5];
		b = new int[10];
		
		for(int i = 0; i < 5; i++) {
			System.out.println("informe o "+(i+1)+" numero pls");
			a[i] = leia.nextInt();
		}
		do{
			b[i2] = a[i2] * 1; 
			System.out.println(a[i2]+" x  1 = "+b[i2]);
			
			b[i2] = a[i2] * 2; 
			System.out.println(a[i2]+" x  2 = "+b[i2]);
			
			b[i2] = a[i2] * 3;
			System.out.println(a[i2]+" x  3 = "+b[i2]);
			
			b[i2] = a[i2] * 4;
			System.out.println(a[i2]+" x  4 = "+b[i2]);
			
			b[i2] = a[i2] * 5;
			System.out.println(a[i2]+" x  5 = "+b[i2]);
			
			b[i2] = a[i2] * 6; 
			System.out.println(a[i2]+" x  6 = "+b[i2]);
			
			b[i2] = a[i2] * 7; 
			System.out.println(a[i2]+" x  7 = "+b[i2]);
			
			b[i2] = a[i2] * 8; 
			System.out.println(a[i2]+" x  8 = "+b[i2]);
			
			b[i2] = a[i2] * 9; 
			System.out.println(a[i2]+" x  9 = "+b[i2]);
			
			b[i2] = a[i2] * 10; 
			System.out.println(a[i2]+" x  10 = "+b[i2]);
			
			
			System.out.println();
			System.out.println();
			System.out.println("deseja continuar? entre com 1 para sim e 2 para não.");
			sn = leia.nextInt();
			
			if(sn == 1) {
				i2++;
			}
		}while(i2 < 5);
		

	}

}
