package org.dh.hotel.entity.entity;

public class HotelAdministrator {
    private Integer id;

    private String name;

    private String password;

    public HotelAdministrator(Integer id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public HotelAdministrator() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}