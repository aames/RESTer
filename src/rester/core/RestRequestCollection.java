package rester.core;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andrew
 */
public class RestRequestCollection {
    @SuppressWarnings("FieldMayBeFinal")
    private List<RestRequest> coll;
    @SuppressWarnings("FieldMayBeFinal")
    private String projectName;

    public RestRequestCollection(String projectName) {
        this.projectName = projectName;
        this.coll = new ArrayList<>();
    }

    /**
     * @return the coll
     */
    public List<RestRequest> getColl() {
        return coll;
    }

    /**
     * @param coll the coll to set
     */
    public void setColl(List<RestRequest> coll) {
        this.coll = coll;
    }

    /**
     * @return the projectName
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * @param projectName the projectName to set
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    
    
}
