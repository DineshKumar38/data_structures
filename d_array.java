import java.util.*;
class d_array{
    public int count=-1;
    int arr[]=new int[4];
    static Scanner sc=new Scanner(System.in);

    public void inc_size(){
        int temp=(count+1)*2;
        int arr2[] = new int[temp];

        for(int i=0;i<=count;i++){
            arr2[i]=arr[i];
        }
        
        arr=arr2;
        arr2=null;
    } 

    public void append_elm(int num){
        if (count!=arr.length-1){
            count++;
            arr[count]=num;
        }
        else{
            inc_size();
            append_elm(num);
        }
    }

    public void insert(int num,int index){
        int temp[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(i<index){
                temp[i]=arr[i];
                // System.out.println("debug:arr:"+arr[i]+"temp:"+temp[i]);
            }
            else if(i ==  index){
                temp[i]=num;
                // System.out.println("debug:arr:"+arr[i]+"temp:"+temp[i]);
            }
            else{
                temp[i]=arr[i-1];
                // System.out.println("debug:arr:"+arr[i]+"temp:"+temp[i]);
            }
        }

        // for(int i=0;i<arr.length;i++){
        //     // System.out.print("debug:temp"+i+":"+temp[i]);
        // }
        count++;
        arr=temp;
        temp=null;
    }

    public void i_index(int num,int index){
        if(count-1<arr.length){
            insert(num,index);
        }
        else{
            inc_size();
            insert(num,index);
        }
    }

    public void delete(){
        System.out.print("elements:");
        display();
        System.out.print("index   :");
        for(int i=0;i<=count;i++){
            System.out.print(i+" ");
        }
        System.out.print("enter the delete element index:");
        int sea=sc.nextInt();
        int temp[]=new int[arr.length];

        for(int i=0;i<arr.length-1;i++){
            if(i<sea){
                temp[i]=arr[i];
            }
            else if(i>=sea){
                if(i==sea)
                    count--;

                temp[i]=arr[i+1];
            }
        }
        arr=temp;
        temp=null;
    }

    public void display(){
        System.out.println("array elements:");
        for(int i=0;i<=count;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String []args){

        d_array d_array=new d_array();

        System.out.println("enter the choice:");
        System.out.println("1)append");
        System.out.println("2)insert by index");
        System.out.println("3)delete");
        System.out.println("4)print");
        System.out.println("5)exit");

        while(true){
            int ch=sc.nextInt();

            if(ch==1){
                System.out.print("enter the append no:");
                int num=sc.nextInt();
                d_array.append_elm(num);
            }
            else if(ch==2){
                System.out.println("enter the number:");
                int num = sc.nextInt();
                System.out.print("enter the index:");
                int index=sc.nextInt();

                d_array.i_index(num,index);
            }
            else if(ch==3){
                d_array.delete();
            }
            else if(ch==4){
                d_array.display();
            }
            else if(ch==5){
                break;
            }
        }

        sc.close();
    }
}