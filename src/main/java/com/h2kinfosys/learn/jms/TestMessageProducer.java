package com.h2kinfosys.learn.jms;

import javax.jms.Connection;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageProducer;
import javax.jms.Session;

import org.apache.activemq.ActiveMQConnectionFactory;

public class TestMessageProducer {
	
	static String brokerURL = "tcp://localhost:61616";
	
	public static void main(String[] args) throws JMSException {
		Connection conn = null;
		Session session = null;
		try {
			// Step 1 = Create ConnectionFactory
			ActiveMQConnectionFactory acf = new ActiveMQConnectionFactory(brokerURL);
			// Step 2 = createConnection
			conn = acf.createConnection();
			conn.start();
			//Step 3 - Create Session - Auto Commit
			// Session session = conn.createSession(false, Session.AUTO_ACKNOWLEDGE);
			session = conn.createSession(true, Session.SESSION_TRANSACTED);
			//Step 4 - Create Destination
			Destination queue = session.createQueue("TEST.H2K.Q1");
			// Step 5 - Create Message Producer
			MessageProducer producer = session.createProducer(queue);
			// Step 6 - Create Message
			Message message = session.createTextMessage("Test String for Queue 1");
			// Step 7 - send the message
			producer.send(message);
			
			// Step 8 - Session commit
			session.commit();
			System.out.println("Message sent successfully");
			
		}catch (JMSException e) {
			e.printStackTrace();
			session.rollback();
		}finally {
			if(conn != null) conn.close();
			System.out.println("Connection closed");
		}

	}

}
