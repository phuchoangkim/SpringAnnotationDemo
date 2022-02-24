package phuchk;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements ICoach {

	private IFortuneService _fortuneService;

	@Value("${name}")
	public String name;
	
	@Value("${age}")
	public int age;
	
	public SwimCoach() {
		
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Post construct");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Pre destroy");
	}
	
	public SwimCoach(IFortuneService fortuneService) {
		this._fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "This is Swim Coach";
	}

	@Override
	public String getDailyFortune() {
		return _fortuneService.getFortuneService();
	}

}
