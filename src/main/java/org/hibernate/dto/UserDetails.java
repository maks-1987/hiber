package org.hibernate.dto;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table (name = "USER_DETAILS")
public class UserDetails {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
    private String userName;
    @OneToOne
    @JoinColumn(name="VEHICLE_ID")
    private Vehicle vehicle;
    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    //    @ElementCollection(fetch = FetchType.EAGER)
//    @JoinTable(name="USER_ADDRESS", joinColumns = @JoinColumn(name="USER_ID"))
//    @GenericGenerator(name = "hilo-gen", strategy = "hilo")
//    @CollectionId(columns = {@Column(name = "ADDRESS_AD")}, generator = "hilo-gen", type = @Type(type = "long"))
//    private Collection<Address> listOfAddresses = new ArrayList<Address>();
//    public void setListOfAddresses(Collection<Address> listOfAddresses) {
//        this.listOfAddresses = listOfAddresses;
//    }
//    public Collection<Address> getListOfAddresses() {
//        return listOfAddresses;
//    }
//    public void setListOfAddresses(Set<Address> listOfAddresses) {
//        this.listOfAddresses = listOfAddresses;
//    }
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
