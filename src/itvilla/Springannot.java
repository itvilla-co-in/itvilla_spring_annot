package itvilla;

import org.springframework.context.support.FileSystemXmlApplicationContext;
import itvilla.emp;

public class Springannot {

	public static void main(String[] args) {

		
		FileSystemXmlApplicationContext context = 
				new FileSystemXmlApplicationContext("Springannot.xml");
		
				
		emp e1 = (emp) context.getBean("emp");
			

	}

}
