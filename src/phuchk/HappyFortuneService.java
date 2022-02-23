package phuchk;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements IFortuneService {

	@Override
	public String getFortuneService() {
		return "This is Happy Fortune Service";
	}

}
