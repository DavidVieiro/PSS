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
public class HolaRunnable implements Runnable {
 
        @Override
	public void run() {
        System.out.println("27DVP-Hola desde un thread!");
	}
 
	public static void main(String args[]) {
    	(new Thread(new HolaRunnable())).start();
	}
 
}

