package www.silver.hom;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import www.silver.service.IF_WordService;
import www.silver.vo.wordVO;

@Controller
public class WordController {
    
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	private ArrayList<wordVO> dictionary = new ArrayList<>();
	
	IF_WordService wordservice;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/word", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home1";

	}
	
	@RequestMapping(value = "searchword", method = RequestMethod.GET)
	public String timeline() {
		

		 for (wordVO dic : dictionary) {
		        System.out.println("영어: " + dic.getEword() + ", 한국어: " + dic.getKword());
		    }
		return "searchword";
		
	}
	
	 @RequestMapping(value = "translate", method = RequestMethod.GET)
	    public String searchWord(@RequestParam("word") String word, Model m) {
		String meaning = "";
	        
	        for (wordVO dic : dictionary) {
	            if (dic.getEword().equalsIgnoreCase(word)) {
	            	word = dic.getEword();
	                meaning = dic.getKword();
	                break;
	            } else {
	            	meaning = "없는 단어입니다.";
	            }
	        }
	        m.addAttribute("word", word);
	        m.addAttribute("meaning", meaning);
	        return "translate";
	    }
	 @RequestMapping(value = "addword", method = RequestMethod.POST)
	    public String addWord(@ModelAttribute wordVO wvo, Model m) throws Exception {
	        wordservice.join(wvo);
	        
	        m.addAttribute("message", "단어가 추가되었습니다.");
	        
	        return "searchword"; 
	    }
    
}