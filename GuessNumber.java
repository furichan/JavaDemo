import java.util.Random;
import java.util.Scanner;

public class GuessNumber{
	public static void main(String[] args){
		Random ran = new Random();
		int ranVal = ran.nextInt(100);
		System.out.println("随机数已生成！\n");
		System.out.println("----请输入您猜的数字：----");
		Scanner scan = new Scanner(System.in);
		int inpVal = scan.nextInt();
		while(ranVal != inpVal){
			if(ranVal > inpVal){
				System.out.println("您猜小了！继续下一次循环\n");
			}
			else{
				System.out.println("sorry，您猜大了!继续下一次循环\n");
			}
			System.out.println("----请重新输入您猜的数字：----");
			inpVal = scan.nextInt();
		}
		System.out.println("恭喜您，答对了！");		
	}
}