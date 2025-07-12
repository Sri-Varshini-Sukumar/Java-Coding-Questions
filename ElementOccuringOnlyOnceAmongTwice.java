public class ElementOccuringOnlyOnceAmongTwice{
    public static void main(String[] args){
        int[] arr = {1,1,2,3,4,3,4,5,5};
        //Brute Force Solution
        int[] hash = new int[arr.length+1];
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                
            }
        }
        int xor = 0;
        for(int i : arr){
            xor ^= i;
        }
        System.out.print(xor);
    }
}