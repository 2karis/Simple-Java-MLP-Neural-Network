/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simple
 */
import java.util.Random;

public class weights {
    
    public double[][] layerOneRandomWeights(){
        double[][] val = new double[2][3];
        Random rand = new Random(); 
        for(int i = 0;i < val.length; i++){
             for( int ii = 0; ii < val[i].length; ii++){
                val[i][ii] = rand.nextDouble();  
            }
        }
        return val;
    }
    
    public double[] layerTwoRandomWeights(){
        double val[] = new double[3];
        Random rand = new Random();
        for( int i = 0;i < val.length;i++){
            val[i] = rand.nextDouble();
        }
        return val;
    }
    
}
