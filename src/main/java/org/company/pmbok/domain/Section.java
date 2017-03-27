package org.company.pmbok.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "Section", schema="dbo")
public class Section {

	@Id
	public int id;
	
	@Column(name = "ChapterId")
	public int chapterId;
	
	@Column(name = "Name")
	public String name;
	
	@Column(name = "IsEnable")
	public boolean isEnable;
	
	@Column(name = "CreationDate")
	public String creationDate;
	
	@OneToMany
	@JoinColumn(name="SectionId", referencedColumnName="Id")
	public List<Paragraph> paragraphs;
}
