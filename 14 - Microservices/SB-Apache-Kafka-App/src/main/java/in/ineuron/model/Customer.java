package in.ineuron.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This class holds Model data
 * 
 * @author Vicky 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

	private Integer customerId;
	private String customerName;
	private String customerEmail;

}
