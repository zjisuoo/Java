public class chap4_6{
	static int sum(int n){
		int i;
		int tot=0;

		for(i=1;i<=n;i++)
			tot=tot+i;

		return tot;
	}
	public static void main(String[] args){
		System.out.println("1~5 total sum"+sum(5));
	}
}