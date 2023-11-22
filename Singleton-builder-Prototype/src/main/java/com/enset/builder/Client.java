package com.enset.builder;

public class Client {
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private String address;

    public Client(Long id, String firstname, String lastname, String email, String address) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public Client() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public static ClientBuilder clientBuilder(){
        return new ClientBuilder();
    }
    public static  class ClientBuilder{
        private  Client client;
        public ClientBuilder(){
            client=new Client();
        }
        public  ClientBuilder id(Long id){
            client.setId(id);
            return this;
        }
        public  ClientBuilder firstname(String firstname){
            client.setFirstname(firstname);
            return this;
        }
        public  ClientBuilder lastname(String lastname){
            client.setLastname(lastname);
            return this;
        }
        public  ClientBuilder email(String email){
            client.setEmail(email);
            return this;
        }
        public  ClientBuilder address(String address){
            client.setAddress(address);
            return this;
        }
        public Client build(){
            return client;
        }
    }
}
