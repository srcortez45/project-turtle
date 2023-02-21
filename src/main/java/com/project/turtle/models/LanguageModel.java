package com.project.turtle.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
public class LanguageModel {
	
	private int id;
	private String name;
	private String slug;
	private String code;
	
}
