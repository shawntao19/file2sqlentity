/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readline;

import java.util.List;

/**
 *
 * @author happy
 */
public class SubClass {

    /**
     * @return the sqlName
     */
    public String getSqlName() {
        return sqlName;
    }

    /**
     * @param sqlName the sqlName to set
     */
    public void setSqlName(String sqlName) {
        this.sqlName = sqlName;
    }

    /**
     * @return the stringList
     */
    public List<String> getStringList() {
        return stringList;
    }

    /**
     * @param stringList the stringList to set
     */
    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    private String sqlName;
    private List<String> stringList;
}
