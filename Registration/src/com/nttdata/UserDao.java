package com.nttdata;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.nttdata.User;

	@Repository
	public class UserDao {
	private static List<User> list = null;
		static{
			list = new ArrayList<User>();
			list.add(new User("Mounika", 18, "monicareddy54@gmail.com", "India","mounika667"));
		
		}
		public List<User> getUserList() {
			return list;
		}
		public void addUser(User user) {
			list.add(user);
		}
	}


