import java.util.*;
public class l_list {

    node head=null;
    static Scanner sc = new Scanner(System.in);

    public static class node{
        int data;
        node next;

        node(int num){
            data=num;
            next=null;
        }
    }
    
    public void b_insert(int num){

        node newNode = new node(num);

        if(head == null){
            head=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }

    }

    public void m_insert(int num){
        node newNode=new node(num);

        if(head==null){
            System.out.println("there is no head node");
            head=newNode;
            System.out.print("head node was added");
        }
        else{
            display();
            System.out.println("which element after wants to be insert ");

            int ser=sc.nextInt();
            int find=search(ser);

            if(find!=-1){
                node temp=head;
                while(find!=0){
                    temp=temp.next;
                    find--;
                }

                newNode.next=temp.next;
                temp.next=newNode;
                System.out.println("node added");

                display();
            }
            else{
                System.out.print("data not found");
            }
        }

    }

    public void e_insert(int num){
        node newNode =new node(num);
        
        if(head==null){
            head=newNode;
        }
        else{
            node temp=head;

            while(temp.next!=null){
                temp=temp.next;
            }
    
            temp.next=newNode;
        }
    }

    public void delete(){
        display();

        System.out.print("enter the element wants to be delete:");
        int ser=sc.nextInt();
        int find=search(ser);

        if(find!=-1){
            if(head.data==ser){
                node temp=head;
                head=head.next;
                temp=null;
            }
            else{
                node temp=head;
                while(temp!=null){
                    if(temp.next.data==ser){
                        node del=temp.next;
                        temp.next=temp.next.next;
                        del=null;
                        break;
                    }
                    temp=temp.next;
                }
            }
        }
        else{
            System.out.print("data not found");
        }

    }

    public int search(int num){
        node temp=head;
        int find=0,count=-1;
        while(temp!=null){
            count++;
            if(temp.data==num){
                find++;
                break;
            }
            temp=temp.next;
        }

        if(find!=0){
            System.out.println("the data found at "+count+" position");
        }
        else{
            System.out.println("the data not found");
        }
        return count;
    }

    public void reverse(){
        System.out.println("before reverse");
        display();
        node Next=null;
        node pre=null;

        while(head !=null){
            Next=head.next;
            head.next=pre;
            pre=head;
            head=Next;
            // System.out.print(pre.data+" ");
        }
        head=pre;

        System.out.println("after reverse");
        display();
    }

    public void display(){
        node temp=head;

        System.out.print("List elements are: ");
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

        System.out.println();
    }

    public static void main(String args[]){
        
        l_list list=new l_list();

        System.out.println("1)insert at beginning");
        System.out.println("2)insert at middle");
        System.out.println("3)insert at end");
        System.out.println("4)delete");
        System.out.println("5)display");
        System.out.println("6)search");
        System.out.println("7)reverse");
        System.out.println("8)exit");


        while(true){
            System.out.println("enter the choice:");
            int ch=sc.nextInt();

            if(ch==1){
                System.out.println("enter the node data:");
                int num=sc.nextInt();
                list.b_insert(num);

            }
            else if(ch==2){
                System.out.println("enter the node data:");
                int num=sc.nextInt();
                list.m_insert(num);
            }
            else if(ch==3){
                System.out.print("enter the node data:");
                int num=sc.nextInt();
                list.e_insert(num);
            }
            else if(ch==4){
                list.delete();
            }
            else if(ch==5){
                list.display();
            }
            else if(ch==6){
                System.out.print("enter the search element:");
                int num=sc.nextInt();
                list.search(num);
            }
            else if(ch==7){
                list.reverse();
            }
            else if(ch==8){
                break;
            }
            else{
                System.out.print("Invalid choice");
            }
        }

        sc.close();
    }
}
