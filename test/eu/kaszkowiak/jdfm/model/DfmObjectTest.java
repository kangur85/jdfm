/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.kaszkowiak.jdfm.model;

import eu.kaszkowiak.jdfm.mocks.DfmMockStringFactory;
import eu.kaszkowiak.jdfm.parser.DfmParser;
import eu.kaszkowiak.jdfm.parser.ParseException;
import eu.kaszkowiak.jdfm.parser.TokenMgrError;
import junit.framework.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Krzysztof
 */
public class DfmObjectTest {
    
    public DfmObjectTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }


    /**
     *
     * @throws Exception
     */
    @Test
    public void testToStringCorrect() throws Exception {
        String expectedResult = DfmMockStringFactory.getDfmStringCorrect();
        DfmParser parser = new DfmParser(expectedResult);
        DfmObject result = parser.parse();
        Assert.assertEquals(result.toString(), expectedResult);
    }
    
    @Test
    public void testToStringCorrectLongProps() throws Exception {
        String expectedResult = DfmMockStringFactory.getDfmStringCorrectLongProps();
        DfmParser parser = new DfmParser(expectedResult);
        DfmObject result = parser.parse();
        Assert.assertEquals(result.toString(), expectedResult);
    }
    
    /**
     *
     * @throws Exception
     */
    @Test(expected = ParseException.class)
    public void testToStringIncomplete() throws Exception {
        String expectedResult = DfmMockStringFactory.getDfmStringIncomplete();
        DfmParser parser = new DfmParser(expectedResult);
        DfmObject result = parser.parse();
        Assert.assertEquals(result.toString(), expectedResult);
    }
    
    @Test(expected = TokenMgrError.class)
    public void testToStringIncorrectApostrophes() throws Exception {
        String expectedResult = DfmMockStringFactory.getDfmStringIncorrectApostrophes();
        DfmParser parser = new DfmParser(expectedResult);
        DfmObject result = parser.parse();
        Assert.assertEquals(result.toString(), expectedResult);
    }
}