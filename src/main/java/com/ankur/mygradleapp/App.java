package com.ankur.mygradleapp;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;

public class App {
    public static void main(String[] args) throws JAXBException {

//        JAXBContext context = JAXBContext.newInstance(Duck.class);
//        Marshaller marshaller= context.createMarshaller();
//        marshaller.marshal(new Duck("donald","white","pond"),new File("duck.xml"));
//        System.out.println("Success");
//
//        Unmarshaller unmarshaller=context.createUnmarshaller();
//        Duck duck= (Duck)unmarshaller.unmarshal(new File("duck.xml"));
//        System.out.print(duck);


        JAXBContext context = JAXBContext.newInstance(DucksType.class);
        Unmarshaller unmarshaller=context.createUnmarshaller();
        DucksType duckList=(DucksType) unmarshaller.unmarshal(new File("duck1.xml"));
        List<DuckType> myducks= duckList.getDuck();
        System.out.println(myducks);
    }
}

