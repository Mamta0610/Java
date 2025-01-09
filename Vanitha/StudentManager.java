package Vanitha;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
	static List<String> students = new ArrayList<String>();
	
	private static void addStudent(Scanner sc) {
		System.out.println("Enter student name");
		String name = sc.nextLine();
		students.add(name);
		System.out.println(name + " has been added in list ");
	}
	
	private static void removeStudent(Scanner sc) {
		System.out.println("Enter student name to remove ");
		String name = sc.nextLine();
		if(students.remove(name)) {
			System.out.println("student removed from list");
		}else {
			System.out.println("student not found ");
		}
	}
	
	private static void displayStudents() {
		if(students.isEmpty()) {
			System.out.println(" No students in list ");
		}else {
			System.out.println("List of students");
			for(String student : students) {
				System.out.println(student);
			}
		}
	}
	
	private static void searchStudent(Scanner sc) {
		System.out.println("Enter the student name to search ");
		String name = sc.nextLine();
		if(students.contains(name)) {
			System.out.println(name + "  is in the list ");
		}else {
			System.out.println("Student not found ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice ;
		do {
			System.out.println("Student Manager ");
			System.out.println("1. Add Student ");
			System.out.println("2. Remove Student ");
			System.out.println("3. Display All Students ");
			System.out.println("4. Search for a Student");
			System.out.println("5. Exit ");
			choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				addStudent(sc);
				break;
			case 2:
				removeStudent(sc);
				break;
			case 3:
				displayStudents();
				break;
			case 4:
				searchStudent(sc);
				break;
			case 5:
				System.out.println("exit");
				break;
			default:
				System.out.println("Invalid choice, please try again ");
			}
		}while(choice !=5);

	}

}
