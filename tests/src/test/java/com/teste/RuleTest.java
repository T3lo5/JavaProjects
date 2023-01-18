package com.teste;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class RuleTest {

    @Rule
    public TemporaryFolder tmpFolder = new TemporaryFolder();

    @Test
    public void testUsingTempFolder() throws Exception {
        System.out.println("Folder: " + tmpFolder.newFile("file.txt").getAbsolutePath());
    }

}
