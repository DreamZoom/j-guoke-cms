package com.guoke.cms.models;

import javax.persistence.Entity;

import com.guoke.model.BaseEntity;
import com.guoke.model.meta.Metadata;

@Entity
public class Tag extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Metadata(name="标签名称")
	private String tagname;

	public String getTagname() {
		return tagname;
	}

	public void setTagname(String tagname) {
		this.tagname = tagname;
	}

}
