package com.laptrinhjavaweb.dto;

public class NewDTO extends AbstractDTO<NewDTO>{
    private Long Id;
	private String title;
	private String content;
	private String shortDescription;
	private String CategoryCode;
	private String Thumbnail;

	public Long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getCategoryCode() {
		return CategoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		CategoryCode = categoryCode;
	}

	public String getThumbnail() {
		return Thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		Thumbnail = thumbnail;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
