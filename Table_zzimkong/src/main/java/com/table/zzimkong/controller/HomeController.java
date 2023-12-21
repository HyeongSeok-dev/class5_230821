package com.table.zzimkong.controller;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.table.zzimkong.vo.SearchVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	@GetMapping("/")
	public String main(Model model, SearchVO search) {
	        search.setPersons(2);
	        
	        LocalDateTime defaultTime = LocalDateTime.now().plusHours(2);
	        LocalDate date;
	        String time;
	        String displayTime;
	        if (defaultTime.toLocalTime().isAfter(LocalTime.of(22, 0)) || defaultTime.toLocalTime().isBefore(LocalTime.of(1, 0))) {
	            date = LocalDate.now().plusDays(1);
	            time = "13:00"; 
	            search.setDisplayDate("내일");
	        } else if (defaultTime.toLocalTime().isBefore(LocalTime.of(10, 0))) {
	            date = LocalDate.now();
	            time = "13:00"; 
	            search.setDisplayDate("오늘");
	        } else {
	        	date = LocalDate.now();
	            // 30분 단위로 반올림
	            int minute = defaultTime.getMinute();
	            if (minute % 30 >= 15) {
	                defaultTime = defaultTime.plusMinutes(30 - (minute % 30));
	            } else {
	                defaultTime = defaultTime.minusMinutes(minute % 30);
	            }
	            time = defaultTime.format(DateTimeFormatter.ofPattern("HH:mm")); 
	            search.setDisplayDate("오늘");
	        }
	        LocalTime localTime = LocalTime.parse(time, DateTimeFormatter.ofPattern("HH:mm"));
	        displayTime = localTime.format(DateTimeFormatter.ofPattern("a h:mm"));
	        search.setDate(date.toString());
	        search.setTime(time);
	        search.setDisplayTime(displayTime);
	        search.setLocation("전국");
	        
	        model.addAttribute("search", search);
	        
	        System.out.println(search);
	    
	    return "main";
	}
	
	@GetMapping("/main_1")
	
	public String main_1(Model model) {
		if(model.getAttribute("persons") == null) {
			model.addAttribute("persons", 2);
			
			LocalDateTime defaultTime = LocalDateTime.now().plusHours(2);
			LocalDate date;
			String time;
			String displayTime;
			if (defaultTime.toLocalTime().isAfter(LocalTime.of(22, 0)) || defaultTime.toLocalTime().isBefore(LocalTime.of(1, 0))) {
				date = LocalDate.now().plusDays(1);
				time = "13"; 
				model.addAttribute("display_date", "내일");
			} else if (defaultTime.toLocalTime().isBefore(LocalTime.of(10, 0))) {
				date = LocalDate.now();
				time = "13"; 
				model.addAttribute("display_date", "오늘");
			} else {
				date = LocalDate.now();
				time = defaultTime.format(DateTimeFormatter.ofPattern("HH")); // 현재 시간에서 2시간 더한 시간
				model.addAttribute("display_date", "오늘");
			}
			LocalTime localTime = LocalTime.parse(time, DateTimeFormatter.ofPattern("HH"));
			displayTime = localTime.format(DateTimeFormatter.ofPattern("a h시"));
			
			model.addAttribute("date", date);
			model.addAttribute("time", time);
			model.addAttribute("display_time", displayTime);
		}
		return "main_1";
	}

	@GetMapping("ceo/sale")
	public String ceo_sale() {
		return "ceo/ceo_sale";
	}

	@GetMapping("ceo/black")
	public String ceo_black() {
		return "ceo/ceo_black";
	}
	
	@GetMapping("ceo/black/register")
	public String ceo_black_register() {
		return "ceo/ceo_black_register";
	}
	
	@GetMapping("ceo/company/list")
	public String ceo_company_list() {
		return "ceo/ceo_company_list";
	}
	
	@GetMapping("ceo/company/view")
	public String ceo_company_view() {
		return "ceo/ceo_company_view";
	}
	
	@GetMapping("ceo/company/register")
	public String ceo_company_register() {
		return "ceo/ceo_company_register";
	}
	
	@GetMapping("ceo/company/modify")
	public String ceo_company_modify() {
		return "ceo/ceo_company_modify";
	}
	
	@GetMapping("ceo/company/ad")
	public String ceo_company_ad() {
		return "ceo/ceo_company_ad";
	}
	
	@GetMapping("ceo/menu/list")
	public String ceo_menu_list() {
		return "ceo/ceo_menu_list";
	}
	
	@GetMapping("ceo/menu/modify")
	public String ceo_menu_modify() {
		return "ceo/ceo_menu_modify";
	}
	
	@GetMapping("ceo/menu/register")
	public String ceo_menu_register() {
		return "ceo/ceo_menu_register";
	}
	
	@GetMapping("ceo/reservation")
	public String ceo_reservation() {
		return "ceo/ceo_reservation";
	}
	
	@GetMapping("ceo/reservation/detail")
	public String ceo_reservation_detail() {
		return "ceo/ceo_reservation_detail";
	}
	
	@GetMapping("ceo/cs/faq")
	public String ceo_cs_faq() {
		return "ceo/ceo_cs_faq";
	}
	
	@GetMapping("ceo/cs/faq/view")
	public String ceo_cs_faq_view() {
		return "ceo/ceo_cs_faq_view";
	}
	
	@GetMapping("ceo/cs/notice")
	public String ceo_cs_notice() {
		return "ceo/ceo_cs_notice";
	}
	
	@GetMapping("ceo/cs/notice/view")
	public String ceo_cs_notice_view() {
		return "ceo/ceo_cs_notice_view";
	}
	
	@GetMapping("ceo/cs/qna/modify")
	public String ceo_cs_qna_modify() {
		return "ceo/ceo_cs_qna_modify";
	}
	
	@GetMapping("ceo/cs/qna/register")
	public String ceo_cs_qna_register() {
		return "ceo/ceo_cs_qna_register";
	}
	
	@GetMapping("ceo/cs/qna/view")
	public String ceo_cs_qna_view() {
		return "ceo/ceo_cs_qna_view";
	}
	
	@GetMapping("ceo/cs/qna")
	public String ceo_cs_qna() {
		return "ceo/ceo_cs_qna";
	}
	
	@GetMapping("my/list")
	public String my_list() {
		return "mypage/my_list";
	}
	
	@GetMapping("my/review")
	public String my_review() {
		return "mypage/my_review";
	}
	
	@GetMapping("my/report/shop")
	public String my_report_shop() {
		return "mypage/my_report_shop";
	}
	
	@GetMapping("my/report/reason")
	public String my_report_reason() {
		return "mypage/my_report_reason";
	}
	
	@GetMapping("my/modify/profile")
	public String my_modify_profile() {
		return "mypage/my_modify_profile";
	}
	
	@GetMapping("my/unregister")
	public String my_unregister() {
		return "mypage/my_unregister";
	}
	
	@GetMapping("my/check/passwd")
	public String my_check_passwd() {
		return "mypage/my_check_passwd";
	}
	
	@GetMapping("my/qna")
	public String my_qna() {
		return "mypage/my_qna";
	}
	
	@GetMapping("my/point")
	public String my_point() {
		return "mypage/my_point";
	}
	
	@GetMapping("my/reservation")
	public String my_reservation() {
		return "mypage/my_reservation";
	}
	
	@GetMapping("my/edit/reservation")
	public String my_edit_reservation() {
		return "mypage/my_edit_reservation";
	}
	
	@GetMapping("my/bookmark")
	public String my_bookmark() {
		return "mypage/my_bookmark";
	}
	
	@GetMapping("review/detail")
	public String review_detail() {
		return "review/review_detail";
	}
	
	@GetMapping("review/write")
	public String review_write() {
		return "review/review_write";
	}
	
	@GetMapping("review/complete")
	public String review_complete() {
		return "review/review_complete";
	}
	
	@GetMapping("review/report")
	public String review_report() {
		return "review/review_report";
	}

	@GetMapping("review/comment")
	public String review_comment() {
		return "review/review_comment";
	}

	@GetMapping("reservation")
	public String reservation() {
		return "reservation/reservation";
	}
	
	@GetMapping("member/cs/faq")
	public String member_cs_faq() {
		return "cs/member_cs_faq";
	}
	
	@GetMapping("member/cs/faq/view")
	public String member_cs_faq_view() {
		return "cs/member_cs_faq_view";
	}
	
	@GetMapping("member/cs/notice")
	public String member_cs_notice() {
		return "cs/member_cs_notice";
	}
	
	@GetMapping("member/cs/notice/view")
	public String member_cs_notice_view() {
		return "cs/member_cs_notice_view";
	}
	
	@GetMapping("member/cs/qna/modify")
	public String member_cs_qna_modify() {
		return "cs/member_cs_qna_modify";		
	}
	
	@GetMapping("member/cs/qna/register")
	public String member_cs_qna_register() {
		return "cs/member_cs_qna_register";
	}
	
	@GetMapping("member/cs/qna")
	public String member_cs_qna() {
		return "cs/member_cs_qna";
	}
	
	@GetMapping("member/cs/qna/view")
	public String member_cs_qna_view() {
		return "cs/member_cs_qna_view";
	}
	
	@GetMapping("top2")
	public String top2() {
		return "inc/top2";
	}
	
	@GetMapping("top2/searchbar")
	public String top2_search_bar() {
		return "inc/top2_search_bar";
	}
	
}
