package com;

public class Class2 {
	 
    public static void main(String[] args) {
        //numbers
        int[] nums = {78, 80, 59, 70, 68};
         
        float sum = 0;
         
        //compute sum
        int i=0;
        while(i < nums.length) {
            sum += nums[i];
            i++;
        }
         
        //compute average
        float average = (sum / nums.length); 
         
        System.out.println("Average : "+average);
    }
}