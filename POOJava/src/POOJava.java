import java.util.Scanner;

public class POOJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CuentaBancaria cuenta_personal = new CuentaBancaria("Miguel Alexis",
				675);
		CuentaBancaria cuenta_secundaria = new CuentaBancaria("Sebastian elkks",
				9875);
		cuenta_secundaria.setSaldo(-1250);
		System.out.println(cuenta_secundaria.getSaldo());
		
		/**
		 * menu cajero
		 * 1. retiro
		 * 2. deposito
		 * 3.imprimir saldo
		 * 4. estado de uenta
		 * 5 Agregar beneficiario
		 * 6 salir
		 */
		
		/* comentado para un siguiente ejericico 
		int opcion = 0;
		
		do {
			Scanner leer = new Scanner(System.in);
			
			System.out.println("Menu cuenta banaria");
			System.out.println("Ingrese la opcion deseada");
			System.out.println("1. Retiro");
			System.out.println("2. Deposito");
			System.out.println("3. Imprimir saldo");
			System.out.println("4. Estado de cuenta");
			System.out.println("5. Cambiar usuario");
			System.out.println("6. Salir");
			
			opcion = leer.nextInt();
			
			switch(opcion) {
			case 1:
				System.out.println("Ingrese la cantidad que desea retirar");
				float monto = leer.nextFloat();
				cuenta_personal.retiros(monto);
				break;
			case 2:
				System.out.println("Ingrese la cantidad que desea depositar");
				float deposito = leer.nextFloat();
				cuenta_personal.depositos(deposito);
				break;
			case 3:
				System.out.println("Su saldo es: " + 
				cuenta_personal.consultarSaldo());
				break;
			case 4:
				System.out.println("El nombre del beneficiario es " +
			cuenta_personal.beneficiario);
				break;
			case 5:
				System.out.println("Ingrese un nuevo beneficiario");
				String nombre = leer.next();
				cuenta_personal.beneficiario = nombre;
				break;
		}
			
			
		} while(opcion != 6); 
			
		*/
			
		
	}
}
		
		
		/*
		cuenta_personal.beneficiario = "Miguel Alexis";
		System.out.println("Ingresa un monto a depositar");
		float deposito = leer.nextFloat();
		
		System.out.println("Ingresa un monto a retirar");
		float retiro = leer.nextFloat();
		
		cuenta_personal.depositos(deposito);
		cuenta_personal.retiros(retiro);
		System.out.println("Tu saldo actual es " + cuenta_personal.consultarSaldo());
		
		System.out.println(cuenta_personal.beneficiario);
		
		CuentaBancaria cuenta_papa = new CuentaBancaria();
		cuenta_papa.beneficiario = "Miguel";
		
		System.out.println(cuenta_papa.beneficiario);*/
	
	
	
