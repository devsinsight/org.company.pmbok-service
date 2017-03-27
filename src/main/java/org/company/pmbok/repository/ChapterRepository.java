package org.company.pmbok.repository;

import java.util.List;

import org.company.pmbok.domain.Chapter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChapterRepository extends JpaRepository<Chapter, Integer> {

	public List<Chapter> findByBookId(int bookId);
}
