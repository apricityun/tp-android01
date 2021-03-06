package com.and4.travel_server.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.and4.travel_server.model.Diary;
import com.and4.travel_server.service.DiaryService;

@RestController
@RequestMapping("/travel/")
public class DiaryController {
	
	@Autowired
	private DiaryService diaryService;

	
	@PostMapping("diaryinsert")
	public String insertDiary(@RequestBody Diary diary) {
		diaryService.insertDiary(diary);
		return "datasave";
	}
	
	@GetMapping("diaryList")
	public Map<String,List<Diary>> doGetDiaryList(){
		Map<String,List<Diary>> map = new HashMap<String,List<Diary>>();
		map.put("diarys",diaryService.doGetDiaryList());
		return map;
	}
	
	@GetMapping("tripDiaryList")
	public Map<String,List<Diary>> doGetTripDiaryList(){
		Map<String,List<Diary>> map = new HashMap<String,List<Diary>>();
		map.put("diarys",diaryService.doGetTripDiaryList());
		return map;
	}
	
	@PostMapping("diaryListDelete/{dno}")
	public void deleteDiaryList(@PathVariable("dno") int dno) {
		diaryService.deleteDiaryList(dno);
	}
	
	
	@GetMapping("getDiary/{dno}")
	public void getDiary(@PathVariable("dno") int dno) {
		
	}
	
}
