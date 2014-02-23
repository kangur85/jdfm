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

import eu.kaszkowiak.jdfm.utils.TextUtils;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author Krzysztof Kaszkowiak
 */
public class DfmByteArray {
    
    private final int LINE_LENGTH_IN_BYTES = 32;
    
    private byte[] bytes;
    
    public DfmByteArray() { }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("{\n");

        String hexString = DatatypeConverter.printHexBinary(getBytes());

        int len = hexString.length();
        for (int i = 0; i < len; i += LINE_LENGTH_IN_BYTES*2) {
            result
              .append(TextUtils.indent(hexString.substring(i, Math.min(len, i + LINE_LENGTH_IN_BYTES*2)).toUpperCase(), true));
            
            if (i < hexString.length() - LINE_LENGTH_IN_BYTES*2 - 1) {
                result.append("\n");
            }
            
        }
        result.append("}");
        
        return result.toString();
    }

    public void parseString(String stringValue) {
        setBytes(DatatypeConverter.parseHexBinary(stringValue));
    }

    /**
     * @return the bytes
     */
    public byte[] getBytes() {
        return bytes;
    }

    /**
     * @param bytes the bytes to set
     */
    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }
    
}
