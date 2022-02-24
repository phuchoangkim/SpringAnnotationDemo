package phuchk;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		ICoach coach = context.getBean("tennisCoach", ICoach.class);
		ICoach theCoach = context.getBean("tennisCoach", ICoach.class);

		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());

		System.out.println("Is equal: " + (coach == theCoach));

		context.close();

	}

}
