package com.echo.complaintsystem.ListItem;

/**
 * Created by Afzal_Shama on 27-03-2016.
 */
public class ResidentEntry {
    private String complaint;
    private String createdDate;
    private String byName;

    public ResidentEntry(){

    }

    public ResidentEntry(String complaint, String createdDate, String byName){
        this.complaint=complaint;
        this.createdDate=createdDate;
        this.byName=byName;
    }

    public String getComplaint(){
        return  complaint;
    }

    public String getCreatedDate(){
        return createdDate;
    }

    public String getByName(){
        return byName;
    }

}
