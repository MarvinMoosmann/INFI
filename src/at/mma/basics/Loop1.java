package at.mma.basics;

public class Loop1 {
    public static void main(String[] args){

        int summe = 0;

        for (int i=1; i<=100; i++){
            summe += i;
        }
        System.out.println(summe);
    }
}