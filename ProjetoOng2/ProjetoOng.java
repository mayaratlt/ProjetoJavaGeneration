package ProjetoOng2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProjetoOng {
	// Tratamento de erro para não fechar o Programa "case1: Voluntario "
	public static int TratamentoErro(int idade, int codigo) throws ArithmeticException{
		return 0;
	}
	// Tratamento de erro para não fechar o Programa " Menu: variavel op e para opção verba "
	public static int TratamentoErro1(int op) throws ArithmeticException{
		return 0;
	}
	
	// declarando Main
	public static void main(String[] args) {
		
		//declarando variaveis para objetos e calculos
		int op = 0,num = 0; // variaveis de loop das opções 
		float ver,ver2,total = 1000;// variaveis verbas 1 e 2 e valor do caixa = total
		String nome1,cpf1; // variaveis do Objeto 2 
		int idade1,codigo1; // variaveis do Objeto 2 
		
		//declarando Scanner para capturar valor para variaveis 
		// O Luiz usa nome = Leia eu uso nome = Entrada... nome do Scanner 
		try (Scanner entrada = new Scanner(System.in)) {
			
			//declarando objetos vazios
			Voluntario vol2 = new Voluntario("","",0,0); // 4 parametros = 1° nome --- 2°CPF --- 3° idade --- 4°codigo
			Ong ong2 = new Ong("","",0,0); // 4 parametros = 1° nome --- 2°CPF --- 3° idade --- 4°codigo
			Parceiros par2 = new Parceiros("","",0,0); // 4 parametros = 1° nome --- 2°CPF --- 3° idade --- 4°codigo
			Verbas ve = new Verbas("","",0,0,0); // 5 parametros = 1° nome --- 2°CPF --- 3° idade --- 4°codigo 5° verba
			Verbas ve2 = new Verbas("","",0,0,0); // 5 parametros = 1° nome --- 2°CPF --- 3° idade --- 4°codigo 5° verba
			
			do {// DO laço do menu para volta se ouver algum erro
				
				boolean continueLoop1 = true;//variavel boolean enquanto ela for vdd volta ao loop
				
				do {//Do laço do menu para entrar nos Casos do 	(" switch (op) ")
				
				try {//verificação se a erro no Menu
				
				System.out.println("\n\n\t   Menu de Opções... ");
				System.out.println("\n -- Cadastrar novo voluntario -- digite 1");
				System.out.println("\n -- Cadastrar nova     Ong    -- digite 2");
				System.out.println("\n -- Cadastrar novo   Parceiro  -- digite 3");
				System.out.println("\n -- Entrada e Saída de Verbas -- digite 4");
				System.out.println("\n --    Imprimir Informações  -- digite 5");
				System.out.println("\n      -- DIGITE 0 PARA FINALIZAR  --");
				op = entrada.nextInt();
				
				switch (op) {
			
					case 1:
						boolean continueLoop = true;
						do {
							try {
							System.out.println("\n --Cadastrar novo voluntario -- digite 1");
							
							System.out.println("\n Digite o nome: ");
							nome1 = entrada.next();
							System.out.println("\n Digite o CPF: ");
							cpf1 = entrada.next();
							System.out.println("\n Digite a Idade: ");
							idade1 = entrada.nextInt();
							System.out.println("\n Digite o código: ");
							codigo1 = entrada.nextInt();
							// falando que o boolean vai receber valor false para sair do loop 
							continueLoop = false;
							// criando objeto Voluntario 
							Voluntario vol = new Voluntario(nome1,cpf1,idade1,codigo1);
							// passando objeto voluntario vol para objeto voluntario vol2 
							// PQ vol esta só no caso 1... já vol2 esta no Global
							vol2 = vol;
							//imprimi Objeto voluntario
							vol.imprimirVoluntario();
						}
						catch(InputMismatchException inputMismatchExceptio) {// função para tratamento de erro  
							
							//System.err.printf("\n Exception: %s ",inputMismatchExceptio);
							entrada.nextLine();
							System.err.println("\n\t   Opção inválida ");
							System.out.println("");
							System.out.println("\n     Por favor tente novamente...");
						}
						}while(continueLoop);
						break;
						
					case 2:
						boolean continueLoo = true;
						do {
						
						try {
						System.out.println("\n --Cadastrar nova     Ong    -- digite 2");
						
						System.out.println("\n Digite o nome: ");
						nome1 = entrada.next();
						System.out.println("\n Digite o CPF: ");
						cpf1 = entrada.next();
						System.out.println("\n Digite a Idade: ");
						idade1 = entrada.nextInt();
						System.out.println("\n Digite o código: ");
						codigo1 = entrada.nextInt();
						
						continueLoo = false;
						
						Ong ong = new Ong(nome1,cpf1,idade1,codigo1);
						
						ong2 = ong;
						
						ong.imprimirOng();
						}
						catch(InputMismatchException inputMismatchExceptio) {//exceção de entrada de 
						
							//System.err.printf("\n Exception: %s ", inputMismatchExceptio);
							entrada.nextLine();
							System.err.println("\n\t   Opção inválida ");
							System.out.println("");
							System.out.println("\n     Por favor tente novamente...");
						}
						
					}while(continueLoo);
						break;
					case 3:
						boolean continueLo = true;
						do {
						
							try {
							System.out.println("\n --Cadastrar novo   Parceiro  -- digite 3");
							
							System.out.println("\n Digite o nome: ");
							nome1 = entrada.next();
							System.out.println("\n Digite o CPF: ");
							cpf1 = entrada.next();
							System.out.println("\n Digite a Idade: ");
							idade1 = entrada.nextInt();
							System.out.println("\n Digite o código: ");
							codigo1 = entrada.nextInt();
							
							Parceiros par = new Parceiros(nome1,cpf1,idade1,codigo1);;
							par2 = par;
							
							continueLo = false;
							
							par.imprimirParceiro();
						
							}
							catch(InputMismatchException inputMismatchException) {//exceção de entrada de 
							
								//System.err.printf("\n Exception: %s ", inputMismatchExceptio);
								entrada.nextLine();
								System.err.println("\n\t   Opção inválida ");
								System.out.println("");
								System.out.println("\n     Por favor tente novamente...");
							}
							
						}while(continueLo);
						break;
					case 4:
						//para entrada e saída de dinheiro 
						boolean continueL = true;
						do {
						
							try {
							System.out.println("\n --Entrada e Saida de Verbas -- digite 4");
							System.out.println("\n Digite 0 para entrada \n \t ou \n Digite 1 para saída");
							// variavel num para poder cair no laço if entrada ou saida de verba.
							num = entrada.nextInt();
							
								if(num == 0) {
									
									System.out.println("\n Digite o nome: ");
									nome1 = entrada.next();
									System.out.println("\n Digite o CPF: ");
									cpf1 = entrada.next();
									System.out.println("\n Digite a Idade: ");
									idade1 = entrada.nextInt();
									System.out.println("\n Digite o código: ");
									codigo1 = entrada.nextInt();
									System.out.println("\n Digite o valor da Verba: ");
									ver = entrada.nextInt();
									
									Verbas verba = new Verbas(nome1,cpf1,idade1,codigo1,ver);
									ve = verba;
									
									//Adicionando verba ao total 
									total = total + ver;
									
									//System.out.println("\n Valor total em caixa : R$"+total);
									
									verba.imprimirVerba();
									System.out.println("\n Valor Total do em Caixa : R$"+total);
									
								}else if(num == 1) {
									

									System.out.println("\n Digite o nome: ");
									nome1 = entrada.next();
									System.out.println("\n Digite o CPF: ");
									cpf1 = entrada.next();
									System.out.println("\n Digite a Idade: ");
									idade1 = entrada.nextInt();
									System.out.println("\n Digite o código: ");
									codigo1 = entrada.nextInt();
									System.out.println("\n Digite o valor da Verba: ");
									ver2 = entrada.nextInt();
									
									Verbas verba2 = new Verbas(nome1,cpf1,idade1,codigo1,ver2);
									ve2 = verba2;
									
									//subtraindo verba do total
									total -=ver2;
									
									//System.out.println("\n Valor total em caixa : R$"+total);
									
									verba2.imprimirVerba2();
									System.out.println("\n Valor Total do em Caixa : R$"+total);
									
								}else {//se caso a pessoa não escolher caso 1 ou caso 2
									System.out.println("\n Opção inválida...");
									System.out.println("\n Por favor tente novamente...");
								}
							continueL = false;
							
							}
						catch(InputMismatchException inputMismatchExceptio) {//exceção de entrada de 
						
							//System.err.printf("\n Exception: %s ", inputMismatchExceptio);
							entrada.nextLine();
							System.err.println("\n\t   Opção inválida ");
							System.out.println("");
							System.out.println("\n     Por favor tente novamente...");
						}
						
					}while(continueL);
						break;
					case 5:
						System.out.println("\n --Imprimir Informações      -- digite 5");
						
						System.out.println("\n voluntario ");
						vol2.imprimirVoluntario();
						
						System.out.println("\n  Ong  ");
						ong2.imprimirOng();
						
						System.out.println("\n Parceiro");
						par2.imprimirParceiro();
						
						System.out.println("\n Verba de Entrada... ");
						ve.imprimirVerba();
						
						System.out.println("\n Verba de Saída... ");
						ve2.imprimirVerba2();
						
						System.out.println("\n Valor total em caixa é : R$"+total);
						
						break;
					default:
						if(op != 0) {
						System.err.println("\n \tOpção Inválida...");
						System.out.println("\n Por favor tente novamente...");
						}
					}
				
					continueLoop1 = false;
				
					}
					catch(InputMismatchException inputMismatchExceptio) {//exceção de entrada de 
						
						//System.err.printf("\n Exception: %s ",inputMismatchExceptio);
						entrada.nextLine();
						System.err.println("\n\t   Opção inválida ");
						System.out.println("");
						System.out.println("\n     Por favor tente novamente...");
					}
				
				}while(continueLoop1);
			
			}while(op != 0 );
		} catch (ArithmeticException e) {
			 
			e.printStackTrace();
		}
		
		System.out.println("\n Fim do Programa...");
		System.out.println("\n Obrigado por utilizar o Programa...");
	}
}
//Runtime.getRuntime().exec("clear");
//new ProcessBuilder("cls").inheritIO().start().waitFor();
