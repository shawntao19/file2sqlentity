/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdk8.lambda;

import java.io.File;
import java.io.FileFilter;
import java.security.PrivilegedActionException;

/**
 *
 * @author happy
 */
public class rrr {

    public static void main(String[] args) throws PrivilegedActionException {
        FileFilter java = (File f) -> f.getName().endsWith("*.java");
     
    }
}
