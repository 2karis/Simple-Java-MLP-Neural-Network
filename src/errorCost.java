/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simple
 */
public class errorCost {
    
    public double outputData;
        
    public double outputCost[];

    public double activatedVals[];

    public double layerTwoWeights[];
        
    public double hiddenCost[][];
    //expected output
    public double trainData;
    
    public double inputs[];
    //computed output
    public printer print;
    
    
    
    public errorCost(){
        print = new printer();
    }
    
    public double deltaK(double outK, double train)
    {
        return outK * (1 - outK) * (outK - train);
    }
    
    public void ouputCost()
    {
        for(int i = 0;i < activatedVals.length;i++){
            outputCost[i] = activatedVals[i] * deltaK(outputData , trainData);
        }
        print.singArray(outputCost);
    }
    
    public double deltaJ(double outJ,double weight)
    {
        return outJ * (1 - outJ) * deltaK(outputData , trainData) * weight ;
    }

    public void hiddenCost()
    {
        for(int i = 0;i < inputs.length;i++){
            for(int ii = 0;i < activatedVals.length;ii++){
                hiddenCost[i][ii] = inputs[i] * deltaJ(activatedVals[ii], layerTwoWeights[ii]);
            }
        }
        print.MultArray(hiddenCost);
    }
    
}
