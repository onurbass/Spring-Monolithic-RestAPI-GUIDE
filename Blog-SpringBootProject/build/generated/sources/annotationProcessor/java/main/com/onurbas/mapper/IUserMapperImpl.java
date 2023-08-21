package com.onurbas.mapper;

import com.onurbas.dto.request.UserRequestDTO;
import com.onurbas.dto.response.UserResponseDTO;
import com.onurbas.model.User;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-19T21:25:19+0300",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.2.1.jar, environment: Java 20.0.2 (Oracle Corporation)"
)
@Component
public class IUserMapperImpl implements IUserMapper {

    @Override
    public UserResponseDTO userToUserDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserResponseDTO.UserResponseDTOBuilder userResponseDTO = UserResponseDTO.builder();

        userResponseDTO.id( user.getId() );
        userResponseDTO.firstName( user.getFirstName() );
        userResponseDTO.lastName( user.getLastName() );
        userResponseDTO.email( user.getEmail() );
        userResponseDTO.userType( user.getUserType() );

        return userResponseDTO.build();
    }

    @Override
    public List<UserResponseDTO> userListToUserDTOList(List<User> userList) {
        if ( userList == null ) {
            return null;
        }

        List<UserResponseDTO> list = new ArrayList<UserResponseDTO>( userList.size() );
        for ( User user : userList ) {
            list.add( userToUserDto( user ) );
        }

        return list;
    }

    @Override
    public User userDTOToUser(UserResponseDTO userResponseDTO) {
        if ( userResponseDTO == null ) {
            return null;
        }

        User.UserBuilder user = User.builder();

        user.id( userResponseDTO.getId() );
        user.firstName( userResponseDTO.getFirstName() );
        user.lastName( userResponseDTO.getLastName() );
        user.email( userResponseDTO.getEmail() );
        user.userType( userResponseDTO.getUserType() );

        return user.build();
    }

    @Override
    public UserRequestDTO userToUserRequestDTO(User user) {
        if ( user == null ) {
            return null;
        }

        UserRequestDTO.UserRequestDTOBuilder userRequestDTO = UserRequestDTO.builder();

        userRequestDTO.id( user.getId() );
        userRequestDTO.firstName( user.getFirstName() );
        userRequestDTO.lastName( user.getLastName() );
        userRequestDTO.email( user.getEmail() );
        userRequestDTO.password( user.getPassword() );
        userRequestDTO.userType( user.getUserType() );

        return userRequestDTO.build();
    }

    @Override
    public User userRequestDTOToUser(UserRequestDTO userRequestDTO) {
        if ( userRequestDTO == null ) {
            return null;
        }

        User.UserBuilder user = User.builder();

        user.id( userRequestDTO.getId() );
        user.firstName( userRequestDTO.getFirstName() );
        user.lastName( userRequestDTO.getLastName() );
        user.email( userRequestDTO.getEmail() );
        user.password( userRequestDTO.getPassword() );
        user.userType( userRequestDTO.getUserType() );

        return user.build();
    }

    @Override
    public List<User> userDTOListToUserList(List<UserResponseDTO> userResponseDTOListList) {
        if ( userResponseDTOListList == null ) {
            return null;
        }

        List<User> list = new ArrayList<User>( userResponseDTOListList.size() );
        for ( UserResponseDTO userResponseDTO : userResponseDTOListList ) {
            list.add( userDTOToUser( userResponseDTO ) );
        }

        return list;
    }
}
