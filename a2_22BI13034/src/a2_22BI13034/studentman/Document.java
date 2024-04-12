package a2_22BI13034.studentman;

/**
 * @overview
 *      This represents a document that can be converted to HTML format
 */

interface Document {
    /**
     * @effects
     *      Return a string that can be used to generate an HTML document
     * &lt;html&gt;
     * &lt;head&gt;&lt;title&gt;  title_here  &lt;/title&gt;
     * &lt;body&gt;
     *      body_here
     * &lt;/body&gt;&lt;/html&gt;
     */
    public String toHtmlDoc();
}
