package kieunga.com.test;

import kieunga.com.model.SanPham;

public class TestSanPham {

	public static void main(String[] args) {
		SanPham sp1=new SanPham();
		sp1.setMa(1);
		sp1.setTen("Cocacola");
		sp1.setGia(15);
		System.out.println(sp1);
	}

}
