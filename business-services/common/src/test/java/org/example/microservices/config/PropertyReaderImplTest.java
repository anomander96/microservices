package org.example.microservices.config;

import org.junit.Assert;
import org.junit.Test;

public class PropertyReaderImplTest {

    @Test(expected = RuntimeException.class)
    public void testLoadConfigFail() {
        new PropertyReaderImpl("unrealfile");
    }

    @Test
    public void testReadString() {
        PropertyReaderImpl propertyReader = new PropertyReaderImpl("archaius-test");
        Assert.assertEquals("this is test string", propertyReader.getStringProperty("test-string"));
        Assert.assertEquals(PropertyReaderImpl.UNDEFINED_STRING_PROPERTY, propertyReader.getStringProperty("undefined"));
        Assert.assertEquals(PropertyReaderImpl.UNDEFINED_STRING_PROPERTY, propertyReader.getStringProperty(""));
        Assert.assertEquals(PropertyReaderImpl.UNDEFINED_STRING_PROPERTY, propertyReader.getStringProperty(null));
    }

    @Test
    public void testReadInt() {
        PropertyReaderImpl propertyReader = new PropertyReaderImpl("archaius-test");
        Assert.assertEquals(1, propertyReader.getIntProperty("test-int"));
        Assert.assertEquals(PropertyReaderImpl.UNDEFINED_INT_PROPERTY, propertyReader.getIntProperty("notexists"));
        Assert.assertEquals(PropertyReaderImpl.UNDEFINED_INT_PROPERTY, propertyReader.getIntProperty(""));
        Assert.assertEquals(PropertyReaderImpl.UNDEFINED_INT_PROPERTY, propertyReader.getIntProperty(null));
    }
}
