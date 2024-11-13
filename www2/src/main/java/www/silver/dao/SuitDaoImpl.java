package www.silver.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import www.silver.vo.SuitVO;

@Repository
public class SuitDaoImpl implements IF_SuitDao {
	
	@Inject
	SqlSession sqlsession;
	final String mapperQuery="www.silver.dao.IF_SuitDao";
	
	@Override
	public void insertSuit(SuitVO suitvo) throws Exception {
		sqlsession.insert(mapperQuery+".insuit", suitvo);
	}

	@Override
	public List<SuitVO> searchAll() throws Exception {
		
		return sqlsession.selectList(mapperQuery+".searchall");
	}

}
