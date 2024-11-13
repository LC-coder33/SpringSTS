package www.silver.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import www.silver.dao.IF_BoardDao;
import www.silver.vo.BoardVO;
import www.silver.vo.PageVO;

@Service
public class BoardServiceImpl implements IF_BoardService{
	@Inject
	IF_BoardDao boarddao;

	public void addBoard(BoardVO boardvo) throws Exception {
		if(boardvo.getViewmember() != null) {
			if(boardvo.getViewmember().equals("1")) {
				boardvo.setViewmember("비공개");
			} 
		} else {
			boardvo.setViewmember("공개");
		}
		boarddao.insertBoard(boardvo);
		// dao > mapper > DB insert
	}

	@Override
	public List<BoardVO> boardList(PageVO pagevo) throws Exception {
		List<BoardVO> list = boarddao.selectAll(pagevo);
		for(BoardVO b : list) {
			String date = b.getIndate();
			b.setIndate(date.substring(0,10));
		}
		return list;		//이 코드를 쓰면 밑의 return boarddao.selectAll()은 필요 없음
//		return boarddao.selectAll();
	}

	@Override
	public void deleteBoard(String delno) throws Exception {
		boarddao.deleteBoard(delno);
	}

	@Override
	public BoardVO modBoard(String modno) throws Exception {
		
		return boarddao.selectOne(modno);
	}

	@Override
	public void modBoard(BoardVO boardvo) throws Exception {
		if(boardvo.getViewmember() != null) {
			if(boardvo.getViewmember().equals("1")) {
				boardvo.setViewmember("비공개");
			} 
		} else {
			boardvo.setViewmember("공개");
		}
		boarddao.updateBoard(boardvo);
	}
}
