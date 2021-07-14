package com.bae.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.bae.data.JDMicon;

@Service
@Primary
public class JDMServiceList implements JDMService {
	private List<JDMicon> icon = new ArrayList<>();

	@Override
	public void createJDMicon(JDMicon icon) {
		System.out.println(icon);
		this.icon.add(icon);
	}

	@Override
	public List<JDMicon> getAllJDMicon() {
		return this.icon;
	}

	@Override
	public JDMicon getJDMicon(int id) {
		JDMicon found = this.icon.get(id);
		return found;
	}

	@Override
	public String deleteJDMicon(int id) {
		this.icon.remove(id);
		return "Deleted icon at index: " + id;
	}

	@Override
	public JDMicon replaceJDMicon(int id, JDMicon newJDMicon) {
		return null;
	}

}
