package org.hibernate.dto;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table (name = "USER_DETAILS")
public class UserDetails {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
    private String userName;
    @ElementCollection
    private Set<Address> listOfAddresses = new HashSet();

    public Set<Address> getListOfAddresses() {
        return listOfAddresses;
    }
    public void setListOfAddresses(Set<Address> listOfAddresses) {
        this.listOfAddresses = listOfAddresses;
    }

    //    @Embedded
//    @AttributeOverrides({
//    @AttributeOverride(name = "street", column = @Column(name = "HOME_STREET_NAME")),
//    @AttributeOverride(name = "city", column = @Column(name = "HOME_CITY_NAME")),
//    @AttributeOverride(name = "state", column = @Column(name = "HOME_STATE_NAME")),
//    @AttributeOverride(name = "pincode", column = @Column(name = "HOME_PIN_CODE"))
//    })
//    private Address homeAddress;
//    @Embedded
//    private Address officeAddress;
//    public Address getHomeAddress() {
//        return homeAddress;
//    }
//    public void setHomeAddress(Address homeAddress) {
//        this.homeAddress = homeAddress;
//    }
//    public Address getOfficeAddress() {
//        return officeAddress;
//    }
//    public void setOfficeAddress(Address officeAddress) {
//        this.officeAddress = officeAddress;
//    }
    //    public Address getAddress() {
//        return address;
//    }
//    public void setAddress(Address address) {
//        this.address = address;
//    }
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
