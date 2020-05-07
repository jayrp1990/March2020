package com.h2kinfosys.learn.jms;

import javax.jms.Connection;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;


public class TestMessageListener {
	
	static String brokerURL = "tcp://localhost:61616";
	
	public static void main(String[] args) throws JMSException {
		Connection conn = null;
		try {
			// Step 1 = Create ConnectionFactory
			ActiveMQConnectionFactory acf = new ActiveMQConnectionFactory(brokerURL);
			// Step 2 = createConnection
			conn = acf.createConnection();
			conn.start();
			//Step 3 - Create Session - 
			// session = conn.createSession(false, Session.AUTO_ACKNOWLEDGE);
			// final Session session = conn.createSession(true, Session.SESSION_TRANSACTED);
			Session session = conn.createSession(false, Session.CLIENT_ACKNOWLEDGE);
			//Step 4 - Create Destination
			Destination queue = session.createQueue("TEST.H2K.Q1");
			// Step 5 - Create Message Consumer
			MessageConsumer consumer = session.createConsumer(queue);
			
			consumer.setMessageListener(new MessageListener() {
				public void onMessage(Message message) {
					try {
						System.out.println(((TextMessage) message).getText());
						// session.commit(); // Session Transacted
						message.acknowledge();
					} catch (JMSException e) {
						e.printStackTrace();
					}
					
				}
			});
			
			
		}catch (JMSException e) {
			e.printStackTrace();
		}

	}


}
