package utils;

import java.util.Scanner;


public class InputFromKeyboard {
	
	/**
	 * 输入
	 * 1 2 3
	 * 1 1 1 1 1 
	 * 2 2 2 2 2
	 * 3 3 3 3 3
	 */
	public static void readString() {
		  Scanner scanner = new Scanner(System.in);
		  while(scanner.hasNext()) {
			  String tempS1 = scanner.nextLine();
			  String[] tempLine = tempS1.split(" ");
			  for (int i = 0; i < tempLine.length; i++) {
				try {
					System.out.println(Integer.parseInt(tempLine[i]));
				} catch (Exception e) {
					System.err.println("非法輸入！");
				}
			  }
//			  System.out.println(":" + temps1); //读到空格会换行
//			  System.out.println(scanner.nextLine());
//			  System.out.println(scanner.nextInt());
		  }
		  scanner.close();
	}
	
	public static void main(String[] args) {
		readString();
	}
}
