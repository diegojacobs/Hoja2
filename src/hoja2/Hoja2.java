/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hoja2;
//Roberto Chiroy 13027
//Diego Jacobs 13160


/**
 *
 * @author Usuario
 */
public class Hoja2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        myStack st = new myStack();
        LeerArchivo entrada = new LeerArchivo();
        Evaluar check = new Evaluar();
        String expr;
        int num, num2;
        System.out.print("La expresión es: ");
        System.out.print(entrada.postfix());
        
        expr = entrada.postfix();
        
        for (int i=1;i<=expr.length();i++)
        {
            String car;
            car = expr.substring(i-1, i);
            if("num".equals(check.operacion(car))) 
            {
                num = Integer.parseInt(car);
                st.push(num);
            }
            if ("resta".equals(check.operacion(car)))
            {
                num=st.pop();
                num2=st.pop();
                num=num2-num;
                st.push(num);
            }
            if ("suma".equals(check.operacion(car)))
            {
                num=st.pop();
                num2=st.pop();
                num=num+num2;
                st.push(num);
            }
            if ("por".equals(check.operacion(car)))
            {
                num=st.pop();
                num2=st.pop();
                num=num*num2;
                st.push(num);
            }
            if ("dividir".equals(check.operacion(car)))
            {
                num=st.pop();
                num2=st.pop();
                num=num2/num;
                st.push(num);
            }
        }
        num=st.pop();
        System.out.print("\nEl resultado es: ");
        System.out.print(num);
    }
    
}
