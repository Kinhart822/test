/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session7;

import java.util.Scanner;

public class DemoString {

	public static void main(String[] args) {
		// Khai báo string:
		
			// Cách 1 : sử dụng literal
		String myName = "Phạm Hoàng Anh";
		
			// String có 1 ký tự vẫn dùng cú pháp ""
		String bloodType = "A";
		
			// 'String có 1 ký tự' khác hoàn toàn với '1 ký tự'
			// String có thể không có ký tự -> String rỗng
		String location = "";
				
			// Cách 2: khai báo thông qua new
		String myPet = new String("Lion");
				
		// Input String
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please input your name: ");
		String name = scanner.nextLine(); // Read a String from keyboard

		System.out.println("Your name is: " + name);
		
		// Nhập họ và tên
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your first name: ");
		String firstName1 = input.nextLine(); 
		System.out.print("Enter your last name: ");
		String lastName1 = input.nextLine(); 
		System.out.println("Your name is: " + name);
		String fullName = firstName1 + " " + lastName1;
		String fullName1 = firstName1.concat("").concat(lastName1);
		System.out.print("Hello, " + fullName1);
		
		// String concatenation 
		String firstName = "John";
		String lastName = "Doe";
		System.out.println(firstName + " " + lastName);
		System.out.println(firstName.concat(lastName));
		
		// Phép toán cộng
		System.out.println(1 + 2);
		System.out.println("a" + "b");
		System.out.println("a" + "b" + 3);
		System.out.println(1 + 2 + "c");
		System.out.println(1 + "c" + 2);
		System.out.println("c" + 1 + 2);
		System.out.println("c" + (1 + 2));
		
		// Kí tự đặc biệt
							//		| Escape character | Result |
							//		|	     \"		   |   "    |
							//		|	     \\ 	   |   \    |
//	String str = "My favorite book is "Twilight" by Stephanie Meyer";  (Does not compile)
		
		String str = "My favorite book is \"Twilight\" by Stephanie Meyer";
		System.out.println(str);
		
		String workFiles= "My work files are in D:\\Work Projects\\java";
		System.out.println(workFiles);
		
		System.out.print("What is your favorite book?");
		String favouriteBook = input.nextLine();
		System.out.println(favouriteBook);

		// 	length()
		String string = "Fresher Academy";
		System.out.println(string.length());
		
		// charAt()
					// The method signature is as follows: char charAt(int index)
		String string1 = "Fresher Academy";
		System.out.println(string1.charAt(0)); // F
		System.out.println(string1.charAt(6)); // r
		System.out.println(string1.charAt(16)); // throws an error
		
		// indexOf()
					//	The method signatures are as follows: 
					//		int indexOf(char ch)
					//		int indexOf(char ch, index fromIndex) 
					//		int indexOf(String str)
					//		int indexOf(String str, index fromIndex) 
		String string11 = "Fresher Academy";
		System.out.println(string11.indexOf('a')); // 10
		System.out.println(string11.indexOf("Ac")); // 8
		System.out.println(string11.indexOf('e', 4)); // 5
		System.out.println(string11.indexOf("al", 5)); // -1
//	Unlike charAt(), the indexOf() method doesn’t throw an error if it can’t find a match, indexOf() returns –1 when no match is found.
		String myString = "The quick brown fox jumps over the lazy dog!";
		System.out.println(myString.indexOf('q'));
		System.out.println(myString.indexOf('h', 10));  //Tìm từ ký tự thứ 10
		System.out.println(myString.indexOf("fox"));
		System.out.println(myString.indexOf("fox", 20));
		
		// substring()
						//	The method signatures are as follows: 
						//		int substring(int beginIndex)
						//		int substring(int beginIndex, int endIndex
		String string111 = "Fresher Academy";
		System.out.println(string111.substring(8)); // Academy
		System.out.println(string111.substring(string111.indexOf('e'))); // esher Academy
		System.out.println(string111.substring(3, 6)); // she
		System.out.println(string111.substring(3, 20)); // throw an error
//	The method returns the string starting from the requested index. If an end index is requested, it stops right before that index

		//	toLowerCase() & toUpperCase()
						//	The method signatures are as follows: 
						//		String toLowerCase(String str) 
						//		String toUpperCase(String str)
		String string1111 = "Fresher Academy";
		System.out.println(string1111.toUpperCase()); // FRESHER ACADEMY
		System.out.println(string1111.toLowerCase()); // fresher academy
	
		// equals() and equalsIgnoreCase() 
// ▪ The equals() method checks whether two String objects contain exactly the same characters in the same order.
// ▪ The equalsIgnoreCase() method compares two strings same the equals(). But ignoring case differences.
						//	The method signatures are as follows: 
						//		boolean equals(String str)
						//		boolean equalsIgnoreCase(String str) 
		String string11111 = "Fresher Academy";
		System.out.println(string11111.equals("FRESHER ACADEMY")); // false
		System.out.println(string11111.equals("Fresher Academy")); // true
		System.out.println(string11111.equals("fresher academy")); // false
		System.out.println(string11111.equalsIgnoreCase("FRESHER ACADEMY")); // true
		System.out.println(string11111.equalsIgnoreCase("Fresher Academy")); // true
		System.out.println(string11111.equalsIgnoreCase("fresher academy")); // true
//	Note:
//	▪ Always use equals() method if you are checking for equality because it does a value based comparison.
//	▪ Use equalsIgnoreCase() method for case-insensitive equality check.
//	▪ Don't use == to compare String in Java. It returns true if both String point to the same object. This means even if the content of two String is same == may return false if they point to different objects

		// startsWith() and endsWith()
						// ▪ The method signatures are as follows: 
						//		boolean startsWith(String prefix) 
						//		boolean endsWith(String suffix)
		String string111111 = "Fresher Academy";
		System.out.println(string111111.startsWith("F")); // true
		System.out.println(string111111.startsWith("f")); // false
		System.out.println(string111111.startsWith("A")); // false
		System.out.println(string111111.endsWith("Y")); // false
		System.out.println(string111111.endsWith("y")); // true
		System.out.println(string111111.endsWith("M")); // false

		// contains()
						//	▪ The method signature is as follows: 
						//		boolean contains(String str)
		String string1111111 = "Fresher Academy";
		System.out.println(string1111111.contains("F")); // true
		System.out.println(string1111111.contains("f")); // false
		System.out.println(string1111111.contains("m")); // true
		System.out.println(string1111111.contains("a")); // true
		System.out.println(string1111111.contains("de")); // true

		// replace()
//	▪ The replace() method replaces each matching occurrence of the old character/text in the string with the new character/text.
						// ▪ The method signatures are as follows: 
						// 		String replace(char oldChar, char newChar)
						//		String replace(CharSequence oldChar, CharSequence newChar) 
		String string11111111 = "Fresher Academy";
		System.out.println(string11111111.replace('F', 'f')); // fresher Academy
		System.out.println(string11111111.replace("Fr", "FR")); // FResher Academy

		// trim()
//	▪ The trim() method removes any leading (starting) and trailing (ending) whitespaces from the specified string.
						//	▪ The method signature is as follows:  
						//		String trim() 
		System.out.println("abc".trim()); // abc
		System.out.println(" abc ".trim()); // abc
		System.out.println("\t a b c\n".trim()); // a b c
//	▪ Note: 
//		Whitespace consists of spaces along with the \t (tab) and \n (newline) characters
	
		System.out.println("Enter your name: ");
		String moreString = input.nextLine();
		
		moreString = moreString.trim(); //Loại bỏ khoảng trắng ở đầu và cuối
		System.out.println("Hello, " + moreString);
	
	
	
	
	
	
	}

}
