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
public class JoinThread implements Runnable {
        @Override
	public void run() {
    	System.out.println("27DVP-Primer mensaje por consola");
	}
 
	public static void main(String args[]) throws InterruptedException{
    	Thread t= new Thread(new JoinThread());
    	t.start();
    	t.join();
    	System.out.println("27DVP-Segundo mensaje por consola");
	}
}

