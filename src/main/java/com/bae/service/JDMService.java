package com.bae.service;

import java.util.List;

import com.bae.data.JDMicon;

public interface JDMService {

	List<JDMicon> getAllJDMicon();

	JDMicon getJDMicon(int id);

	JDMicon replaceJDMicon(int id, JDMicon newJDMicon);

	String deleteJDMicon(int id);

	void createJDMicon(JDMicon icon);

}
