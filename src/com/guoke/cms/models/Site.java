package com.guoke.cms.models;

import javax.persistence.Entity;

import com.guoke.model.BaseEntity;
import com.guoke.model.meta.Metadata;

@Entity
public class Site extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Metadata(name="站点名称")
	private String sitename;
	
	@Metadata(name="站点描述")
	private String sitedesc;
	
	@Metadata(name="sitekey")
	private String sitekey;

	public String getSitename() {
		return sitename;
	}

	public void setSitename(String sitename) {
		this.sitename = sitename;
	}

	public String getSitedesc() {
		return sitedesc;
	}

	public void setSitedesc(String sitedesc) {
		this.sitedesc = sitedesc;
	}

	public String getSitekey() {
		return sitekey;
	}

	public void setSitekey(String sitekey) {
		this.sitekey = sitekey;
	}

}
