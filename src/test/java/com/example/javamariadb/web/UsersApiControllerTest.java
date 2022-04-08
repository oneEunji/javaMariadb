//package com.example.javamariadb.web;
//import com.example.javamariadb.company.Company;
//import com.example.javamariadb.company.CompanyRepository;
//import com.example.javamariadb.user.Users;
//import com.example.javamariadb.user.UsersRepository;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import java.util.List;
//
//import static org.hamcrest.CoreMatchers.equalTo;
//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.*;
//
//
//@ExtendWith(MockitoExtension.class)
//public class UsersApiControllerTest {
//
//    @Mock
//    UsersRepository usersRepository;
//    @InjectMocks
//    UsersApiController usersController;
//
//    @Test
//    public void saveNewOpen() {
//        // given
//        Long userNoId = 1L;
//        String userName = "userName";
//        String userEmail = "userEmail";
//        String userPassword = "userPassword";
//        String ssaId = "ssaId";
//        String userDept = "userDept";
//        String userPosition = "userPosition";
//        Long companyId = 1L;
//
//        Users users = Users.builder()
//                .userName(userName)
//                .userEmail(userEmail)
//                .userPassword(userPassword)
//                .ssaId(ssaId)
//                .userDept(userDept)
//                .userPosition(userPosition)
//                .companyId(companyId)
//                .build();
//
//        when(usersRepository.save(any())).thenReturn(users); // Mock 객체 주입
//
//        // when
////        Users result = usersController.createUsers(users.builder().companyId(companyId).build());
//        Users result = usersController.createUsers(users);
//        // then
//        verify(usersRepository, times(1)).save(any());
//        assertThat(result, equalTo(users));
//    }
//}
//
