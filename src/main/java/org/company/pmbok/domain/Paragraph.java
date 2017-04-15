package org.company.pmbok.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "Paragraph", schema="dbo")
public class Paragraph {

	@Id
	public int id;
	
	@Column(name="SectionId")
	public int sectionId;
	
	@Column(name = "Content")
	public String content;

	@Column(name = "IsEnable")
	public boolean isEnable;
	
	@Column(name = "CreationDate")
	public String creationDate;
	
	@OneToMany
	@JoinColumn(name="ParagraphId", referencedColumnName="Id")
	public List<ParagraphDetail> paragraphDetails;
	
}
