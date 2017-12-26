package com.ankur.mygradleapp;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;

public class App {
    public static void main(String[] args) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(DucksType.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        DucksType ducks = (DucksType) unmarshaller.unmarshal(new File("ducks.xml"));
        List<DuckType> listOfDucks = ducks.getDuck();
        listOfDucks.forEach(duckType ->
                System.out.println(duckType.getName() + " " + duckType.getColor() + " " + duckType.getHome()));
    }
}

