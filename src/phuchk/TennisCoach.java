package phuchk;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

@Component
@Scope("singleton")
public class TennisCoach implements ICoach {

	@Autowired
	@Qualifier("badFortuneService")
	private IFortuneService _fortuneService;

	public TennisCoach() {
		
	}

	@PostConstruct
	public void init() {
		System.out.println("Call init method");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Call destroy method");
	}

//	@Autowired
//	public void setFortuneService(IFortuneService fortuneService) {
//		this._fortuneService = fortuneService;
//		System.out.println("Running set fortune service");
//	}
//
//	@Autowired
//	public TennisCoach(IFortuneService fortuneService) {
//		this._fortuneService = fortuneService;
//		System.out.println("Running constructor fortune service");
//	}

	@Override
	public String getDailyWorkout() {
		return "This is Tennis Coach";
	}

	@Override
	public String getDailyFortune() {
		return this._fortuneService.getFortuneService();
	}

}
