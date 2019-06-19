package com.projectku;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {

	@RequestMapping("/halo")
	public String index() {
		return "halo";
	}
	
	@RequestMapping("/salam")
	public String salam(@RequestParam (value = "nama") String nama, Model model) {
		model.addAttribute("nama", nama);
		return "salam";
	}
	
	@RequestMapping("/tampilkan/{angka1}/{angka2}")
	public String tampilkan(@PathVariable int angka1, @PathVariable int angka2, Model model) {
		model.addAttribute("angka1", angka1);
		model.addAttribute("angka2", angka2);
		return "contoh";
	}
	
	

}
