/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdom.all;

import lombok.Data;
import org.jdom.Element;
import org.jdom.Namespace;

/**
 *
 * @author happy
 */
@Data
public class Student implements XMLable {

    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public Element buildElement(Namespace np) {
        Element node = new Element("Student", np);
        node.setNamespace(np);
        //id
        Element nodeId = new Element("id");
        nodeId.addContent("" + this.getId());
        //name
        Element nodeName = new Element("name");
        nodeName.addContent("" + this.getName());
        //age
        Element nodeAge = new Element("age");
        nodeAge.addContent("" + this.getAge());

        node.addContent(nodeId);
        node.addContent(nodeName);
        node.addContent(nodeAge);
        return node;
    }

}
