package com.example.ElectionDemo.dto;

import lombok.Data;

/**
 * Author: Tukhtaboy Jumaniyazov 
 * Date: 5/1/2021 5:31 PM
 */
@Data
public class QuestionDto {
    private Long id;
    private String title;
    private Answer answer;

    public QuestionDto(long id, String title) {
        this.id = id;
        this.title = title;
    }

    public QuestionDto() {
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
}
