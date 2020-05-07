package com.h2kinfosys.learn.jms;

import javax.jms.Connection;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.Session;

import org.apache.activemq.ActiveMQConnectionFactory;

public class TestMessageConsumer {

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
			Destination queue = session.createQueue("TEST.H2K.Q1");
			// Step 5 - Create Message Consumer
			MessageConsumer consumer = session.createConsumer(queue);
			
			// Step 6 - receive Message
			Message message = consumer.receiveNoWait();
			System.out.println("Message received :: " + message);
		}catch (JMSException e) {
			e.printStackTrace();
		}finally {
			if(conn != null) conn.close();
			System.out.println("Connection closed");
		}

	}


}
