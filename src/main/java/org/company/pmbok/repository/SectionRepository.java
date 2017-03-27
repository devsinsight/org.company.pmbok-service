package org.company.pmbok.repository;

import java.util.List;

import org.company.pmbok.domain.Section;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SectionRepository extends JpaRepository<Section, Integer>  {

	public List<Section> findByChapterId(int chapterId);
}
