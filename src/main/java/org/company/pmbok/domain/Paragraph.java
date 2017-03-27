package org.company.pmbok.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
	
	
}
