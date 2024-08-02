import java.util.*;
public class queue {
    static Scanner sc = new Scanner(System.in);
    int count=0;

    public void enqueue(int n,int queue[]){
        System.out.print("enter the element:");
        int num=sc.nextInt();

        queue[count]=num;

        count++;
    }

    public void dequeue(int n,int queue[]){
        queue[0]=-1;
        for(int i=1;i<=count-1;i++){
            queue[i-1]=queue[i];
        }
        count--;
        if(count<0){
            System.out.println("queue is empty");
            count++;
        }
    }

    public void search(int num,int queue[]){
        int temp=0;
        for(int i=0;i<count;i++){
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

        for(int i=0;i<count;i++){
            System.out.print( queue[i]+" ");
        }

        System.out.println("");
    }

    public static void main(String[] args){
        queue Queue=new queue();
        System.out.print("enter the queue size:");
        
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
                if(Queue.count<n){
                    Queue.enqueue(n,queue);
                }
                else{
                    System.out.println("the queue is full");
                }
            }
            else if(ch==2){
                if(Queue.count<0){
                    System.out.println("queue is empty");
                }
                else{
                    Queue.dequeue(n,queue);
                }
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
