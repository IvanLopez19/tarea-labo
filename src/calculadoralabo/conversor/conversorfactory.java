/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoralabo.conversor;
import calculadoralabo.abstractfactory;
import calculadoralabo.aritmetica.aritmetica;
/**
 *
 * @author Ivan Lopez
 */
public class conversorfactory implements abstractfactory{

    @Override
    public aritmetica getaritmetica(String type) {
        return null;
    }

    @Override
    public conversor getconversor() {
        return new binario();
    }
    
}
