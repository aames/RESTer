package rester.core;

/**
 *
 * @author Andrew
 */
public class RestRequest {
    public enum RestMethod{
        GET, POST, PUT, DELETE, HEAD
    }
    public enum HttpOrHttps{
        HTTP, HTTPS
    }
    private RestMethod method;
    private HttpOrHttps prefix;
    private String baseUrl;
    private String path;
    private String content;
    private String response;

    public RestRequest(RestMethod method, HttpOrHttps prefix, String baseUrl, 
                        String path, String content) {
        this.method = method;
        this.prefix = prefix;
        this.baseUrl = baseUrl;
        this.path = path;
        this.content = content;
    }
    
    
    /**
     * @return the method
     */
    public RestMethod getMethod() {
        return method;
    }

    /**
     * @param method the method to set
     */
    public void setMethod(RestMethod method) {
        this.method = method;
    }

    /**
     * @return the prefix
     */
    public HttpOrHttps getPrefix() {
        return prefix;
    }

    /**
     * @param prefix the prefix to set
     */
    public void setPrefix(HttpOrHttps prefix) {
        this.prefix = prefix;
    }

    /**
     * @return the baseUrl
     */
    public String getBaseUrl() {
        return baseUrl;
    }

    /**
     * @param baseUrl the baseUrl to set
     */
    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    /**
     * @return the path
     */
    public String getPath() {
        return path;
    }

    /**
     * @param path the path to set
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return the response
     */
    public String getResponse() {
        return response;
    }

    /**
     * @param response the response to set
     */
    public void setResponse(String response) {
        this.response = response;
    }
    
}
