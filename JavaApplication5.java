/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiply;

/**
 *
 * @author Telus
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int  c=0,p=0;
        for(int i=1;i<=1;i++)
        {
            for(int j=1;j<=10;j++)
            {
            //int k=(j%2);
            if ((j%2)!=0)
            {
                p=i*j;
                System.out.println(p);
               //c+=p; 
            }
           c+=p;
          //  System.out.println(i+"*"+j+"="+(i*j));
           // c+=(i*j);
            }
             System.out.print(c);
            // System.out.print("sum="+c);
            System.out.println("=====");
        }
    }
    
}
