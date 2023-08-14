/*
 * 3. Crie uma fun��o recursiva em Java que 
 * exiba o resultado do fatorial de um n�mero 
 * (pela limita��o da recursividade, o n�mero 
 * de entrada dever� ser baixo para n�o dar estouro
 * (limite de entrada = 12)):
 * 
 * O c�digo deve trazer como coment�rios:
 * A condi��o de parada;
 * Como escrever a fun��o para o termo n em fun��o do termo anterior.
 */

package controller;

public class FatorialRecursivoController {

	public FatorialRecursivoController() {
		super();
	}

	public static long calcularFatorial(int n) {
	        // Condi��o de parada: fatorial de 0 ou 1 � 1
	        if (n == 0 || n == 1) {
	            return 1;
	        }

	        // Chamada recursiva: fatorial de n em fun��o do fatorial de (n - 1)
	        return n * calcularFatorial(n - 1);
	}
}




