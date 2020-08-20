class ReverseArrayRecursive{
 // Complete the reverseArray function below.
    static int[] reverseArray(int[] a) {
        if(i == a.length /2){
            return a;
        }
        int temp = a[i];
        a[i]= a[a.length -(i+1)];
        a[a.length -(i+1)] = temp;
        i++;
       return reverseArray(a);
    }
}
