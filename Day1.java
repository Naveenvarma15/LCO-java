import java.util.Scanner;

public class lcotables { 
	public static void main(String[] args) {
	int num,m,i;  
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number :");
    num=sc.nextInt();
    for(i=1;i<11;i++)
    {
      m=num*i;
      System.out.println(+num+"x"+i+"="+m);
    }
   }
}
