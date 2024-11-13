package www.silver.hom;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import www.silver.service.IF_ApparelService;
import www.silver.vo.SuitVO;

@Controller
public class ApparelController {
	
	@Inject
	IF_ApparelService apparelservice;
	
	@GetMapping(value = "suitpage")
	public String suitpage(Model m) throws Exception {
		List<SuitVO> list = apparelservice.suitList();
		System.out.println(list.size()+"개의 옷 종류 개수");
		m.addAttribute("list",list);
		return "suitpage";
	}
	
	@GetMapping(value = "suitwr")
	public String suitwr() throws Exception{
		System.out.println("추가해보겠습니다.");
		return "suitwr";
	}
	
	@PostMapping(value="suitadd")
	public String suitadd(@ModelAttribute SuitVO suitvo) throws Exception {
		apparelservice.suitadd(suitvo);
		return "redirect:suitpage";
	}
}
