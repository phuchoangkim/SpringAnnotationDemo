package phuchk;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanAnnotationConfigDemoApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		ICoach coach = context.getBean("swimCoach", ICoach.class);

		System.out.println(coach.getDailyWorkout()); 
		System.out.println(coach.getDailyFortune()); 

		context.close();
	}

}
