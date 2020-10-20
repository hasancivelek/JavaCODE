package Week_11_1Lamda_Stream;
interface FunctInterface2{
	
	int sum (int a, int b);
}
public class Lambda_4 {

	public static void main(String[] args) {
		
FunctInterface2 ref =(x,y)->(x+y);

System.out.println(ref.sum(2, 3));
	
	}

}