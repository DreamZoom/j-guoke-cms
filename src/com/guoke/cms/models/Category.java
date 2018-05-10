package com.guoke.cms.models;

import javax.persistence.Entity;

import com.guoke.model.BaseEntity;
import com.guoke.model.meta.Metadata;

@Entity
public class Category  extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Metadata(name="分类名称")
	private String catename;
	
	@Metadata(name="分类描述")
	private String catedesc;
	
	
	@Metadata(name="sitekey")
	private String sitekey;


	public String getCatename() {
		return catename;
	}


	public void setCatename(String catename) {
		this.catename = catename;
	}


	public String getCatedesc() {
		return catedesc;
	}


	public void setCatedesc(String catedesc) {
		this.catedesc = catedesc;
	}


	public String getSitekey() {
		return sitekey;
	}


	public void setSitekey(String sitekey) {
		this.sitekey = sitekey;
	}

}
