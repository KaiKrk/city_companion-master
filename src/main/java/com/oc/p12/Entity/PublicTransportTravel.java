package com.oc.p12.Entity;

import javax.persistence.*;

@Entity
@Table(name = "public_transport")
public class PublicTransportTravel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "public_transport_id")
    private int id;

    @Column(name = "line")
    private String transportLine;

    @Column(name = "transport_type")
    private TransportType transportType;

    @OneToOne
    @JoinColumn(name = "account_id", referencedColumnName = "account_id")
    private Account account;

    public PublicTransportTravel() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTransportLine() {
        return transportLine;
    }

    public void setTransportLine(String transportLine) {
        this.transportLine = transportLine;
    }



    public TransportType getTransportType() {
        return transportType;
    }

    public void setTransportType(TransportType transportType) {
        this.transportType = transportType;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
