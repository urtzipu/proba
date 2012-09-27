package com.isad.bertsioak;

import java.util.ArrayList;

public class Hauteskundeak {

	private ArrayList<String> mahaiak = new ArrayList<String>();

	@Override
	public String toString() {
		String emaitza = "";
		for (String mahai : mahaiak) {
			emaitza += mahai + " ";
		}
		return emaitza;
	}
	private void gehituMahaia(String mahai) {
			mahaiak .add(mahai);
	}

	public static void main(String[] args) {
		Hauteskundeak h2012 = new Hauteskundeak();

		h2012.gehituMahaia("Irun");
		h2012.gehituMahaia("Tolosa");

		System.out.println(h2012);
	}

}
