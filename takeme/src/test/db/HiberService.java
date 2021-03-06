package test.db;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

@Path("/hiber")
public class HiberService {
	@GET
	@Path("/users/{userId}/favorite/{type}")
	@Produces(MediaType.APPLICATION_JSON)
	public List print(@PathParam("userId") String userId, @PathParam("type") String type) {
		return null;
		/*
		Session session = HiberManager.getSessionFactory().openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			List users = session.createQuery("from User").list();
			tx.commit();
			return users;
		} catch (HibernateException e) {
			if (tx != null) tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
		*/
	}
}

class Favorite {
	private String userId;
	private String type;
	
	Favorite(String uid, String type) {
		this.userId = uid;
		this.type = type;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	
}
