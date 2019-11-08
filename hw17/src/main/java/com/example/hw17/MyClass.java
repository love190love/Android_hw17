package com.example.hw17;
import java.util.Scanner;
public class MyClass {
    public static void main(String[] s) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請連續輸入5個數值");
        int a,b,c,d,e;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();
        e = scanner.nextInt();
        int [] array={a,b,c,d,e};
        int min=array[0];
        for(int i = 1; i<array.length; i++){
            if (array[i]<min){
                min=array[i];
            }
        }
        System.out.println("最小值:"+min);
    }
}