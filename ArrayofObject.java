package sumit.com;

class Student{
	public int roll_no;
	public String name;
	Student(int roll_no, String name){
		this.name= name;
		this.roll_no =roll_no;
		
	}
}
public class ArrayofObject {
	
	public static void main(String[] args) {
		
		Student[] arr;
		arr = new Student[4];
		arr[0]=new Student(1,"sumit");
		arr[1]=new Student(2,"amit");
		arr[2]=new Student(3,"sam");
		arr[3]=new Student(4,"ram");
		for(int i= 0; i<arr.length; i++) {
			System.out.println("Roll Num: " + arr[i].roll_no + "\nName: " + arr[i].name);
		}
		
 
	}

}
