import java.util.*;
public class stack {
    static Scanner sc=new Scanner(System.in);
    int count=0;

    public void push(int n,int Stack[]){
        System.out.println("enter the stack value:");
        int num=sc.nextInt();
        Stack[count]=num;
        count++;
    }

    public void pop(int n,int Stack[]){
        Stack[--count]=-1;
        display(n,Stack);
    }

    public void search(int num,int Stack[]){
        int temp=0;
        for(int i=0;i<count;i++){
            if(Stack[i]==num){
                temp++;
            }
        }
        if(temp!=0){
            System.out.print("the element is present in stack");
        }
        else{
            System.out.print("the element is not present");
        }
    }

    public void display(int n,int Stack[]){
        System.out.println("the stack elements are:");
        for(int i=0;i<count;i++){
            System.out.print(Stack[i]+" ");
        }
    }

    public static void main(String[] args){

        stack stack=new stack();

        System.out.println("enter the stack length:");
        int n=sc.nextInt();
        int Stack[]=new int[n];

        System.out.println("1.push");
        System.out.println("2.pop");
        System.out.println("3.display");
        System.out.println("4.search");
        System.out.println("5.exit");

        while(true){
            System.out.println("enter the choice:");
            int ch=sc.nextInt();
            if(ch==1){
                if(stack.count<n){
                    stack.push(n,Stack);
                }
                else{
                    System.out.println("the stack is full");
                }
            }
            else if(ch==2){
                if(stack.count-1<0){
                    System.out.println("stack is empty");
                }
                else{
                    stack.pop(n,Stack);
                }
            }
            else if(ch==3){
                stack.display(n,Stack);
            }
            else if(ch==4){
                System.out.println("enter the search element");
                int num=sc.nextInt();

                stack.search(num,Stack);
            }
            else if(ch==5){
                break;
            }
            else{
                System.out.print("invalid choice");
            }
        }
    }
}
