package reusing_classes;

import java.math.BigInteger;

class Amphibian{
	void using(Amphibian i) {
		System.out.println("up object to Amphibian success!");
	}
}

public class java3 extends Amphibian{
	void using(String i) {
		System.out.println("im java3 native function !");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java3 ali = new java3();
		int[] result = ali.removeDuplicates(new int[] {1,2,3,3,3,3,3,3,3,3,4,5,4,5,77,77});
		for(int i= 0;i<result.length;i++) {
			System.out.print("result :" + result[i]);
		}
		System.out.println("length:"+result.length);
		
	} 
	
	public int[] removeDuplicates(int[] nums) {
	    if (nums.length == 0) return null;
	    int i = 0;
	    for (int j = 1; j < nums.length; j++) {
	        if (nums[j] != nums[i]) {
	            i++;
	            nums[i] = nums[j];
	        }
	    }
	    return nums;
	}
	
    public int[] plusOne(int[] digits) {
        //method 1：把数组转化为整数，+1操作，转化为数组
        //method 2：从后往前遍历数组
        if(digits.length==0) return null;
        long num = 0;
        String s="";
        for(int i = digits.length-1;i>=0;i--){
            num += digits[i]*Math.pow(10,digits.length-i-1);
        }
        num = num+1;
        System.out.println(num);
        s = String.valueOf(num);
        int[] finaldigits = new int[s.length()];
        
        for(int i = 0;i<s.length();i++){
        	//System.out.println(s);
        	finaldigits[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        
        return finaldigits;
    }

}

//test18
class finalclass{
	static final int i = 3;
	finalclass(int t){
		final int i = t;
	}
}

//test19
class blankfinal extends finalclass{
	final finalclass ali ;
	blankfinal(){
		super(1);
		ali = new finalclass(1);
	}
	blankfinal(int i){
		super(i);
		ali = new finalclass(i);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		blankfinal heizi = new blankfinal();
		blankfinal amy = new blankfinal(1);
		 
	} 
	
}




class Solution {
    public int[] plusOne(int[] digits) {
        //method 1：把数组转化为整数，+1操作，转化为数组
        //method 2：从后往前遍历数组
        if(digits.length==0) return null;
        int num = 0;
        String s="";
        for(int i = digits.length-1;i>=0;i--){
            num += digits[i]*Math.pow(10,digits.length-i-1);
        }
        num = num+1;
        s = String.valueOf(num);
        int[] finaldigits = new int[s.length()-1];
        for(int i = 0;i<s.length();i++){
            finaldigits[i] = (int)s.charAt(i);
        }
        
        return finaldigits;
    }
}



