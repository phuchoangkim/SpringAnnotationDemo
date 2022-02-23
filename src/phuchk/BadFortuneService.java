package phuchk;

import org.springframework.stereotype.Component;

@Component
public class BadFortuneService implements IFortuneService {

	@Override
	public String getFortuneService() {
		return "This is Bad Fortune Service";
	}

}
