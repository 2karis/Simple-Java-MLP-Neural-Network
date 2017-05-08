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

public class initializer {
    
    public float[][] layerOneRandomWeights(){
        float[][] val = new float[2][3];
        Random rand = new Random(); 
        for(int i = 0;i < val.length; i++){
             for( int ii = 0; ii < val[i].length; ii++){
                val[i][ii] = rand.nextFloat();  
            }
        }
        return val;
    }
    
    public float[] SetBias(){
        float[] b = new float[3];
        for(int i=0; i<b.length; i++){
            b[i] = 0;
        }
        return b;
    }
    
    public float[] layerTwoRandomWeights(){
        float val[] = new float[3];
        Random rand = new Random();
        for( int i = 0;i < val.length;i++){
            val[i] = rand.nextFloat();
        }
        return val;
    }
    
}
