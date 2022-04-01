package by.tc.task01.dao.impl;

import by.tc.task01.builder.*;
import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ApplianceDAOImpl implements ApplianceDAO {
    private final String PATH = "resources/appliances_db.txt";

    @Override
    public List<Appliance> find(Criteria criteria) {
        Map<String, Object> criteriaMap = criteria.getCriteria();

        List<Appliance> listOfAppliances = new ArrayList<>();
        try (FileReader fileReader = new FileReader(PATH)) {

            Scanner sc = new Scanner(fileReader);
            while (sc.hasNextLine()) {
                String currentLine = sc.nextLine();
                String nameOfTheGroup = currentLine.split(" : ")[0];
                if (!currentLine.isEmpty()) {
                    if (criteria.isGroupNameExists(criteria.getGroupSearchName())) {

                        if (fileParsing(currentLine, criteriaMap) != null && nameOfTheGroup.equals(criteria.getGroupSearchName())) {
                            listOfAppliances.add(fileParsing(currentLine, criteriaMap));
                        }
                    } else {
                        if (fileParsing(currentLine, criteriaMap) != null) {
                            listOfAppliances.add(fileParsing(currentLine, criteriaMap));
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return listOfAppliances;
    }

    private static Appliance fileParsing(String str, Map<String, Object> criteria) {

        String[] arrayOfParameters = str.split(" : ")[1].split(",\\s");
        String[] cleanParameters = new String[arrayOfParameters.length];
        int counter = 0;
        for (int i = 0; i < arrayOfParameters.length; i++) {
            cleanParameters[i] = arrayOfParameters[i].split("[=;]")[1];
        }
        for (int i = 0; i < arrayOfParameters.length; i++) {

            for (Map.Entry parameter : criteria.entrySet()) {

                if (arrayOfParameters[i].split("=")[0].equals(parameter.getKey().toString()) && cleanParameters[i].equals(parameter.getValue().toString())) {

                    counter++;
                    if (counter == criteria.size()) {

                        return createObject(str.split(" : ")[0], cleanParameters);
                    }
                }
            }
        }
        return null;
    }

    private static Appliance createObject(String nameOfAppliance, String[] parameters) {
        Map<String, Builder> builderAppliance = new HashMap<>();

        builderAppliance.put("Laptop", new LaptopBuilder());
        builderAppliance.put("Refrigerator", new RefrigeratorBuilder());
        builderAppliance.put("Oven", new OvenBuilder());
        builderAppliance.put("Speakers", new SpeakersBuilder());
        builderAppliance.put("TabletPC", new TabletPCBuilder());
        builderAppliance.put("VacuumCleaner", new VacuumCleanerBuilder());

        if (builderAppliance.containsKey(nameOfAppliance)) {
            return builderAppliance.get(nameOfAppliance).build(parameters);
        } else {
            throw new RuntimeException("it is not possible to create a suitable object, " +
                    "perhaps the name of the object is incorrect ");
        }

    }

}
