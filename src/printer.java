/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simple
 */
public class printer {
    
    public printer(){
        
    }
    public void MultArray( double a[][]){
        
        for(int row = 0 ; row < a.length ; row++ ){
            
            for( int col = 0 ; col < a[row].length ; col++){
                
                System.out.print( a[row][col] + " ");
                
            }
            System.out.println();
        }
        
    }
    
    public void singArray(double a[]){
        
        for(int row = 0 ; row < a.length ; row++ ){
            
            System.out.print( a[row] + " ");
        }
        System.out.println();
    }
    public void multiAdd(double a[][]){
        double[] val = new double[a[0].length];
        
         for(int ii = 0;ii < a[0].length;ii++){                      
     
            for(int i = 0; i < a.length;i++){
           
                val[ii] = a[i][ii];
                                
                if(i==a.length-1){
              
                    System.out.print(val[ii]+ ", ");
                
                }

            }

        }
    }
    public void singAdd(double a[]){
        for(int row = 0 ; row < a.length ; row++ ){
            if(row==a.length-1){
                System.out.print( a[row] + " ");
            }
        }
        System.out.println();
    }

    void MultArray(float[][] hiddenCost) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void singArray(float[] outputCost) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
