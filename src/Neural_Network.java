/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simple
 */

public class Neural_Network {
    float trainVal;
    float[] inputs;
    float[] hidden;
    float hiddenW[][];
    float[] bias;
    float[] outputW;
    float output;
    
    //adjusting values
    float deltahiddenW[][];
    float deltabias[];
    float deltaoutputW[];
    float rate = (float) 0.01;
    
    public void init(){
        initializer weit = new initializer();
        hiddenW = weit.layerOneRandomWeights();
        bias = weit.SetBias();
        outputW = weit.layerTwoRandomWeights();
    }

    public float forwardPropagate( float input[] , float[][] hiddW , float outW[]){ 
        return outputActivate(outputProp(forwardActivate(forwardProp(input , hiddW)) , outW));
    }
    
    public float sigmoid(float x){
        return (float) (1/(1+Math.exp(-x)));
    }
    public float synapse(float x ,float w){
        return x * w;
    }
    public float[] forwardProp(float[] inputs ,float weights[][]){
        float[] val = new float[weights[0].length];
        for( int i = 0; i < weights.length; i++){
            for(int ii = 0;ii < weights[i].length;ii++){                   
                val[ii] = val[ii] +  synapse(inputs[i] , weights[i][ii]) + bias[ii];
            }
        }
        return val;
    }
    public float[] forwardActivate(float[] val){
        for(int i = 0; i < val.length ; i++){
            val[i] = sigmoid(val[i]);
        }
        return val;
    }
    public float outputProp(float[] outJ,float[] weights){
        float val= 0;
        for(int i = 0; i < weights.length ; i++){
            val = val + synapse(outJ[i],weights[i]);
        }
        return val;
    }
    public float outputActivate(float val){
        return sigmoid(val);
    }
    
    
    //backpropagate area
    
    public float deltaK(float outK, float trainK)
    {
        return outK * (1 - outK) * (outK - trainK);
    }
    

    public float deltaJ(float outJ,float weight)
    {   
        float dk=0;
        //for(int i=0;i<outputW.length;i++){
            dk = dk + deltaK(output , trainVal) * weight;
        //}
        return outJ * (1 - outJ) * dk;
    }
    
    public void backPropagate(){
        
        for(int i = 0;i < hidden.length;i++){
            deltaoutputW[i] = rate * hidden[i] * deltaK(output , trainVal);
            outputW[i] = outputW[i] + deltaoutputW[i];
           
            deltabias[i] = rate * deltaJ(hidden[i], outputW[i]);
            bias[i] = deltabias[i] + bias[i]; 
        }
        
        for(int i = 0;i < inputs.length;i++){
            for(int ii = 0;i < hidden.length;ii++){
                 deltahiddenW[i][ii] = rate * inputs[i] * deltaJ(hidden[ii], outputW[ii]);
                hiddenW[i][ii] = deltahiddenW[i][ii] + hiddenW[i][ii];
            }
        }       
    }
    
}