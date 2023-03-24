package laurentiuspilca.managing_users_lesson_01.repositories;

import laurentiuspilca.managing_users_lesson_01.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {

    @Query("""
SELECT u FROM User u WHERE u.username =:username
""")
    Optional<User> findUserByUsername(String username);


}