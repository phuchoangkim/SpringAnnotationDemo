package phuchk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements ICoach {

	private IFortuneService _fortuneService;

	public TennisCoach() {

	}

	@Autowired
	public TennisCoach(IFortuneService fortuneService) {
		this._fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "This is Tennis Coach";
	}

	@Override
	public String getDailyFortune() {
		return this._fortuneService.getFortuneService();
	}

}
