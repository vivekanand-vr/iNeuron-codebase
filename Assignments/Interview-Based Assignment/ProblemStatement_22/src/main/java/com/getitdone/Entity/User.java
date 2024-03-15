package com.getitdone.Entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "users")
@Getter
@Setter

@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @OneToMany(mappedBy ="user",cascade = {
    CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH		
    })
    private List<Order> orders;

    // Getters and setters
    public void add(Order or) {
    	if(orders==null) {
    		orders=new ArrayList<>();
    	}
    	orders.add(or);
    	or.setUser(this);
    }

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", orders=" + orders + "]";
	}
    
}
