package com.kmj.springtest;

public class ShoesDTO {
	private int s_no;
	private String s_file;
	private String s_name;
	private int s_size;
	private int s_price;
	private String s_brand;
	private String s_description;
	
	public ShoesDTO() {
		// TODO Auto-generated constructor stub
	}


	public String getS_file() {
		return s_file;
	}


	public void setS_file(String s_file) {
		this.s_file = s_file;
	}


	public ShoesDTO(int s_no, String s_file, String s_name, int s_size, int s_price, String s_brand,
			String s_description) {
		super();
		this.s_no = s_no;
		this.s_file = s_file;
		this.s_name = s_name;
		this.s_size = s_size;
		this.s_price = s_price;
		this.s_brand = s_brand;
		this.s_description = s_description;
	}


	public int getS_no() {
		return s_no;
	}

	public void setS_no(int s_no) {
		this.s_no = s_no;
	}


	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public int getS_size() {
		return s_size;
	}

	public void setS_size(int s_size) {
		this.s_size = s_size;
	}

	public int getS_price() {
		return s_price;
	}

	public void setS_price(int s_price) {
		this.s_price = s_price;
	}

	public String getS_brand() {
		return s_brand;
	}

	public void setS_brand(String s_brand) {
		this.s_brand = s_brand;
	}

	public String getS_description() {
		return s_description;
	}

	public void setS_description(String s_description) {
		this.s_description = s_description;
	}
}
