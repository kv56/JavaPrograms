import java.util.*;

class MyStack
{
    private int top=-1;
    private int stk[] = new int[100];
    boolean empty()
    {
        if(top >= 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    int peek()
    { 
        if(empty())
        {
            System.out.println("n Stack is empty");
            return 0;
        }
        else
        {
            System.out.println("n The top most position of stack holds "+stk[top]);
            return stk[top];
        }
    }
    void push(int num)
    {
        if(top == 100)
        {
            System.out.println("n Stack is in overflow state");
        }
        else
        {
            stk[++top] = num;
            System.out.println("n "+num+" is inserted in stack");
        }
    }
    int pop()
    {
        if(top < 0)
        {
            System.out.println("n Stack is in underflow state");
            return 0;
        }
        else
        {
            int x = stk[top--];
            System.out.println("n "+x+" is been removed from stack");
            return x;
        }
    }
    void disp()
    {
        if(empty())
        {
            System.out.println("n Stack is empty");
        }
        else
        {
            System.out.print("n Stack : ");
            for(int i=0; i<=top; i++)
            {
                System.out.print(" | "+stk[i]);
            }
        }
    }
}

class Stack
{
    public static void main(String []agrs)
    {
        System.out.print("********** Stack using Array **********");
        boolean flag = true;
        Scanner in = new Scanner(System.in);
        int o, num;
        MyStack s = new MyStack();
        while(flag)
        {
            System.out.println('\n'+"\n 1. PUSHn 2. PEEKn 3. POPn 4. DISPLAYn 5. QUITn Select one operation : ");
            o = in.nextInt();
            switch(o)
            {
                case 1:
                    System.out.println(" Enter a number you want to insert in stack : ");
                    num = in.nextInt();
                    s.push(num);
                break;

                case 2:
                    s.peek();
                break;

                case 3:
                    s.pop();
                break;

                case 4:
                    s.disp();
                break;

                case 5:
                    flag = false;
                break;
            }
        }
    }
}