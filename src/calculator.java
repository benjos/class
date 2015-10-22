import java. util. Scanner;

class  calculator {
	public static void main(String arg[]) {
		
		Scanner addfox = new Scanner(System.in);
		double fnum, snum, answer;
		int choice;
		choice=addfox.nextInt();
		switch(choice){
		case 1:
			
			System.out.println("Enter first num:");
			fnum = addfox.nextInt();
			System.out.println("Enter second num:");
			snum= addfox.nextInt();
			answer = fnum+ snum;
			System.out.println(answer);
			break;
		case 2:
			
			System.out.println("Enter first num:");
			fnum = addfox.nextInt();
			System.out.println("Enter second num:");
			snum= addfox.nextInt();
			answer = fnum-snum;
			System.out.println(answer);
			
			break;
case 3:
			
			System.out.println("Enter first num:");
			fnum = addfox.nextInt();
			System.out.println("Enter second num:");
			snum= addfox.nextInt();
			answer = fnum*snum;
			System.out.println(answer);
			
			break;
case 4:
	
	System.out.println("Enter first num:");
	fnum = addfox.nextInt();
	System.out.println("Enter second num:");
	snum= addfox.nextInt();
	answer = fnum/snum;
	System.out.println(answer);
	
	break;
case 5:
	
	System.out.println("Enter first num:");
	fnum = addfox.nextInt();
	
	answer = fnum%2;
	System.out.println(answer);
	
	break;
	default:
		System.out.println("Not Listed!");
		break;
			
		}
		}
	
	}

}
