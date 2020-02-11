package code.clean.system.example3;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ServiceController {
	private static final Logger logger = Logger.getGlobal();
	
	private Service service;

	public void doAction() {
		logger.info("doAction in Controller");
		getService().execute();
	}
	@Autowired
	public void setService(Service service) {
		this.service = service;
	}

	public Service getService() {
		return service;
	}
}
