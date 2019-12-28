package alorithoms;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Queue {

    QueueNode front = null;
    QueueNode rear = null;
    public void print() {
        QueueNode temp = front;
         ArrayList ar=new ArrayList();
        while (temp != null) {
            ar.add(temp.item);
            temp = temp.next;
        }
        String message[]=new String[ar.size()];
        for(int i=0;i<ar.size();i++){
            message[i]=ar.get(i)+"";
        }
        JOptionPane.showMessageDialog(null, message);
        
    }

    public boolean isEmpty() {
        if (front == rear) {
            return true;
        } else {
            return false;
        }

    }

    public void enqueue(int item) {
        QueueNode q = new QueueNode();
        q.item = item;
        q.next = null;
        if (front == null) {
            front = rear = q;
        } else {
            rear.next = q;
            rear = rear.next;
        }
    }

    public Object dequeue() {
        Object temp;
        if (front == null) {
            return null;
        } else {
            temp = front.item;
            front = front.next;
            if (front == null) {
                rear = null;
            }
            return temp;
        }
    }
    
    public void contact(Queue que[]){
             
                 for(int i=0;i<que.length;i++){
                     
                       QueueNode temp=que[i].front;
                       while(temp!=null){
                           Alorithoms.q.enqueue(temp.item);
                           temp=temp.next;
                       }
                       
          
      }
    }
    public void pass1(){
        
        
               for(int i=0;i<Alorithoms.qu.length;i++){
         Alorithoms.qu[i]=new Queue();
      }
              
              
              
        int j;
        while(Alorithoms.q.front!=null){
            Object numD =Alorithoms.q.dequeue();
            int n=(int)numD;
             j=n%10;
           
                  for(int i=0;i<Alorithoms.qu.length;i++){
                if(i==j){
                     Alorithoms.qu[i].enqueue((int)numD);
                }

            }
                  
         
        }
    }
    
    
    public void pass2(){
       
            for(int i=0;i<Alorithoms.qu1.length;i++){
         Alorithoms.qu1[i]=new Queue();
      }
        int j;
        while(Alorithoms.q.front!=null){
            Object numD =Alorithoms.q.dequeue();
            int n=(int)numD;
             j=n/10;
           
                  for(int i=0;i<Alorithoms.qu1.length;i++){
                if(i==j){
                     Alorithoms.qu1[i].enqueue((int)numD);
                }

            }
                  
         
        }
    }
    
        public void pass3(){
       
            for(int i=0;i<Alorithoms.qu2.length;i++){
         Alorithoms.qu2[i]=new Queue();
      }
        int j;
        while(Alorithoms.q.front!=null){
            Object numD =Alorithoms.q.dequeue();
            int n=(int)numD;
             j=n/100;
           
                  for(int i=0;i<Alorithoms.qu2.length;i++){
                if(i==j){
                     Alorithoms.qu2[i].enqueue((int)numD);
                }

            }
                  
         
        }
    }
}
