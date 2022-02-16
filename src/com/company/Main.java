package com.company;

import java.util.Scanner;

public class Main {

    public static void zeros(){
        int arr[] = {1,0,2,4,0,0,2,3,0,5,3,3};
        int l = arr.length;
        int count = 0;
        for (int i = 0; i < l; i++) {
            if (arr[i] == 0){
                count++;
                arr[l-count] = arr[i];
                arr[i] = arr[i+1];
            }

        }
        for (int i = 0;i<l;i++){
            System.out.print(arr[i]+" ");

        }

    }

    /**
     * appear in the list
     * only once.
     */
    public static void onlyOnce(){
        int arr[] = {1,2,4,2,3,5,3,3};
        int l = arr.length;
        int count = 0;
        for (int i = 0;i < l; i++){
            count = 0;
            for (int j = 1;j < l ; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count == 0 || count == 1){
                System.out.print(arr[i]+" ");
            }
        }
    }
    /**
     * delete element
     * @param n
     */
    public static void deleteElement(int n) {
        int arr[] = new int[8];
        arr[0] = -1;
        arr[1] = 2;
        arr[2] = 6;
        arr[3] = -1;
        arr[4] = -2;
        arr[5] = 6;
        arr[6] = -2;
        arr[7] = 5;
        int l = arr.length;
        for (int i = 0; i < l; i++) {
            if (i == l-1){
                arr[l-1] = arr[n];
                break;
            }
            if(i >= n){
                arr[i] = arr[i+1];
            }
        }

        for (int i = 0; i < l-1; i++) {
            System.out.print(arr[i]+" ");
        }

    }

    /**
     * Min and max elements swap
     */
    public static void minMaxElemReverse() {
        int arr[] = new int[8];
        arr[0] = -1;
        arr[1] = 2;
        arr[2] = 6;
        arr[3] = -1;
        arr[4] = -2;
        arr[5] = 6;
        arr[6] = -2;
        arr[7] = 5;
        int l = arr.length;
        int k = 0;
        int p = 0 ;
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < l; i++) {
            if(min > arr[i]){
                min = arr[i];
                k = i;
            }
            if(max < arr[i]){
                max = arr[i];
                p = i;
            }
        }
        arr[k] = arr[k] + arr[p];
        arr[p] = arr[k] - arr[p];
        arr[k] = arr[k] - arr[p];
        for (int i = 0; i < l; i++){
        System.out.print(arr[i]+" ");
        }
    }


    /**
     * Elements shift to the right
     */
    public static void elementsToRight() {
        int arr[] = new int[8];
        arr[0] = -1;
        arr[1] = 2;
        arr[2] = 6;
        arr[3] = -1;
        arr[4] = -2;
        arr[5] = 6;
        arr[6] = -2;
        arr[7] = 5;
        int l = arr.length;
        int k = arr[l-1];
        for (int i = l - 1; i > 0; i--) {
            arr[i] = arr[i - 1];

        }
        arr[0] = k;
        for (int i = 0;i<l;i++){
            System.out.print(arr[i]+" ");

        }
    }

    /**
     * Adjacent Reverse
     */
    public static void adjacentReverse() {
        int arr[] = new int[8];
        arr[0] = -1;
        arr[1] = 2;
        arr[2] = 6;
        arr[3] = -1;
        arr[4] = -2;
        arr[5] = 6;
        arr[6] = -2;
        arr[7] = 5;
        int l = arr.length;
        int k;
        if ((l & 1) == 0) {
            for (int i = 0; i < l; i += 2) {
                k = arr[i] + arr[i + 1];
                arr[i] = k - arr[i];
                arr[i + 1] = k - arr[i + 1];
            }
        }
        if ((l & 1) == 1) {
            for (int j = 0; j < l - 1; j += 2) {
                k = arr[j] + arr[j + 1];
                arr[j] = k - arr[j];
                arr[j + 1] = k - arr[j + 1];
            }
            arr[l - 1] = arr[l - 1];
        }

        for (int i = 0; i < l; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    /**
     * Reverse
     */
    public static void reverse2() {
        int arr[] = new int[8];
        arr[0] = -1;
        arr[1] = 2;
        arr[2] = 6;
        arr[3] = -1;
        arr[4] = -2;
        arr[5] = 6;
        arr[6] = -2;
        arr[7] = 5;
        int l = arr.length;
        int k;
        for (int i = 0; i < l / 2; i++) {
            k = arr[i];
            arr[i] = arr[l - i - 1];
            arr[l - i - 1] = k;


        }
        for (int i = 0; i < l; i++) {
            System.out.print(arr[i] + " ");
        }


    }

    /**
     * Reverse array
     */
    public static void reverse() {
        int arr[] = new int[8];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 2;
        arr[3] = 3;
        arr[4] = 3;
        arr[5] = 3;
        arr[6] = 4;
        arr[7] = 5;

        int l = arr.length;
        for (int i = l - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

    }

    /**
     * Different Elements count
     */
    public static void differentElements() {
        int arr[] = new int[8];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 2;
        arr[3] = 3;
        arr[4] = 3;
        arr[5] = 3;
        arr[6] = 4;
        arr[7] = 5;

        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] != arr[i]) {
                count++;
            }
        }
        System.out.println(count);

    }

    /**
     * Minimum positive Element
     */
    public static void minPositiveElem() {
        int arr[] = new int[8];
        arr[0] = -1;
        arr[1] = 2;
        arr[2] = 6;
        arr[3] = -1;
        arr[4] = -2;
        arr[5] = 6;
        arr[6] = -2;
        arr[7] = 5;
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > 0 && arr[i] > 0) {
                if (min > arr[i]) {
                    min = arr[i];
                }
            } else if (min < 0) {
                min = arr[i];
            }

        }
        System.out.println("Element: " + min);
    }

    /**
     * Max Element and Index
     */
    public static void maxElem() {
        int arr[] = new int[8];
        arr[0] = -1;
        arr[1] = 2;
        arr[2] = 6;
        arr[3] = -1;
        arr[4] = -2;
        arr[5] = 6;
        arr[6] = -2;
        arr[7] = 5;
        int max = arr[0];
        int k = 0;
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                k = i;
            }
        }
        System.out.println("Element: " + max + " Index: " + k);
    }

    /**
     * Adjacent Elements
     */
    public static void adjacentElem() {
        int arr[] = new int[8];
        arr[0] = -1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = -1;
        arr[4] = -2;
        arr[5] = 6;
        arr[6] = -2;
        arr[7] = 5;
        for (int i = 1; i < arr.length - 1; i++) {

            if (arr[i - 1] < 0 && arr[i + 1] < 0 || arr[i - 1] > 0 && arr[i + 1] > 0) {
                System.out.println(arr[i]);
            } else if (arr[i - 1] < 0 && arr[i + 1] > 0 && arr[i + 2] < 0 && arr[i] * arr[i + 1] > 0 || arr[i - 1] > 0 && arr[i + 1] < 0 && arr[i + 2] > 0 && arr[i] * arr[i + 1] > 0) {
                System.out.println(arr[i] + " " + arr[i + 1]);

            }

        }
    }

    /**
     * larger than the previous element.
     */
    public static void previousElem() {
        int arr[] = new int[6];
        arr[0] = -1;
        arr[1] = 1;
        arr[2] = -7;
        arr[3] = -5;
        arr[4] = 0;
        arr[5] = 7;
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > arr[i - 1]) {
                System.out.println(arr[i]);
            }
        }
    }


    /**
     * Positive Elements array
     */
    public static void positiveElemArray() {
        int arr[] = new int[6];
        arr[0] = -1;
        arr[1] = 1;
        arr[2] = -7;
        arr[3] = -5;
        arr[4] = 0;
        arr[5] = 7;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.println(arr[i]);
            }
        }
    }


    /**
     * Even elements array
     *
     * @param n
     */
    public static void evenElemArray(int n) {
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }

    /**
     * Even index array elements
     *
     * @param n
     */
    public static void evenIndexArray(int n) {
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter n: ");
//        int n = sc.nextInt();
//        evenElemArray(n);

//        positiveElemArray();

//        previousElem();

//        adjacentElem();

//        maxElem();

//        minPositiveElem();

//        differentElements();

//        reverse();

//        reverse2();

//        adjacentReverse();

//        adjacentReverse();

//        elementsToRight();
//        minMaxElemReverse();

//        System.out.print("Enter index: ");
//        int n = sc.nextInt();
//        deleteElement(n);

//        onlyOnce();

        zeros();
    }
}
