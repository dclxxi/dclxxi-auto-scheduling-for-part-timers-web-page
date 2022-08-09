package sketcher.scheduling.repository;

import sketcher.scheduling.domain.ManagerAssignSchedule;

import java.util.List;

public interface ManagerAssignScheduleRepositoryCustom {
    List<ManagerAssignSchedule> findByUserId(String id);

    long monthAssignWorkByUserId(String id);

    long weekAssignByUserId(String id);

    long weekWorkByUserId(String id);

    long weekRemainByUserId(String id);

    long countByTodayAssignManager();
}
