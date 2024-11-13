package www.silver.service;

import java.util.List;

import www.silver.vo.SuitVO;

public interface IF_ApparelService {
	public void suitadd(SuitVO suitvo) throws Exception;
	public List<SuitVO> suitList() throws Exception;
}
