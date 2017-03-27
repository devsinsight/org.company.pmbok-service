package org.company.pmbok.controller;

import java.util.List;

import org.company.pmbok.domain.Chapter;
import org.company.pmbok.repository.ChapterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/chapter")
public class ChapterController {

	@Autowired
	private ChapterRepository _chapterRepository;
	
	@CrossOrigin
	@RequestMapping(value = "GetChaptersByBookId/{bookId}", method = RequestMethod.GET)
	public List<Chapter> GetChaptersByBookId(@PathVariable("bookId") int bookId){
		
		return _chapterRepository.findByBookId(bookId);
	}
	
}
