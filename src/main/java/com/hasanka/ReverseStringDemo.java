package com.hasanka;

public class ReverseStringDemo {
	
	
	
	public static void main(String[] args) {
		
		ReverseStringDemo rsd = new ReverseStringDemo();
		String stringToBeReversed = "abcd";
		System.out.println(rsd.reverse(stringToBeReversed));
		
	}
	

	String reverse(String str){
		String reverse = "";
		if(str == null || str.isEmpty()){
			return str;
		}
		for (int i = str.length()-1; i >=0; i--) {
			reverse = reverse + str.charAt(i);

		}
		return reverse;

	}





}
