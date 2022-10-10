package com.RuralBeefReport.Alberta.repositories;

import com.RuralBeefReport.Alberta.models.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository underTest;


    @Test
    public void testUserAuthorityDeletion(){
        //GIVEN
        String EXPECTED_USERNAME = "BOB";
        User user = new User(EXPECTED_USERNAME,"bob@bobmail.com","12345678");

        //WHEN
        this.underTest.save(user);
        User foundUser = this.underTest.findUserByUsername(EXPECTED_USERNAME).get();


        //THEN
        assertThat(foundUser.getUsername()).isEqualTo(EXPECTED_USERNAME);


    }

}
