import java.util.*;
public class s_array {

    static Scanner sc = new Scanner(System.in);

    public void display(int n,int arr[]){

        System.out.print("the array elements:");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public void search(int n,int arr[]){
        System.out.print("enter the search element:");
        int num=sc.nextInt(), temp=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==num){
                temp=i;
            }
        }
        if(temp!=-1){
            System.out.println("the element is found at index:"+temp);
        }
        else{
            System.out.println("the element is not found");
        }
    }

    public static void main(String[] args){

        s_array s_array=new s_array();

        System.out.print("enter the array size:");
        int n=sc.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            System.out.print("enter the array element:");
            arr[i]=sc.nextInt();
        }

        System.out.println("1.display");
        System.out.println("2.search");
        System.out.println("3.exit");

        while(true){
            System.out.println("enter the choice:");
            int ch=sc.nextInt();
            
            if(ch==1){
                s_array.display(n,arr);
            }
            else if(ch==2){
                s_array.search(n,arr);
            }
            else if(ch==3){
                break;
            }
            else{
                System.out.println("invalid choice");
            }
        }

        sc.close();
    }
}
