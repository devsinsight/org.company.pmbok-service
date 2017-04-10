package org.company.pmbok.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Book", schema="dbo")
public class Book {

	@Id
	public int id;
	
	@Column(name = "Name")
	public String name;
	
	@Column(name = "Autor")
	public String autor;
	
	@Column(name = "Description")
	public String description;
	
	@Column(name = "IsEnable")
	public boolean isEnable;
	
	@Column(name = "CreationDate")
	public String creationDate;
	
	@OneToMany
	@JoinColumn(name="BookId", referencedColumnName="Id")
	public List<Chapter> chapters;
	
}
