/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author Sandy~#
 */
public class Turunan extends Induk{
    public void test (String s){
        System.out.println("Method overload di dalam kelas turunan");
        System.out.println("S:\""+s+"\"");
    }
    public void test(){
        System.out.println("Method overrride di dalam kelas turunan");
        
    }
}
