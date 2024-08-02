import java.util.*;
public class two_stack {
    static Scanner sc = new Scanner(System.in);
    int f=-1,b=0;

    public void push(int n,int stack[]){
        
        if((f+1)<b || f<(b-1)){
            System.out.println("1.front");
            System.out.println("2.back");
            System.out.println("enter the way to push:");
            int ch=sc.nextInt();
            System.out.println("enter the element:");
            int num=sc.nextInt();

            if(ch==1){
                f+=1;
                stack[f]=num;
            }
            else if(ch==2){
                b-=1;
                stack[b]=num;
            }
            else{
                System.out.println("invalid choice");
                push(n,stack);
            }
        }
        else{
            System.out.println("stack is full");
        }
    }

    public void pop(int n,int stack[]){
        System.out.println("1.front");
        System.out.println("2.back");
        System.out.println("enter the way to pop:");
        int ch=sc.nextInt();

        if(ch==1){
            if(f<0){
                System.out.print("front stack is empty");
            }
            else{
                stack[f]=-1;
                f-=1;
            }
        }
        else if(ch==2){
            if(b>=n){
                System.out.print("back stack is empty");
            }
            else{
                stack[b]=-1;
                b+=1;
            }
        }
        else{
            System.out.println("invalid choice");
            pop(n,stack);
        }
        display(n,stack);
    }

    public void search(int n,int stack[]){
        System.out.print("enter the search element:");
        int num=sc.nextInt(),temp=0;

        for(int i=0;i<n;i++){

            if(stack[i]==num){
                temp++;
                break;
            }
        }

        if(temp!=0){
            System.out.println("the element found in the stack");
        }
        else{
            System.out.println("the element not found");
        }
    }

    public void display(int n,int stack[]){
        System.out.print("elements of front stack:");

        for(int i=0;i<=f;i++){
            System.out.print(stack[i]+" ");
        }
        System.out.println("");
        System.out.print("elements of back stack:");

        for(int i=n-1;i>=b;i--){
            System.out.print(stack[i]+" ");
        }

        System.out.println("");
    }

    public static void main(String[] args){
        two_stack Stack=new two_stack();

        System.out.println("enter the stack size:");
        int n=sc.nextInt();
        int stack[]=new int[n];
        Stack.b=n;

        for(int i=0;i<n;i++){
            stack[i]=-1;
        }

        System.out.println("1.push");
        System.out.println("2.pop");
        System.out.println("3.display");
        System.out.println("4.search");
        System.out.println("5.exit");

        while(true){
            System.out.println("enter the choice:");
            int ch=sc.nextInt();

            if(ch==1){
                Stack.push(n,stack);
            }
            else if(ch==2){
                Stack.pop(n,stack);
            }
            else if(ch==3){
                Stack.display(n, stack);
            }
            else if(ch==4){
                Stack.search(n,stack);
            }
            else if(ch==5){
                break;
            }
            else{
                System.out.println("invalid choice");
            }
        }
    }
}
