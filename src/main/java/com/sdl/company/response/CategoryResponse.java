package com.sdl.company.response;

import java.util.List;

import com.sdl.company.model.Category;

import lombok.Data;


@Data
public class CategoryResponse {
	
	private List<Category> category;

}
