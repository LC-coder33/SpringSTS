package www.silver.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import www.silver.vo.MemberVO;
@Repository
public class MemberDaoImpl implements IF_MemberDao {

	// sqlSession이 필요합니다.	mybatis에서 제공하는 객체
	// 주소가 올바르게 주입되려면 root-context.xml에서 설정이 잘 되어 있어야 한다.
	@Inject
	SqlSession sqlSession;
	private static String mapperQuery="www.silver.dao.IF_MemberDao";
	@Override
	public void insertOne(MemberVO membervo) throws Exception {
		// sqlSessionTemplate 의 객체의 메소드를 call하면 된다.
		// sqlSession.insert("mapper와 매핑 정보","파라미터값")
		System.out.println("dao");
		sqlSession.insert(mapperQuery+".insertOne",membervo);
		// www.silver.dao.IF_MemberDao.insertOne << 매핑의 정보. 매퍼의 namespace, id와 매칭해켜야한다.
	}

	
	
}
