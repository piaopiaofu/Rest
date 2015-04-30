package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodController {
	
	@RequestMapping("/good")
	@ResponseBody
	public Good selgood(){
		return new Good("香蕉","6.5");
	}
	
}
