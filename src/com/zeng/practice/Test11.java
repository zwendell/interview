package com.zeng.practice;

/*
在你面前有一个n阶的楼梯，你一步只能上1阶或2阶。请问，当N=11时，
你可以采用多少种不同的方式爬完这个楼梯（）；当N=9时呢？
刚好是一个斐波那契数列；
 */
public class Test11 {
    public static void main(String[] args) {
        Test11 inc = new Test11();
        int i = 0;
        inc.fermin(i);
        i= i ++;
        System.out.println(i);

    }
    void fermin(int i){
        i++;
    }
}
