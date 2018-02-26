package com.primes.kata;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class PrimeComposite {
    public static void main(String args[]) throws IOException{
        PrimeComposite example = new PrimeComposite();
        example.getInput();
    }

    public void getInput() throws IOException{

        byte first[] = new byte[10];
        byte second[] = new byte[10];
        StringBuilder firstBuilder = new StringBuilder();
        StringBuilder secondBuilder = new StringBuilder();
        String firstStr;
        String secondStr;

        System.out.println("Enter first integer: ");
        System.in.read(first);

        for(int i = 0; i < first.length; i++){
            firstBuilder.append((char) first[i]);
        }

        firstStr = firstBuilder.toString().trim();

        System.out.print("You entered: ");
        System.out.println(firstStr);

        System.out.println("Enter second integer: ");
        System.in.read(second);

        for(int i = 0; i < first.length; i++){
            secondBuilder.append((char) second[i]);
        }

        secondStr = secondBuilder.toString().trim();

        System.out.print("You entered: ");
        System.out.println(secondStr);

        System.out.println("Checking for primes and composites between " + firstStr + " and " + secondStr);

        String result = checkPrimes(Integer.parseInt(firstStr), Integer.parseInt(secondStr));

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
