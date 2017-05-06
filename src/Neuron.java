/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simple
 */

public class Neuron {

    public double forwardPropagate( double input[] , double[][] hiddW , double outW[]){ 
        return outputActivate(outputProp(forwardActivate(forwardProp(input , hiddW)) , outW));
    }
    
    public double sigmoid(double x){
        return 1/(1+Math.exp(-x));
    }
    public double synapse(double x ,double w){
        return x * w;
    }
    public double[] forwardProp(double[] inputs ,double weights[][]){
        double[] val = new double[weights[0].length];
        for( int i = 0; i < weights.length; i++){
            for(int ii = 0;ii < weights[i].length;ii++){                   
                val[ii] = val[ii] +  synapse(inputs[i] , weights[i][ii]);
            }
        }
        return val;
    }
    public double[] forwardActivate(double[] val){
        for(int i = 0; i < val.length ; i++){
            val[i] = sigmoid(val[i]);
        }
        return val;
    }
    public double outputProp(double[] outJ,double[] weights){
        double val= 0;
        for(int i = 0; i < weights.length ; i++){
            val = val + synapse(outJ[i],weights[i]);
        }
        return val;
    }
    public double outputActivate(double val){
        return sigmoid(val);
    }
}