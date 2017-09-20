/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trheads;

/**
 *
 * @author dam231
 */
public class DormirMensajes {
	public static void main(String args[]) throws InterruptedException {
    	String informacion[] = {
        	"27DVP-No temo a los ordenadores; lo que temo es quedarme sin ellos -- Isaac Asimov",
        	"27DVP-El software es un gas: se expande hasta llenar su contenedor -- Nathan Myhrvold",
        	"27DVP-La física es el sistema operativo del Universo -- Steven R Garman",
        	"27DVP-Tus clientes más descontentos son tu mayor fuente de aprendizaje -- Bill Gates"
        };
 
    	for (int i = 0;
         	i < informacion.length;
         	i++) {
        	//Pausa 4 segundos
            Thread.sleep(4000);
        	System.out.println(informacion[i]);
    	}
    }
}

