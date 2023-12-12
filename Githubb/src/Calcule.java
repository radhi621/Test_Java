import java.util.Scanner;

public class Calcule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Clavier=new Scanner(System.in);
		int A,B, S, R, D;
System.out.println("Tapez la valeur de A");
A=Clavier.nextInt();

System.out.println("Tapez la valeur de B");
B=Clavier.nextInt();

S=A*B;
R=A/B;
D=A-B;
System.out.println("A*B = "+S);
System.out.println("A/B = "+R);
System.out.println("A-B = "+D);

	}
}