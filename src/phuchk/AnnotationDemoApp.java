package phuchk;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ICoach coach = context.getBean("myTennisCoach", ICoach.class);
		
		System.out.println(coach.getDailyWorkout());
		
		context.close();

	}

}
