/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo02;

import org.apache.commons.lang3.RandomUtils;

/**
 *
 * @author reroes
 */
public class Ejemplo002 {
    
    public static void main(String[] args) {
        int v = RandomUtils.nextInt(20, 25);
        
        System.out.printf("%d\n", v);
    }
}
