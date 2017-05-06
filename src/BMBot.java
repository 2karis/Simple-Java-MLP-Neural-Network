/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simple
 */
import java.util.Scanner;

public class BMBot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        weights weit = new weights();
        Scanner get = new Scanner(System.in);
        System.out.print("\nhours slept : ");
        int hours = get.nextInt();
        System.out.print("\nhours studied : ");
        int study = get.nextInt();
        System.out.print("\nfinal grade : ");
        int train = get.nextInt();
        double Hours = (double) hours / 7;
        double Study = (double) study / 9;
        double Train = (double) train / 100;
        double[] input = {Hours,Study};
        double[][] hiddW =weit.layerOneRandomWeights();
        double[] outW = weit.layerTwoRandomWeights();
        
        Neuron money = new Neuron();
        
        double yHat = money.forwardPropagate(input,hiddW,outW);
        
        System.out.println(yHat);        
              
    }
    
//make use of 3 dimentional arrays    
}