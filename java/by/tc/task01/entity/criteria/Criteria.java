package by.tc.task01.entity.criteria;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Criteria {

	private String groupSearchName;
	private Map<String, Object> criteria = new HashMap<String, Object>();

	public Criteria(String groupSearchName) {
		this.groupSearchName = groupSearchName;
	}
	
	public String getGroupSearchName() {
		return groupSearchName;
	}

	public void add(String searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}

	public Map<String, Object> getCriteria() {
		return criteria;
	}

	public boolean isGroupNameExists(String groupName){
		for (SearchCriteria.GroupName gn : SearchCriteria.GroupName.values() ){
			if(gn.toString().equals(groupName)){
				return true;
			}

		}
		return false;
	}

}
