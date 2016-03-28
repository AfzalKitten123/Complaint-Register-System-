package com.echo.complaintsystem.ListItem;

/**
 * Created by Afzal_Shama on 27-03-2016.
 */
public class ResidentREntry {
    private String complaint;
    private String resolvedDate;
    private String byName;

    public ResidentREntry(){

    }

    public ResidentREntry(String complaint, String resolvedDate, String byName){
        this.complaint=complaint;
        this.resolvedDate=resolvedDate;
        this.byName=byName;
    }

    public String getComplaint(){
        return  complaint;
    }

    public String getResolvedDate(){
        return resolvedDate;
    }

    public String getByName(){
        return byName;
    }
}
