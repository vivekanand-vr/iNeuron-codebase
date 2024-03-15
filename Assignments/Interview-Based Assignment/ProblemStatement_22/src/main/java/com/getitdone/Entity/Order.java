package com.getitdone.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
	@Table(name = "orders")
@Getter
@Setter

@NoArgsConstructor
@AllArgsConstructor
	public class Order {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String itemName;

	    @ManyToOne(cascade = {
    CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH		
    },fetch = FetchType.EAGER)
	    @JoinColumn(name = "user_id")
	    private User user;

		@Override
		public String toString() {
			return "Order [id=" + id + ", itemName=" + itemName +  "]";
		}

	   
	}


