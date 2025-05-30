package basic;

public class RevereStringRelated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RevereStringRelated obj=new RevereStringRelated();
		obj.testOne();
		System.out.println("");
		obj.testOne();

	}
	public void testOne() {
		String name="Kumar";
		
		for(int i=name.length()-1;i>=0;i--) {
			
			char ch=name.charAt(i);
			System.out.print(ch);
		}
		
		
		
	}
	public void testTwo() {
		String name="kumar";
		
		StringBuffer object=new StringBuffer();
		object.reverse();
		System.out.println(object);
		}

}
