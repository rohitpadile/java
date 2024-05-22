package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

//        int[] firstArray = getRandomArray(10);
//        System.out.println(Arrays.toString(firstArray));
//        Arrays.sort(firstArray);
//        System.out.println(Arrays.toString(firstArray));

//        int[] secondArray = new int[10];
//        System.out.println(Arrays.toString(secondArray));
//        Arrays.fill(secondArray, 5); //filling all positions with same element
//        System.out.println(Arrays.toString(secondArray));

//        int[] thirdArray = getRandomArray(10);
//        System.out.println(Arrays.toString(thirdArray)); //[12, 70, 97, 98, 1, 61, 44, 37, 27, 2]

//        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
//        System.out.println(Arrays.toString(fourthArray));

        //copying array dont impact the original array

//        Arrays.sort(fourthArray);
//        System.out.println(Arrays.toString(thirdArray));
//        System.out.println(Arrays.toString(fourthArray));

//        int[] smallerArray = Arrays.copyOf(thirdArray,5);
//        System.out.println(Arrays.toString(smallerArray)); //[12, 70, 97, 98, 1]
//
//        int[] largerArray = Arrays.copyOf(thirdArray, 15);
//        System.out.println(Arrays.toString(largerArray)); //[12, 70, 97, 98, 1, 61, 44, 37, 27, 2, 0, 0, 0, 0, 0]

        String[] sArray = {"Able", "Jane", "Mark", "Ralph", "David"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if(Arrays.binarySearch(sArray, "Mark") >= 0 )  {
            System.out.println("Found Mark in the list");
        }

        int[] s1 = {1,2,3,4,5};
        int[] s2 = {1,2,3,4,5, 0};

        if(Arrays.equals(s1,s2)) {
            System.out.println("Arrays s1,s1 are equal");
        } else {
            System.out.println("Arrays s1,s2 are not equal");
        }
    }

    private static int[] getRandomArray(int len) {

        Random random = new Random();
        int[] newInt = new int[len]; //all elements are zero default
        for(int i=0; i < len; i++ ) {
            newInt[i] = random.nextInt(100); //assigning random elements
        }

        return newInt;
    }
}
