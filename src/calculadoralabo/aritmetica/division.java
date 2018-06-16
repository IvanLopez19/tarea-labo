/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoralabo.aritmetica;

/**
 *
 * @author LN710Q
 */
public class division implements aritmetica{

    @Override
    public String operar(int a, int b) {
        int c= a/b;
        String d;
        
        d=Integer.toString(c);
        return d;//To change body of generated methods, choose Tools | Templates.
    }
    
}
