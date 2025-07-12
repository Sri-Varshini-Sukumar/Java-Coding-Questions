import java.util.*;
public class ElementOccuringOnlyOnceAmongTwice{
    public static void main(String[] args){
        //Assuming an array as input by the user, find the element that occurs only once in an array.
        int[] arr = {1,1,2,3,4,3,4,5,5};
        //Brute Force Solution - Using HashMap Method - Time Complexity - O(n) and Space Complexity - O(n)
        HashMap<Integer,Integer> hmp = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            hmp.put(arr[i],hmp.getOrDefault(i,0)+1);
        }
        for(int i : hmp.keySet()){
            if(hmp.get(i) == 1){
                System.out.println(i);
                break;
            }
        }
        //Method 2 - Optimal Solution - Using XOR Method - Time Complexity - O(n) and Space Complexity - O(1)
        int xor = 0;
        for(int i : arr){
            xor ^= i;
        }
        System.out.print(xor);
    }
}