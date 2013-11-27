/*
    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
    THE SOFTWARE.
 */
package eu.kaszkowiak.jdfm.model;

/**
 *
 * @author Krzysztof
 */
public class DfmProperty {
    private String name;
    private String value;
    
    public DfmProperty(String name, String value) {
        this.name = name;
        this.value = value;
    }
    
    public DfmProperty() {}

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }    

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(String value) {
        if (this.value == null) 
            this.value = value;
        else
            this.value = this.value + value;
    }
    
    @Override
    public String toString() {
        return getName() + " = " + getValue();
    }
}
