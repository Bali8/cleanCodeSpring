package code.clean.system.example3;

import java.util.logging.Logger;

@org.springframework.stereotype.Service
public class DefaultService implements Service {
	private static final Logger logger = Logger.getGlobal();

	@Override
	public void execute() {
		logger.info("executing Default Service");
	}
}