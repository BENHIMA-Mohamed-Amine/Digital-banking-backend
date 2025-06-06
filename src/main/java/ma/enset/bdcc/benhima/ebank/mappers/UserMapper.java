package ma.enset.bdcc.benhima.ebank.mappers;

import lombok.AllArgsConstructor;
import ma.enset.bdcc.benhima.ebank.dtos.UserDto;
import ma.enset.bdcc.benhima.ebank.entities.User;
import ma.enset.bdcc.benhima.ebank.repositories.UserRepository;
import org.springframework.beans.BeanUtils;

import java.util.List;


@AllArgsConstructor
public class UserMapper {

    private final UserRepository userRepository;

    public UserDto entityToDto(User user) {
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(user,userDto);
        return userDto;
    }

    public User dtoToEntity(UserDto userDto) {
        User user = new User();
        BeanUtils.copyProperties(userDto,user);
        return user;
    }

    public List<UserDto> usersToDtos(List<User> users) {
        return users.stream().map(this::entityToDto).toList();
    }

    public List<User> dtosToUsers(List<UserDto> usersDto) {
        return usersDto.stream().map(this::dtoToEntity).toList();
    }

}
