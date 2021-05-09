package com.example.ElectionDemo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * Author: Tukhtaboy Jumaniyazov 
 * Date: 5/1/2021 5:30 PM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CandidateDto {
    private Long id;
    private String fullName;
    private String currentJob;
    private String about;
    private Map<String, String> moreInformation;
    public CandidateDto (long id, String fullname, String currentJob, String about, Map<String, String> moreInformation) {
    	this.id=id;
    	this.fullName=fullname;
    	this.currentJob=currentJob;
    	this.about=about;
    	this.moreInformation=moreInformation;
    }
	public CandidateDto() {
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getCurrentJob() {
		return currentJob;
	}
	public void setCurrentJob(String currentJob) {
		this.currentJob = currentJob;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public Map<String, String> getMoreInformation() {
		return moreInformation;
	}
	public void setMoreInformation(Map<String, String> moreInformation) {
		this.moreInformation = moreInformation;
	}
}
