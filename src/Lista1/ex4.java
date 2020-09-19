package Lista1;

public class ex4 {
	public static void main(String[] args) {
		int t1=0, p1=0, m1=0;
		char letra;
		
		for (int i=1; i<=10;i++) {
			System.out.print(i + " ");
		}
		System.out.println(" ");
		
		for (int i=100; i<=110;i++) {
			System.out.print(i + " ");		
		}
		System.out.println(" ");
		
		for (int i=5; i<=50; i++) {
			t1 += i;
		}
		System.out.println("Soma 5 a 50: " + t1);
		
		for (int i=5; i<=50; i++) {
			t1 += i;
		}
		System.out.println("Soma 5 a 50.000: " + t1);
		
		for (int i=5; i<=500000; i++) {
			t1 += i;
		}
		System.out.println("Soma 5 a 500.000: " + t1);
		
		for (int i=0; i<=200; i++) {
			if (i %  2 == 0) {
				p1 += 1;
			}
		}
		System.out.println("Total de pares: " + p1);
		
		System.out.println("Imprimindo cascada de numeros: ");
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println(" ");
		}
		
		for(int i=1000;i<=100000;i++) {
			if(i % 79 == 0) {
				m1 = i;
				System.out.println("Multiplos de 79 (maior que 1000):: " + m1);			
				break;
			} else {
				i++;
			}
		}
		
		System.out.print("Imprimindo os caracteres: ");
		for(int i=28; i<=126; i++) {
			letra = (char) i;
			System.out.print(letra + " ");
		}
	
	}
}
