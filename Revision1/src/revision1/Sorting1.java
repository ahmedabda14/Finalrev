/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revision1;


/**
 *
 * @author ahmed
 */
public class Sorting1 {
                 
    public static void main(String[] args) {
       int array[] = {2,4,3,2,22} ;  
       int i,j;
    for(i=0;i<array.length-1;i++){
                for(j=0;j<array.length-i-1;j++){
                    if(array[j]>array[j+1]){
              int temp = array[j];
              array[j]=array[j+1];
              array[j+1]=temp;
              
                    }


                }
            }
     for(i=0;i<array.length;i++){
         System.out.print(array[i]+" ");
     }
     int temp;
            int arr[] = {3,1,3,9,8} ;  
for(i=0;i<arr.length-1;i++){
    int min=i;
    for(j=i+1;j<arr.length;j++){
        if(arr[min]>arr[j]){
          min=j;
        }
    }
    temp=arr[i];
    arr[i]=arr[min];
    arr[min]=temp;
    
}
         System.out.println("Selection");
     
            for(i=0;i<array.length;i++){
         System.out.print(arr[i]+" ");
     }       
                     System.out.println("Insertion");
       int arrr[] = {2,4,3,2,32,32,31,30,11,21,3,4} ;  

            for(i=1;i<arrr.length;i++){
                temp = arrr[i];
                j=i-1;
                while(j>=0&&arrr[j]>temp){
                    arrr[j+1]=arrr[j];
                    j--;
                }
                arrr[j+1]=temp;
            }
                for(i=0;i<arrr.length;i++){
         System.out.print(arrr[i]+" ");
     }
                                     System.out.println("quickSort");

                int[]arr2={8,2,5,3,9,4,7,6,1};
                quickSort(arr2,0,arr2.length-1);
                 for(i=0;i<arr2.length;i++){
         System.out.print(arr2[i]+" ");
     }
                                           

                 }

    private static void quickSort(int[] arr2, int start, int end) {
if (end<=start)return;
int pivot = partition(arr2,start,end);
quickSort(arr2,start,pivot-1);
quickSort(arr2,pivot+1,end);
    }
        private static int partition(int[] arr2, int start, int end) {
            
            int pivot = arr2[end];
            int i = start -1;
            for(int j=start;j<=end-1;j++){
                if(arr2[j]<pivot){
                    i++;
                    int temp=arr2[i];
                    arr2[i]=arr2[j];
                    arr2[j]=temp;
                }
            }
            i++;
                 int temp=arr2[i];
                    arr2[i]=arr2[end];
                    arr2[end]=temp;
            return i;
            

        }

}
