/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hoja2;

/**
 *
 * @author Usuario
 */
public class myStack {
    private int sp;
    private char[] stack;
    
    public myStack()
    {
        sp = -1;
        stack = new char[100];
    }
    public void push(char car)
    {
        if (sp<100)
        {
            sp++;
            stack[sp] = car;
        }
    }
    public char pop()
    {
        char car;
        car = stack[sp];
        sp--;
        return car;
    }
    public boolean empty()
    {
        return sp==-1;
    }
    public char top()
    {
        return stack[sp];
    }
}
