package phuchk;

import org.springframework.stereotype.Component;

@Component("myTennisCoach")
public class TennisCoach implements ICoach {

	@Override
	public String getDailyWorkout() {
		return "This is Tennis Coach";
	}

}
