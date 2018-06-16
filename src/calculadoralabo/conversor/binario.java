/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoralabo.conversor;

import java.util.ArrayList;

/**
 *
 * @author LN710Q
 */
public class binario implements conversor{

    @Override
    public String convertir(int a) {
       ArrayList<String> lista= new ArrayList<String>();
       int residuo;
       String binario=" ";
       do{
           residuo=a%2;
           a=a/2;
           lista.add(Integer.toString(residuo));
       }while(a>2);
       
       lista.add(Integer.toString(a));
       
       for(int i=lista.size()-1; i<=0; i--){
           binario=binario+lista.get(i);
       }
        return binario;
    }
}
