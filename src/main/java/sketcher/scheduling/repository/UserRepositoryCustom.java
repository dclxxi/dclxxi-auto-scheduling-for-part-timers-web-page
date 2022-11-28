package sketcher.scheduling.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import sketcher.scheduling.domain.User;
import sketcher.scheduling.dto.UserDto;
import sketcher.scheduling.dto.UserSearchCondition;

import java.util.List;


public interface UserRepositoryCustom {
    Page<UserDto> findAllManager(UserSearchCondition condition, Pageable pageable);

    Page<UserDto> findWorkManager(UserSearchCondition condition, Pageable pageable);

    Page<UserDto> findLeaveManager(UserSearchCondition condition, Pageable pageable);
	List<Integer> findJoinDateByHopeTime(int startTime);
    //    ArrayList<String> findDetailById(String id);
    List<User> withdrawalManagers(UserSearchCondition condition);

    Page<UserDto> findVacationManagers(UserSearchCondition condition, Pageable pageable);

    long countByTodayWorkManager();


}
