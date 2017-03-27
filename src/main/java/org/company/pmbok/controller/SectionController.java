package org.company.pmbok.controller;

import java.util.List;

import org.company.pmbok.domain.Section;
import org.company.pmbok.repository.SectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/section")
public class SectionController {

	@Autowired
	private SectionRepository _sectionRepository;
	
	@CrossOrigin
	@RequestMapping(value = "GetSectionByChapterId/{chapterId}", method = RequestMethod.GET)
	public List<Section> GetSectionByChapterId(@PathVariable("chapterId") int chapterId){
		
		return _sectionRepository.findByChapterId(chapterId);
	}
	
}