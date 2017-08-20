package org.hibernate.dto;

import javax.persistence.*;

@Entity
@Table (name = "USER_DETAILS")
public class UserDetails {
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    private int userId;
    private String userName;
    @Embedded
    private Address address;

    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    //    @Temporal(TemporalType.DATE)
//    private Date joinedDate;
//    private String Address;
//    @Lob
//    private String description;
//
//    public Date getJoinedDate() {
//        return joinedDate;
//    }
//    public void setJoinedDate(Date joinedDate) {
//        this.joinedDate = joinedDate;
//    }
//    public String getAddress() {
//        return Address;
//    }
//    public void setAddress(String address) {
//        Address = address;
//    }
//    public String getDescription() {
//        return description;
//    }
//    public void setDescription(String description) {
//        this.description = description;
//    }
//    @Id
//    @Column (name = "USER_ID")
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
//    @Column (name = "USER_NAME")

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
}
