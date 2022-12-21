package com.kmj.springtest;

import java.util.List;

public interface ShoesMapper {

	List<ShoesDTO> getAllShoes();

	int regProduct(ShoesDTO s);

	ShoesDTO getShoes(ShoesDTO s);

	int updateShoes(ShoesDTO2 s);

	int deleteShoes(ShoesDTO s);

}
