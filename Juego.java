/*
 * Adaya Isui Escobar Fortis
 * 16 de octubre de 2020
 * prueba de juego en ejercicios arreglos
 */
import java.util.*;

public class Juego {

	public static void imprimeArreglo(char a[], int n) {
		int i; 
		for(i=0;i<n;i++)
			System.out.print(a[i]+"  ");
			System.out.println();
	}
	
	public static void juegaAhorcado(int nump, char[] p1, char[] p2, 
			char[] p3) {
		int n,o,p;
		Scanner lectura;
		boolean ganar;
		int i,j;
		String guess;
		ArrayList<Integer> posiciones;
		posiciones= new ArrayList<Integer>();
		int contador;
		
		
		
		lectura= new Scanner(System.in);
		contador=1;
		n=p1.length;
		o=p2.length;
		p=p3.length;
		ganar=false;
		char verificar1[]= new char[n];
		char verificar2[]= new char[o];
		char verificar3[]= new char[p];
		
		verificar1[0]=p1[0];
		verificar2[0]=p2[0];
		verificar3[0]=p3[0];
		
		switch(nump) {
		
		case(1):
			System.out.println("Tienes:  "+ n*2 +" intentos");
			System.out.println("Tiene: "+(n)+" letras");
			System.out.println("Empieza con la letra: "+p1[0]);
			
			i=0;
			while(i<=(n*2) && ganar==false) {
				System.out.println("Dame una letra");
				guess=lectura.next();
				
				
				posiciones= new ArrayList<Integer>();
				for(j=1;j<=(n-1);j++) {
					
					
					if(p1[j]==guess.charAt(0)) {
						posiciones.add(j+1);
						verificar1[j]=guess.charAt(0);
						contador=contador+1;
					}
				}
				if(posiciones.size()==0) {
					System.out.println("Incorrecto, pierdes un intento");
					ganar=false;
					i++;
				}
				else
					System.out.println("La letra: "+guess+"Se encuentra en las posiciones: "+posiciones.toString());
					if(p1.length==contador)
						ganar=true;
					else {
						ganar=false;
						i++;
					}
			}
			if(ganar==true)
				System.out.println("Ganaste");
			else
				System.out.println("Perdiste");
			break;
			
			
		case(2): //palabra2
			System.out.println("Tienes:  "+ o*2 +" intentos");
			System.out.println("Tiene: "+(o)+" letras");
			System.out.println("Empieza con la letra: "+p2[0]);
			
			i=0;
			while(i<=(o*2) && ganar==false) {
				System.out.println("Dame una letra");
				guess=lectura.next();
				
				posiciones= new ArrayList<Integer>();
				for(j=1;j<=(o-1);j++) {
					
					
					if(p2[j]==guess.charAt(0)) {
						posiciones.add(j+1);
						verificar2[j]=guess.charAt(0);
						contador=contador+1;
						
					}
				}
				if(posiciones.size()==0) {
					System.out.println("Incorrecto, pierdes un intento");
					ganar=false;
					i++;
				}
				else
					System.out.println("La letra: "+guess+"Se encuentra en las posiciones: "+posiciones.toString());
					if(p2.length==contador)
						ganar=true;
					else {
						ganar=false;
						i++;
					}
					
			}
			if(ganar==true)
				System.out.println("Ganaste");
			else
				System.out.println("Perdiste");
			break;
			
		case(3):
			System.out.println("Tienes:  "+ p*2 +" intentos");
			System.out.println("Tiene: "+(p)+" letras");
			System.out.println("Empieza con la letra: "+p3[0]);
			
			i=0;
			while(i<=(p*2) && ganar==false) {
				System.out.println("Dame una letra");
				guess=lectura.next();
				
				posiciones= new ArrayList<Integer>();
				for(j=1;j<=(p-1);j++) {
					
					
					if(p3[j]==guess.charAt(0)) {
						posiciones.add(j+1);
						verificar3[j]=guess.charAt(0);
						contador=contador+1;
					}
				}
				if(posiciones.size()==0) {
					System.out.println("Incorrecto, pierdes un intento");
					ganar=false;
					i++;
				}
				else
					System.out.println("La letra: "+guess+"Se encuentra en las posiciones: "+posiciones.toString());
					if(p3.length==contador)
						ganar=true;
					else {
						ganar=false;
						i++;
					}
					
			}
			if(ganar==true)
				System.out.println("Ganaste");
			else
				System.out.println("Perdiste");
			break;
		}
		
		
			
	}

	
	public static void main(String[] args) {
		Scanner lectura;
		String palabra1;
		String palabra2;
		String palabra3;
		int n,o,p;
		int i;
		char c;
		int nump;
		
		
		
		
		lectura= new Scanner(System.in);
		System.out.println("Dame la primera palabra");
		palabra1=lectura.next();
		
		System.out.println("Dame la segunda palabra");
		palabra2=lectura.next();
		
		System.out.println("Dame la tercera palabra");
		palabra3=lectura.next();
		
		n=palabra1.length();
		o=palabra2.length();
		p=palabra3.length();
	
		
		/*System.out.println(n);
		System.out.println(o);
		System.out.println(p); */
		
		char[] p1 = new char[n];
		char[] p2 = new char[o];
		char[] p3 = new char[p];
		
		for(i=0;i<n;i++) {
			
		c=palabra1.charAt(i);
		p1[i]=c;
		}
		
		//imprimeArreglo(p1,p1.length);
		
		for(i=0;i<o;i++) {
			c=palabra2.charAt(i);
			p2[i]=c;
		}
		
		//imprimeArreglo(p2,p2.length);
		
		for(i=0;i<p;i++) {
			
			c=palabra3.charAt(i);
			p3[i]=c;
			}
			
		//imprimeArreglo(p3,p3.length);
		
		
		nump=(int) Math.floor(Math.random()*3+1);
		
		System.out.println(nump);
		
		juegaAhorcado(nump,p1,p2,p3);
		
	}
	
	

}
