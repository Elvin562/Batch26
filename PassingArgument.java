package OfficeHours.day11_03_22_2022;

public class PassingArgument {
    public static void main(String[] args) {
        sum(3,4);
        int a = 3;
        int b = 4;
        sum(a,b);

        sum((int) 3.6, 4);//we did casting Explicitly
    }

    public static void sum(int a, int b){
        System.out.println(a+b);
    }

}
