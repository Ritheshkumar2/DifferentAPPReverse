package ddd;

import org.testng.annotations.Test;

@Test
public class Basic {
	
	public void testOne() {
		String name="Rithesh";
		
		for(int i=name.length()-1;i>=0;i--) {
			
			char ch=name.charAt(i);
			System.out.print(ch);
		}
		
	}
}
