package in.ineuron.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import in.ineuron.model.Customer;
import in.ineuron.util.KafkaConstants;

/**
 * 
 * @author Vicky
 *
 */
@Configuration
public class KafkaProduceConfig {

	/**
	 * This method is used to Kafka Producer Config details
	 * 
	 * @return
	 */

	@Bean
	public ProducerFactory<String, Customer> producerFactory() {

		Map<String, Object> configProps = new HashMap<String, Object>();

		configProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, KafkaConstants.HOST);
		configProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		configProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);

		return new DefaultKafkaProducerFactory<String, Customer>(configProps);
	}

	/**
	 * This method is used to create KafkaTemplate bean obj
	 * 
	 * @return
	 */
	@Bean(name = "kafkaTemplate")
	public KafkaTemplate<String, Customer> kafkaTemplate() {
		return new KafkaTemplate<>(producerFactory());
	}

}
