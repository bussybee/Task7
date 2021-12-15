package ru.vsu.cs.maslovaei;

public class Solution {

    public static int findQuantityOfElements(int[] array) {

        int countUp = 0;
        int countDown = 0;
        int temp = 1;

        if (array.length < 2) {
            return array.length;
        }

        for (int i = 1; i < array.length; i++)
        {
            if (array[i] > array[i - 1]) {
                temp++;
            } else {
                if (countUp < temp){
                    countUp = temp;
                }
                temp = 1;
            }
        }
        if (temp > countUp){
            countUp = temp;
        }
        temp = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]){
                temp++;
            } else {
                if (countDown < temp){
                    countDown = temp;
                }
                temp = 1;
            }
        }
        if (temp > countDown){
            countDown = temp;
        }
        return Math.max(countUp, countDown);
    }
}





