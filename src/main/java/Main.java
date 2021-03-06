import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import builder.Unit;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context =
				new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Unit warriorUnit = (Unit) context.getBean("warrior_unit");
		Unit assassinUnit = (Unit) context.getBean("assassin_unit");
		
		warriorUnit.show();
		warriorUnit.say("Hello");
		warriorUnit.testActions();

		assassinUnit.show();
		assassinUnit.say("I'll kill you!");
		assassinUnit.testActions();
		
		/*Unit warriorUnit2 = (Unit) context.getBean("warrior_unit3");
		Unit warriorUnitPrototype = (Unit) context.getBean("warrior_unit3_prototype");
		Unit warriorUnitPrototype2 = (Unit) context.getBean("warrior_unit3_prototype");
		
		//typed sysout
		System.out.println(warriorUnit);
		System.out.println(warriorUnit2);
		System.out.println(warriorUnitPrototype);
		System.out.println(warriorUnitPrototype2);*/
		
		// Unit warriorUnit4 = (Unit) context.getBean("warrior_unit4");
		// System.out.println(warriorUnit);
		// System.out.println(warriorUnit4);
		
		// warriorUnit4 = null;
	}

}
