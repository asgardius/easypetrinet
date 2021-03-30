/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easypetrinet;

/** hola
 *
 * @author asgardius
 */
public class Easypetrinet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int p1 = 1;
        //int p2 = 0;
        //int p3 = 1;
        //int p4 = 0;
        //int p5 = 1;
        int[] places = {1, 0, 1, 0 ,1};
        boolean t1 = false;
        boolean t2 = false;
        boolean t3 = false;
        boolean t4 = false;
        boolean t5 = false;
        if (places[0] >= 1 && places[2] >= 1) {
            t1 = true;
            System.out.println("t1");
        }
        if (places[1] >= 1) {
            t2 = true;
            System.out.println("t2");
        }
        if (places[0] >= 1) {
            t3 = true;
            System.out.println("t3");
        }
        if (places[0] >= 1 && places[4] >= 1) {
            t4 = true;
            System.out.println("t4");
        }
        if (places[3] >= 1) {
            t5 = true;
            System.out.println("t5");
        }
    }
    
}
