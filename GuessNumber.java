import java.util.Random;
import java.util.Scanner;

public class GuessNumber{
	public static void main(String[] args){
		Random ran = new Random();
		int ranVal = ran.nextInt(100);
		System.out.println("����������ɣ�\n");
		System.out.println("----���������µ����֣�----");
		Scanner scan = new Scanner(System.in);
		int inpVal = scan.nextInt();
		while(ranVal != inpVal){
			if(ranVal > inpVal){
				System.out.println("����С�ˣ�������һ��ѭ��\n");
			}
			else{
				System.out.println("sorry�����´���!������һ��ѭ��\n");
			}
			System.out.println("----�������������µ����֣�----");
			inpVal = scan.nextInt();
		}
		System.out.println("��ϲ��������ˣ�");		
	}
}