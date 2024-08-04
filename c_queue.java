import java.util.*;
class c_queue{
    static Scanner sc=new Scanner(System.in);
    int f=-1,b=-1;

    public void enqueue(int n,int num,int queue[]){

        if(f==-1 && b==-1){
            f=b=0;
            queue[b]=num;
        }
        else{
            b=(b+1)%n;
            queue[b]=num;
        }
    }

    public void dequeue(int n,int queue[]){

        if(f==-1 && b==-1){
            System.out.print("queue is empty");
        }
        else if( f==b){
            f=b=-1;
        }
        else{
            queue[f]=-1;
            f=(f+1)%n;
        }
    }

    public void search(int num,int queue[]){
        int temp=0;
        for(int i=f;i<b;i++){
            if(queue[i]==num){
                temp++;
            }
        }
        if(temp!=0){
            System.out.print("the element is present in queue");
        }
        else{
            System.out.print("the element is not present");
        }
    }

    public void display(int n,int queue[]){
        System.out.println("queue elements:");
        int i=f;
        if(b==-1 &&f==-1){
            System.out.print("queue is empty");
        }
        else{
             System.out.print("f:"+i+"b:"+b);

            while(i!=b){
                System.out.print(queue[i]+" ");
                i=(i+1)%n;
            }

            System.out.println(queue[b]+" ");
        }

        System.out.println("");
    }

    public static void main(String[] args){
        c_queue Queue=new c_queue();
        System.out.println("enter the length of the queue:");
        int n=sc.nextInt();
        int queue[]=new int[n];

        for(int i=0;i<n;i++){
            queue[i]=-1;
        }

        System.out.println("1.enqueue");
        System.out.println("2.dequeue");
        System.out.println("3.display");
        System.out.println("4.search");
        System.out.println("5.exit");

        while(true){
            System.out.println("enter the choice:");
            int ch=sc.nextInt();

            if(ch==1){
                if((Queue.b+1)%n==Queue.f){
                    System.out.println("queue is full");
                }
                else{
                    System.out.print("enter the element:");
                    int num=sc.nextInt();

                    Queue.enqueue(n,num,queue);
                }
            }
            else if(ch==2){
                Queue.dequeue(n,queue);
            }
            else if(ch==3){
                Queue.display(n,queue);
            }
            else if(ch==4){
                System.out.println("enter the search element");
                int num=sc.nextInt();

                Queue.search(num,queue);
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