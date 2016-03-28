package com.echo.complaintsystem.ListItem;

/**
 * Created by Afzal_Shama on 27-03-2016.
 */
public class Individual_CLEntry {
    private String complaint;
    private String createdDate;

    public Individual_CLEntry(){

    }

    public Individual_CLEntry(String complaint, String createdDate){
        this.complaint=complaint;
        this.createdDate=createdDate;
    }

    public String getComplaint(){
        return complaint;
    }

    public String getCreatedDate(){
        return createdDate;
    }
}
