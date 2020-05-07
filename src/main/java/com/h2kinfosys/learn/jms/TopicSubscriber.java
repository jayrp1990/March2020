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

public class TopicSubscriber {
	
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
			// Step 5 - Create Message Consumer
			MessageConsumer consumer = session.createConsumer(topic);
			
			consumer.setMessageListener(new MessageListener() {
				public void onMessage(Message message) {
					try {
						System.out.println(((TextMessage) message).getText());
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
