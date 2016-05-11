package com.kyk.notice;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class NoticeDAOImpl implements NoticeDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private static final String nameSpace = "NoticeMapper";
	
	@Override
	public List<NoticeDTO> noticelist(int startNum, int lastNum) throws Exception {
		List<NoticeDTO> ar = sqlSession.selectList(nameSpace);
		return ar;
	}

	@Override
	public void noticeWrite(NoticeDTO noticeDTO) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public NoticeDTO noticeView(int num) throws Exception {
		NoticeDTO noticeDTO = sqlSession.selectOne(nameSpace+".noticeView", num);
		return noticeDTO;
	}

	@Override
	public int getTotalList() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
