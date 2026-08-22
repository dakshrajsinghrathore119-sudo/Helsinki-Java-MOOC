import java.util.Arrays;
public class MainProgram {

    public static void main(String[] args) {
        int[] parts = {3,2,4,1,7,6,9,8,5};
        MainProgram.sort(parts);
        // write your test code here
//        int[] array = {3, 1, 5, 99, 3, 12};
//        System.out.println("Smallest: "+MainProgram.smallest(array));
//        System.out.println("Smallest Index: "+MainProgram.indexOfSmallest(array));
//        System.out.println(MainProgram.indexOfSmallestFrom(array, 3));
//        MainProgram.swap(array,3, 5);
//        System.out.println(Arrays.toString(array));
    }
    
    public static int smallest(int[] array){
        int smallest = array[0] ;
        for(int n = 0;n<array.length;n++){
            if(array[n]<smallest){
                smallest = array[n];
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array){
        int smallest = array[0];
        int a = 0 ;
        for(int n = 0 ; n<array.length;n++){
            if(array[n]<smallest){
                a = n;
                smallest = array[n];
            }
        }
        return a;
    }
    
    public static int indexOfSmallestFrom(int[] array, int index){
        int smallest = array[index];
        int idx = index;
        for(int n = index;n<array.length;n++){
            if(array[n]<smallest){
                idx = n;
                smallest = array[n];
            }
        }
        return idx;
    }
    
    public static void swap(int[] array,int idx,int idx1){
        int copied = array[idx];
        array[idx] = array[idx1];
        array[idx1] = copied;
    }
    
    public static void sort(int[] arrays){
        System.out.println(Arrays.toString(arrays));
        for(int idx = 0;idx<arrays.length;idx++){
            MainProgram.swap(arrays,indexOfSmallestFrom(arrays,idx),idx);
            System.out.println(Arrays.toString(arrays));
        }
    }
}
