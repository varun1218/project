import java.util.Scanner;
class Main3{
	public static void main(String[] args) {

Scanner sc = new Scanner (System.in);
System.out.println("Enter Your age");
int age = sc.nextInt();

if(age<10){
System.out.println("you are a young child");
}else if (age<18){
System.out.println("you are adult");
}


}
}