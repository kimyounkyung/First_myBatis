package com.kyk.notice;

import java.util.List;

public interface NoticeDAO {
	
	//글목록조회
	public List<NoticeDAO> list(int startNum, int lastNum)throws Exception;
		
	//글쓰기
	public void write(NoticeDAO noticeDAO)throws Exception;
	
	//글보기
	public NoticeDAO view(int num)throws Exception;
		
	//총 페이지 수 반환
	public int getTotalList()throws Exception;

}
