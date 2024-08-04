import java.util.*;
class merge{
    static Scanner sc=new Scanner(System.in);
    static int arr[], arr2[];

    public void Merge(int l,int mid,int h){
        arr2=new int[h];
        int i=l,j=mid+1,k=l;

        while(i<=mid && j<=h){
            if(arr[i]<arr[j]){
                arr2[k++]=arr[i++];
            }
            else{
                arr2[k++]=arr[j++];
            }
        }

        for(;i<=mid+1;i++){
            arr2[k++]=arr[i++];
        }
        
        for(;j<=h;j++){
            arr2[k++]=arr[j++];
        }
    }
    
    public void mergeSort(int l,int h){
        if(l<h){
            int mid=(l+h)/2;
            mergeSort(l,mid);
            mergeSort(mid+1,h);

            Merge(l,mid,h);

            display();
        }
    }

    public void display(){
        System.out.print("the array elements:");

        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
    }

    public static void main(String[] args){
        merge merge=new merge();

        System.out.println("enter the array size");
        int n=sc.nextInt();
        arr=new int[n];

        System.out.println("enter the array element:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int l=0, h=n;
        merge.mergeSort(l,h);
    }
}