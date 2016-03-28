package com.echo.complaintsystem.ListItem;

/**
 * Created by Afzal_Shama on 27-03-2016.
 */
public class InstituteREntry {
    private String complaint;
    private String resolvedDate;
    private String byName;

    public InstituteREntry(){

    }

    public InstituteREntry(String complaint, String resolvedDate, String byName){
        this.complaint=complaint;
        this.resolvedDate=resolvedDate;
        this.byName=byName;
    }

    public String getComplaint(){
        return  complaint;
    }

    public String getCreatedDate(){
        return resolvedDate;
    }

    public String getByName(){
        return byName;
    }
}
