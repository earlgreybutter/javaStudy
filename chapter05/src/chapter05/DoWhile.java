package chapter05;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j = 1;
		
		do {
			System.out.println("번호 :" +j);
			j++;
			if(j==5)
				break;
		}while(j<0);
		
		System.out.println("-----------END---------");
		System.out.println("do-while문 종료 후의 j의 값 :" +j);
		
	}

}
