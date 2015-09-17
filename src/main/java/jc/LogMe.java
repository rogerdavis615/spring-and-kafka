package jc;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component
public class LogMe {

	private static Log log = LogFactory.getLog(LogMe.class);		
	static public void logMe(String key, List<String> values) {
		values.forEach(value -> {
			log.info("key:" + key + " value:" + value);
		});
//		values.forEach(value -> log.info("key:" + value.getKey() + " value:" + getValue()));
	}
	
}
