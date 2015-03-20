package com.clovisleoncio.labs.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataRetriever {

	private Pattern pattern;

	public DataRetriever(String patternString) {
		pattern = Pattern.compile(patternString);
	}

	public String getSingleResult(String string) {
		Matcher matcher = pattern.matcher(string);
		return matcher.find() ? matcher.group() : null;
	}

	public List<String> getResultList(String string) {
		Matcher matcher = pattern.matcher(string);
		List<String> resultList = new ArrayList<String>();
		while (matcher.find()) {
			resultList.add(matcher.group());
		}
		return resultList;
	}

}
