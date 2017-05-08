/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simple
 */
public class experimental {
    public float[] layerProgapagate(float[] inputs, float weights[][], float[] bias, boolean activation){
        float[] val = new float[weights[0].length];
        for( int i = 0; i < weights.length; i++){
            for(int ii = 0;ii < weights[i].length;ii++){                   
                val[ii] = val[ii] +  synapse(inputs[i] , weights[i][ii]); 
                
                if(activation){ //activation on layer
                    val[ii] = Activate(val[ii] +  synapse(inputs[i] , weights[i][ii]));  
                }
                
                if(bias!=null)//bias if layer has
                    val[ii] = addbias(val[ii], bias[ii]);
            }
        }
        return val;
    }
    
    public float synapse(float x ,float w){
        return x * w;
    }
    public float addbias(float value, float bias){
        return value + bias;
    }
    public float Activate(float x){
        return (float) (1/(1+Math.exp(-x)));       
    }
}
