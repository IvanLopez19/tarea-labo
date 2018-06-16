/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoralabo;

import calculadoralabo.aritmetica.aritmeticafactory;
import calculadoralabo.conversor.conversorfactory;

/**
 *
 * @author Ivan Lopez
 */
public class factoryproducer {
    public static abstractfactory getFactory(int type){
        switch(type){
            case 1:
                return new aritmeticafactory();
            case 2:
                return new conversorfactory();
        }
        return null;
    }
}
