package com.h2kinfosys.learn.jms;

import javax.jms.Connection;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageProducer;
import javax.jms.Session;

import org.apache.activemq.ActiveMQConnectionFactory;

public class TopicPublisher {
	
	static String brokerURL = "tcp://localhost:61616";
	
	public static void main(String[] args) throws JMSException {
		Connection conn = null;
		try {
			// Step 1 = Create ConnectionFactory
			ActiveMQConnectionFactory acf = new ActiveMQConnectionFactory(brokerURL);
			// Step 2 = createConnection
			conn = acf.createConnection();
			conn.start();
			//Step 3 - Create Session - Auto Commit
			Session session = conn.createSession(false, Session.AUTO_ACKNOWLEDGE);
			//Step 4 - Create Destination
			Destination topic = session.createTopic("TEST.H2K.TOPIC1");
			// Step 5 - Create Message Producer
			MessageProducer producer = session.createProducer(topic);
			// Step 6 - Create Message
			Message message = null;
			// Step 7 - send the message
			for(int i = 0; i < 10;i++) {
				message = session.createTextMessage("Test String for Topic " + i );
				producer.send(message);
			}
				
			
			
			System.out.println("Message sent successfully to Topic");
			
		}catch (JMSException e) {
			e.printStackTrace();
		}finally {
			if(conn != null) conn.close();
			System.out.println("Connection closed");
		}

	}

}
