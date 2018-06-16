/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoralabo.aritmetica;
import calculadoralabo.abstractfactory;
import calculadoralabo.conversor.conversor;
/**
 *
 * @author LN710Q
 */
public class aritmeticafactory implements abstractfactory{

    @Override
    public aritmetica getaritmetica(String type) {
        switch(type){
            case "suma":
                return new Suma();
            case "resta":
                return new resta();
            case "multiplicacion":
                return new multiplicacion();
            case "division":
                return new division();
        }
         return null;   
    }

    @Override
    public conversor getconversor() {
        return null;
    }
}
