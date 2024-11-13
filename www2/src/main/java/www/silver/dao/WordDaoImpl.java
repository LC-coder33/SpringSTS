package www.silver.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import www.silver.vo.wordVO;

@Repository
public class WordDaoImpl implements IF_WordDao {
	
	@Inject
	SqlSession sqlSession;
	private static String mapperQuery="www.silver.dao.IF_WordDao";
	
	@Override
	public void insertWord(wordVO wvo) throws Exception {
		System.out.println("success");
		sqlSession.insert(mapperQuery+".insertWord",wvo);
	}

	@Override
	public void selectAll(wordVO wvo) throws Exception {
		
	}

}
