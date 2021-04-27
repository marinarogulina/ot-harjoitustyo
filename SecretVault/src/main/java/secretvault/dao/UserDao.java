
package secretvault.dao;

import java.util.ArrayList;
import secretvault.domain.User;


public interface UserDao {
    
    User findUser(String who);
    
    ArrayList<User> getAll();
    
}
