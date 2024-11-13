package www.silver.dao;

import java.util.List;

import www.silver.vo.SuitVO;

public interface IF_SuitDao {
	public void insertSuit(SuitVO suitvo) throws Exception;
	public List<SuitVO> searchAll() throws Exception;
}
