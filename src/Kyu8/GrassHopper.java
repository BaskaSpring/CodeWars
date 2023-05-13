package Kyu8;

public class GrassHopper {

    public static int summation(int n) {
        if (n==0){
            return 0;
        } else {
            return n+summation(n-1);
        }
    }


    public static void main(String[] args) {
        System.out.println(summation(8));
    }


}
