package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import java.util.List;
import java.util.Map;

public class Validator {
    public static boolean criteriaValidator(Criteria criteria) {
        List<String> allNamesOfTheParameters = SearchCriteria.getParameterNamesOfTheAllAppliances();
        Map<String, Object> criteriaMap = criteria.getCriteria();
        long count;
        for (String parameter : criteriaMap.keySet()) {
            count = allNamesOfTheParameters.stream()
                    .filter(nameofTheParameter -> nameofTheParameter.equals(parameter))
                    .count();
            if (count == 0) {
                return false;
            }
        }

        return criteria.isGroupNameExists(criteria.getGroupSearchName());
    }

}
