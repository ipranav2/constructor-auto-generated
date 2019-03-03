class Test
{
	int x;
	Test Test()
	{
		return(this);
	}
	void show()
	{
		System.out.println("value of x: "+x);
	}
	public static void main(String S[])
	{
		Test t1,t2;
		t1=new Test();
		t2=new Test();
		t1.show();
		t2.show();
	}
}