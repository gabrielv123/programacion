package evaluacion1;

import java.util.Scanner;

public class ROMANOS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n , decenas , unidad ;
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		System.out.println("introduce un numero");
		
		n= teclado.nextInt();
		
		unidad = n%10;
		decenas = n/10;
		
		
		if (n>=0 && n<=99);{
		
		switch(decenas) {
		
		
		case 1:
		
			System.out.print("X");
			
			break;
		
		case 2: 
		
			System.out.print("XX");	
			
			break;
			
		case 3: 
			
			System.out.print("XXX");
			
			break;
			
		case 4: 
			
			System.out.print("XL");
			
			break;
			
		case 5: 
			
			System.out.print("L");
			
			break;
			
		case 6: 
			
			System.out.print("LX");
			
			break;
			
		case 7: 
			
			System.out.print("LXX");
			
			break;
			
		case 8: 
			
			System.out.print("LXXX");
			
			break;
			
		case 9: 
			
			System.out.print("XC");
			
		break;
			
		}
		
	switch(unidad) {
		
	case 1:
		
		System.out.print("I");
		
		break;
	
	case 2: 
	
		System.out.print("II");	
		
		break;
		
	case 3: 
		
		System.out.print("III");
		
		break;
		
	case 4: 
		
		System.out.print("IV");
		
		break;
		
	case 5: 
		
		System.out.print("V");
		
		break;
		
	case 6: 
		
		System.out.print("VI");
		
		break;
		
	case 7: 
		
		System.out.print("VII");
		
		break;
		
	case 8: 
		
		System.out.print("VIII");
		
		break;
		
	case 9: 
		
		System.out.print("IX");
		
		break;
	
		
	}
		}
		}
	}
	

	

