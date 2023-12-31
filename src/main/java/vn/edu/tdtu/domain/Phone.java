package vn.edu.tdtu.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;


@Entity
@Table(name = "MobilePhone")
public class Phone  {
    @Id
    private String id;

    @Column(name = "name", nullable = false)
    @Size(min = 3, max = 128)
    private String name;

    @Column(name = "price", nullable = false)
    private int price;

    @Column(name = "color", nullable = false)
    private String color;

    @Column(name = "country")
    private String country;

    @Column(name = "quantity")
    private int quantity;


    @ManyToOne
    @JoinColumn(name = "manufacture_id", referencedColumnName = "id")
    private Manufacture manufacture;    

    
    public Phone() {};
    public Phone(String id, String name, int price, String color, String country, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.color = color;
        this.country = country;
        this.quantity = quantity;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getPrice() {
        return price;
    }


    public void setPrice(int price) {
        this.price = price;
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public String getCountry() {
        return country;
    }

    

    public void setCountry(String country) {
        this.country = country;
    }

 
    public int getQuantity() {
        return quantity;
    }


    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
	public String toString() {
		return "\n" + "Phone [id=" + id + ", name=" + name + ", price=" + price + ", color=" + color + ", country=" + country
				+ ", quantity=" + quantity + "]" + "\n";
	}
}
