package org.company.pmbok.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "ParagraphDetail", schema="dbo")
public class ParagraphDetail {

	@Id
	public int id;
	
	@Column(name="ParagraphId")
	public int paragraphId;
	
	@Column(name="FileFormatId")
	public int fileFormatId;
	
	@Column(name = "Content")
	public String content;
	
	@Column(name = "IsEnable")
	public boolean isEnable;
	
	
	
}
