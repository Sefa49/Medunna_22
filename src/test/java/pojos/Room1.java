package pojos;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Room1 {


    /*
    {
        "createdBy": "string",
            "createdDate": "2022-09-03T14:33:26.035Z",
            "description": "string",
            "id": 0,
            "price": 0,
            "roomNumber": 0,
            "roomType": "TWIN",
            "status": true
    }
 */

    private String createdBy;
    private String createdDate;
    private String description;
    private int id;
    private int price;
    private int roomNumber;
    private  String roomType;
    private boolean status;



    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getCdescription() {
        return description;
    }

    public void setCdescription(String cdescription) {
        this.description = cdescription;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


}
