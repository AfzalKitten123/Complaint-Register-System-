package com.echo.complaintsystem.ListItem;

/**
 * Created by Afzal_Shama on 27-03-2016.
 */
public class Individual_Warden {
    private String complaint;
    private String createdDate;
    private String roomNo;

    public Individual_Warden(){

    }

    public Individual_Warden(String complaint,String createdDate,String roomNo){
        this.complaint=complaint;
        this.createdDate=createdDate;
        this.roomNo=roomNo;
    }

    public String getComplaint(){
        return complaint;
    }

    public String getCreatedDate(){
        return createdDate;
    }

    public String getRoomNo(){
        return roomNo;
    }
}
