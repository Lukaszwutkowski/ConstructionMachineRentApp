package com.projectfinal.finalproject.services;

import com.projectfinal.finalproject.models.User;
import com.projectfinal.finalproject.repositories.RoleRepository;
import com.projectfinal.finalproject.repositories.UserRepository;
import org.junit.Before;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.MockitoAnnotations.initMocks;

class UserServiceTest {

    @Mock
    private UserRepository mockUserRepository;
    @Mock
    private RoleRepository mockRoleRepository;
    @Mock
    private BCryptPasswordEncoder mockBCryptPasswordEncoder;

    private UserService userServiceUnderTest;
    private User.UserBuilder user;

    @Before
    public void setUp() {
        initMocks(this);
        userServiceUnderTest = new UserService(mockUserRepository,
                mockRoleRepository,
                mockBCryptPasswordEncoder);
        user = User.builder()
                .id(1)
                .userName("admin")
                .password("123")
                .active(true);

        Mockito.when(mockUserRepository.save(any()))
                .thenReturn(user);
    }

    @Test
    public void testFindUserByUserName() {
        // Setup
        final String userName = "admin";

        // Run the test
        final User result = userServiceUnderTest.findUserByUserName(userName);

        // Verify the results
        assertEquals(userName, result.getUserName());
    }

    @Test
    public void testSaveUser() {
        // Setup
        final String userName = "admin";

        // Run the test
        User result = userServiceUnderTest.saveUser(User.builder().build());

        // Verify the results
        assertEquals(userName, result.getUserName());
    }

}