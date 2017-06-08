package chenweipan.po;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="test")
public class TbTest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4269572059946676521L;
	
	@Id
	@Column(name="id",nullable=false,unique=true)
	private Integer id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "TbTest [id=" + id + ", name=" + name + ", description=" + description + "]";
	}

}
