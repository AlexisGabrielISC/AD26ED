
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author paveg
 */
public class SuperMarket {
    public static void main(String[] args) {
        //Cola
        Queue<Integer> cola=new LinkedList<>();
        //LinkedList<Integer> lista=new LinkedList<>();
        Stack<Integer> pila =new Stack();
        Queue<Queue<Integer>> colaDeColas=new LinkedList<>();
                colaDeColas.add(cola);
                cola.add(5);
        
    }
}
