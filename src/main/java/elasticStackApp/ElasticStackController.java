package elasticStackApp;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Date;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ElasticStackController {
	
	private static final Logger Log = Logger.getLogger(ElasticStackController.class);
	
   
	
	@RequestMapping(value="/elasticDemo")
	public String helloElasticStack() {
		String response = "Hello welcome to Elastic Stack Demo"+ new Date();
		Log.log(Level.INFO, "Elastic Log");
		Log.log(Level.INFO, "/elasticDemo - &gt"+response);
		return response;
	}
	
	@RequestMapping(value = "/exception")
    public String exception() {
        String rsp = "";
        try {
            int i = 1 / 0;
            // should get exception
        } catch (Exception e) {
            e.printStackTrace();
            Log.error(e);
             
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            e.printStackTrace(pw);
            String sStackTrace = sw.toString(); // stack trace as a string
            Log.error("Exception As String :: - &gt; "+sStackTrace);
             
            rsp = sStackTrace;
        }
 
        return rsp;
    }

}
