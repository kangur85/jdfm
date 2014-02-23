/*
 * The MIT License
 *
 * Copyright 2014 Krzysztof Kaszkowiak.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package eu.kaszkowiak.jdfm.model;

import com.sun.org.apache.xml.internal.utils.StringComparable;
import eu.kaszkowiak.jdfm.mocks.DfmMockStringFactory;
import eu.kaszkowiak.jdfm.parser.DfmParser;
import eu.kaszkowiak.jdfm.parser.ParseException;
import junit.framework.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class DfmObjectTest {
    
    public DfmObjectTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }

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
    
    @Test(expected = ParseException.class)
    public void testToStringIncomplete() throws Exception {
        String expectedResult = DfmMockStringFactory.getDfmStringIncomplete();
        DfmParser parser = new DfmParser(expectedResult);
        DfmObject result = parser.parse();
        Assert.assertEquals(result.toString(), expectedResult);
    }
    
    @Test(expected = ParseException.class)
    public void testToStringIncorrectApostrophes() throws Exception {
        String expectedResult = DfmMockStringFactory.getDfmStringIncorrectApostrophes();
        DfmParser parser = new DfmParser(expectedResult);
        DfmObject result = parser.parse();
        Assert.assertEquals(result.toString(), expectedResult);
    }
    
    @Test
    public void testToStringCorrectGlyphDataLongFile() throws Exception {
        String expectedResult = DfmMockStringFactory.getComplexDfmWithGlyphAndItems();
        DfmParser parser = new DfmParser(expectedResult);
        DfmObject result = parser.parse();        
        Assert.assertEquals(result.toString(), expectedResult);
    }    
}