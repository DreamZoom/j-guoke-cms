package com.guoke.cms.models;

import javax.persistence.Entity;

import com.guoke.model.BaseEntity;
import com.guoke.model.meta.Metadata;

@Entity
public class Resource extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Metadata(name="名称")
	private String name;
	@Metadata(name="描述")
	private String descript;
	@Metadata(name="类型")
	private String type;
	@Metadata(name="关键字")
	private String keywords;
	@Metadata(name="摘要")
	private String summary;
	@Metadata(name="内容")
	private String body;
	
	@Metadata(name="分类编号")
	private int categoryId;


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}





	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getKeywords() {
		return keywords;
	}


	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}


	public String getSummary() {
		return summary;
	}


	public void setSummary(String summary) {
		this.summary = summary;
	}


	public String getBody() {
		return body;
	}


	public void setBody(String body) {
		this.body = body;
	}


	public String getDescript() {
		return descript;
	}


	public void setDescript(String descript) {
		this.descript = descript;
	}


	public int getCategoryId() {
		return categoryId;
	}


	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

}
