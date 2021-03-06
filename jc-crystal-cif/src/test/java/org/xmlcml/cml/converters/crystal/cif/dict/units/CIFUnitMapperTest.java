package org.xmlcml.cml.converters.crystal.cif.dict.units;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Test;

public class CIFUnitMapperTest {

    @Test
    public void testCIFUnitMapper() {
        CIFUnitMapper mapper = new CIFUnitMapper();
        Assert.assertNotNull(mapper);
    }

    @Test
    public void testCifUnitMapperMap(){
        CIFUnitMapper mapper = new CIFUnitMapper();
        assertEquals(CifUnit.values().length, mapper.cifUnitMap.size());
    }
    
    @Test
    public void testGetCMLIdFor() {
        CIFUnitMapper mapper = new CIFUnitMapper();
        String cml=mapper.getCMLIdFor("A");
        assertNotNull(cml);
        assertEquals("angstrom", cml);
    }

}
