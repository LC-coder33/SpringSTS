package www.silver.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import www.silver.dao.IF_WordDao;
import www.silver.vo.wordVO;

@Service
public class WordServiceImpl implements IF_WordService{
	@Inject
	IF_WordDao worddao;
	public void join(wordVO wvo) throws Exception {
		System.out.println("join 서비스");
		// dao에게 작업 지시해야 한다...
		// 실제 데이터를 저장하도록 지시한다...
		worddao.insertWord(wvo);
//		worddao.selectAll(wvo);
	}
	
}
