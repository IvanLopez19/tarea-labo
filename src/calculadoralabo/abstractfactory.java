/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoralabo;
import calculadoralabo.aritmetica.aritmetica;
import calculadoralabo.conversor.conversor;

/**
 *
 * @author LN710Q
 */
public interface abstractfactory {
    
     aritmetica getaritmetica(String type);
     conversor getconversor();
    
}
