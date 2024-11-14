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
		boarddao.insertBoard(boardvo);	// 게시글을 kboard에 저장해라.
		// dao > mapper > DB insert
		String[] fname = boardvo.getFilename();
			for ( int i = 0; i < fname.length; i++) {	// 만약 첨부파일이 있다면 첨부파일이 있다면 첨부파일을 kboard_attach로 저장해라...
				if (fname[i] != null)
				boarddao.insertAttach(fname[i]);
				// kboard_attach 테이블에 저장하는 코드
			}
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

	@Override
	public int totalCountBoard() throws Exception {
		return boarddao.cntBoard();
	}

	@Override
	public BoardVO getBoard(String no) throws Exception {
		
		return boarddao.selectOne(no);
	}

	@Override
	public List<String> getAttach(String no) throws Exception {
		
		return boarddao.selectAllattach(no);
	}
}
