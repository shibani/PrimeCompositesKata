package com.primes.kata;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class PrimeComposite {
    public static void main(String args[]) throws IOException{
        PrimeComposite example = new PrimeComposite();
        //example.getInput();
        example.requestInput("first");
        int first = example.processInput("first");

        example.requestInput("second");
        int second = example.processInput("second");

        example.callCheckPrimes(first, second);
    }

    public void requestInput(String str) throws IOException{
        System.out.println("Enter " + str + " integer: ");
    }

    public int processInput(String str) throws IOException {

        byte input[] = new byte[10];
        StringBuilder builder = new StringBuilder();
        String newStr;

        System.in.read(input);

        for (int i = 0; i < input.length; i++) {
            builder.append((char) input[i]);
        }

        newStr = builder.toString().trim();

        System.out.print("You entered: ");
        System.out.println(newStr);

        return Integer.parseInt(newStr);

    }

    public void callCheckPrimes(int first, int second){

        System.out.println("Checking for primes and composites between " + first + " and " + second);

        String result = checkPrimes(first, second);

        System.out.println(result);
    }

    public String checkPrimes(int arg1, int arg2){
        String result = "";

        int[] nums = new int[arg2-arg1 + 1];

        for (int i = 0; i < nums.length; i++){
            nums[i] = arg1 + i;
            outerLabel:
            if(nums[i] >= 2) {
                for (int j = 2; j <= Math.floor(nums[i]); j++) {
                    if (nums[i] % j == 0) {
                        if (j == 2) {
                            if (Math.floor(nums[i]/2) == 1) {
                                result = result + "prime";
                            } else {
                                result = result + nums[i];
                            }
                        } else {
                            if (Math.floor(nums[i]/j) == 1) {
                                result = result + "prime";
                            } else {
                                result = result + "composite";
                            }
                        }
                        break outerLabel;
                    }
                }
            } else {
                result = result + nums[i];
            }
            if(i < nums.length-1){
                result = result + ", ";
            }
        }
        return result;
    }
}
