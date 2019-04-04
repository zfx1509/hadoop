package com.cnorz.hadoop.hdfs;


import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.net.URI;


/**
 * HDFS JAVA API操作
 */
public class HDFSApp {

    public static final String HDFS_PATH = "hdfs://116.62.62.83:8020";
    FileSystem fileSystem = null;
    Configuration configuration = null;

    @Test
    public void mkdir() throws Exception{
        fileSystem.mkdirs(new Path("/hdfsapi/test"));

    }

    @Before
    public void setUp() throws Exception{
        System.out.println("HDFSApp.setUp");
        configuration = new Configuration();
        fileSystem = FileSystem.get(new URI(HDFS_PATH), configuration,"hadoop");
    }

    @After
    public void tearDown() throws Exception{
        configuration = null;
        fileSystem = null;
        System.out.println("HDFSApp.tearDown");

    }

}
