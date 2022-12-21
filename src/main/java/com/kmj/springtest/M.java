package com.kmj.springtest;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@Service
public class M {

	@Autowired
	private SqlSession ss;

	public void getAllShoes(HttpServletRequest request) {

		ShoesMapper mm = ss.getMapper(ShoesMapper.class);
		List<ShoesDTO> shoes = mm.getAllShoes();

		request.setAttribute("shoes", shoes);

	}

	public void regShoes(ShoesDTO s, HttpServletRequest request) {
		// 파일 얻어내는 과정
		try {
			String path = request.getSession().getServletContext().getRealPath("resources/imgs");
			System.out.println(path);
			MultipartRequest mr = new MultipartRequest(request, path, 31457280, "utf-8", new DefaultFileRenamePolicy());

			String name = mr.getParameter("s_name");
			int price = Integer.parseInt(mr.getParameter("s_price"));
			int size = Integer.parseInt(mr.getParameter("s_size"));
			String img = mr.getFilesystemName("s_file");
			String brand = mr.getParameter("s_brand");
			String description = mr.getParameter("s_description");

			s.setS_name(name);
			s.setS_brand(brand);
			s.setS_file(img);
			s.setS_price(price);
			s.setS_size(size);
			s.setS_description(description);

			ShoesMapper mm = ss.getMapper(ShoesMapper.class);
			if (mm.regProduct(s) == 1) {
				request.setAttribute("r", "등록 성공");
			} else {
				request.setAttribute("r", "등록 실패");

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void getShoes(ShoesDTO s, HttpServletRequest request) {

		ShoesMapper mm = ss.getMapper(ShoesMapper.class);

		ShoesDTO shoes = mm.getShoes(s);

		request.setAttribute("shoes", shoes);

	}

	public void doUpdate(ShoesDTO2 s, HttpServletRequest request) {

		try {
			String path = request.getSession().getServletContext().getRealPath("resources/imgs");
			System.out.println(path);
			MultipartRequest mr = new MultipartRequest(request, path, 31457280, "utf-8", new DefaultFileRenamePolicy());

			String name;
			int price;
			int size;
			String img;
			String brand;
			String description;

			int s_no = Integer.parseInt(mr.getParameter("s_no2"));

			name = mr.getParameter("s_name2");
			price = Integer.parseInt(mr.getParameter("s_price2"));
			size = Integer.parseInt(mr.getParameter("s_size2"));
			img = mr.getFilesystemName("s_file2");
			brand = mr.getParameter("s_brand2");
			description = mr.getParameter("s_description2");
			s.setS_no2(s_no);
			s.setS_name2(name);
			s.setS_brand2(brand);
			s.setS_file2(img);
			s.setS_price2(price);
			s.setS_size2(size);
			s.setS_description2(description);

			ShoesMapper mm = ss.getMapper(ShoesMapper.class);
			if (mm.updateShoes(s) > 0) {
				request.setAttribute("r", "수정함");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void deleteShoes(ShoesDTO s) {
		ShoesMapper mm = ss.getMapper(ShoesMapper.class);
		if (mm.deleteShoes(s) == 1) {

		}
	}

}
