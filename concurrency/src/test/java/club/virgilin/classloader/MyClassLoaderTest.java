package club.virgilin.classloader;

import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;

public class MyClassLoaderTest {

    @Test
    public void test() throws MalformedURLException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        String property = System.getProperty("user.dir");
        URL[] urls;
        urls = new URL[]{ new URL("file:///" + property+   "/target/classes/") };
        MyClassLoader myClassLoader = new MyClassLoader(property+   "/target/classes/");
        Class<?> aClass = myClassLoader.loadClass("java.lang.String");
        Object o = aClass.newInstance();
    }

}