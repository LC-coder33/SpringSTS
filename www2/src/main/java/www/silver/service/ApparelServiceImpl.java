package www.silver.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import www.silver.dao.IF_SuitDao;
import www.silver.vo.SuitVO;
@Service
public class ApparelServiceImpl implements IF_ApparelService {
	@Inject
	IF_SuitDao suitdao;
	
	@Override
	public void suitadd(SuitVO suitvo) throws Exception {
		suitdao.insertSuit(suitvo);
	}

	@Override
	public List<SuitVO> suitList() throws Exception {
		List<SuitVO> list = suitdao.searchAll();
		for(SuitVO s : list) {
			String sdate = s.getIndate();
			s.setIndate(sdate.substring(0,10));
		}
		return list;
	}
	
}
