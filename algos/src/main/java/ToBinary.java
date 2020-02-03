package main.java;

public class ToBinary {
    public static void main(String[] ar){
        new ToBinary().de();
    }

    public void de(){
        calculateWithRecursion(20);
        System.out.println(ans);
    }

    String ans = "";
    private void calculateWithRecursion(int num) {
        ans += num % 2;
        if(num / 2 == 0){
            return;
        }
        calculateWithRecursion(num / 2);
    }
}
