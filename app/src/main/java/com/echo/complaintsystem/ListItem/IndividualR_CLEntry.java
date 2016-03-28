package com.echo.complaintsystem.ListItem;

/**
 * Created by Afzal_Shama on 27-03-2016.
 */
public class IndividualR_CLEntry {
    private String complaint;
    private String resolvedDate;

    public IndividualR_CLEntry(){

    }

    public IndividualR_CLEntry(String complaint, String resolvedDate){
        this.complaint=complaint;
        this.resolvedDate=resolvedDate;
    }

    public String getComplaint(){
        return complaint;
    }

    public String getResolvedDate(){
        return resolvedDate;
    }
}
