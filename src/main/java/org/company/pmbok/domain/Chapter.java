package org.company.pmbok.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Chapter", schema="dbo")
public class Chapter {

	@Id
	public int id;
	
	@Column(name = "BookId")
	public int bookId;
	
	@Column(name = "Name")
	public String name;
	
	@Column(name = "ShortName")
	public String shortName;
	
	@Column(name = "Description")
	public String description;
	
	@Column(name = "IsEnable")
	public boolean isEnable;
	
	@Column(name = "CreationDate")
	public String creationDate;
}
