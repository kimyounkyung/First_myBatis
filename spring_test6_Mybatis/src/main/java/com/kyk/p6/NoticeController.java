package com.kyk.p6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kyk.notice.NoticeDAO;
import com.kyk.notice.NoticeDTO;

@Controller
@RequestMapping("/notice/*")
public class NoticeController {

	@Autowired
	private NoticeDAO noticeDAO;
	
	
	@RequestMapping("/view")
	public String getView(@RequestParam int num, Model model){
		try {
			NoticeDTO noticeDTO = noticeDAO.noticeView(num);
			model.addAttribute("noticeDTO", noticeDTO);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "notice/noticeView";
	}
	
	
	
}
