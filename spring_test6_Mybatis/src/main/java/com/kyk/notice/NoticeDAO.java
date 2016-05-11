package com.kyk.notice;

import java.util.List;

public interface NoticeDAO {
	
	//글목록조회
	public List<NoticeDTO> noticelist(int startNum, int lastNum)throws Exception;
		
	//글쓰기
	public void noticeWrite(NoticeDTO noticeDTO)throws Exception;
	
	//글보기
	public NoticeDTO noticeView(int num)throws Exception;
		
	//총 페이지 수 반환
	public int getTotalList()throws Exception;

}
