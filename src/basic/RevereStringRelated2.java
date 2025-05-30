package basic;

public class RevereStringRelated2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RevereStringRelated2 obj=new RevereStringRelated2();
		obj.testOne();
		System.out.println("");
		obj.testOne();

	}
	public void testOne() {
		String name="Rithesh";
		
		for(int i=name.length()-1;i>=0;i--) {
			
			char ch=name.charAt(i);
			System.out.print(ch);
		}
		
		
		
	}
	public void testTwo() {
		String name="Rithesh";
		
		StringBuffer object=new StringBuffer();
		object.reverse();
		System.out.println(object);
		}

}
