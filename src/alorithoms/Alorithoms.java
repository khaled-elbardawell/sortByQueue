/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alorithoms;

import javax.swing.JOptionPane;
public class Alorithoms {

  public static  Queue q=new Queue();
  public static   Queue qu[]=new Queue[10];
 public static   Queue qu1[]=new Queue[100];        
 public static   Queue qu2[]=new Queue[10];        

    public static void main(String[] args) {
       
        boolean bo=true;
        while(bo){
            
        int x=JOptionPane.showConfirmDialog(null, "Do you want to add a new number?","confirm",0);
        if(x==0){
          String numS=  JOptionPane.showInputDialog(null,"add a number from 0 to 999");
          int num=Integer.parseInt(numS);
          if(num>=0 && num<=999){
              q.enqueue(num);
          }else {
              JOptionPane.showMessageDialog(null,"an error occurred,Please add a number from 0 to 999");
          }
          
        }else{
            bo=false;
        }
            }
        
     
        
        
        q.pass1();            
        q.contact(qu);
        
        
        q.pass2();
        q.contact(qu1);
        
         q.pass3();
        q.contact(qu2);
        
        
         q.print();

    }
    
}
