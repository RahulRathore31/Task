package task1;

public class abstractiondemo extends userdetail {

	public static void main(String[] args) {
		abstractiondemo obj=new abstractiondemo();
		
		obj.normaldata();
		obj.sensitivedata();

	}

	@Override
	void sensitivedata() {
		System.out.println("Password and Bank Details");
		
	}

}



abstract class userdetail {
	public void normaldata()
	{
		System.out.println("Name And Email");
	}
	abstract void sensitivedata();
}