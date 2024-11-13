package www.silver.dao;

import www.silver.vo.wordVO;

public interface IF_WordDao {
	public void insertWord(wordVO wvo) throws Exception;
	public void selectAll(wordVO wvo) throws Exception;
}
