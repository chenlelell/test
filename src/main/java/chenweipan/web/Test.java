package chenweipan.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import chenweipan.po.TbTest;
import chenweipan.service.TestService;
import chenweipan.util.CommonResult;

@Controller
@RequestMapping("test")
public class Test {

	private static final Logger logger = LoggerFactory.getLogger(Test.class);

	@Autowired
	TestService testService;
	
	@RequestMapping(value="/test.json")
	@ResponseBody
	public CommonResult test()
	{
		logger.info("this is log info");
		TbTest test = testService.getOne();
		logger.info("test:{}",test);
		CommonResult result = new CommonResult();
		result.setCode("200");
		result.setDetail("SUCCESS");
		return result;
	}
}
