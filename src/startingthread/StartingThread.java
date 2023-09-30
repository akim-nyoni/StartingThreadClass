/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package startingthread;

/**
 *
 * @author Akim Nyoni
 */

class SingleThread extends Thread {
    public void run(){
        for(int img = 1; img <= 10; img++){
            System.out.println(img+ " Printed from Printer 1");
        }
    }

}

public class StartingThread {

    public static void main(String[] args) {
        SingleThread t = new SingleThread();
        t.start();
        
        for(int i = 1;i<=10;i++){
            System.out.println(i+ " Printed from Printer 2");
        }
    }
}
