package sketcher.scheduling.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import sketcher.scheduling.domain.ManagerAssignSchedule;
import sketcher.scheduling.domain.Schedule;
import sketcher.scheduling.domain.ScheduleUpdateReq;
import sketcher.scheduling.domain.User;

import java.time.LocalDateTime;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
public class ManagerAssignScheduleDto {

    @ApiModelProperty(value = "1")
    private Integer id;
    @ApiModelProperty(value = "1")
    private User user;
    @ApiModelProperty(value = "1")
    private LocalDateTime scheduleDateTimeStart;
    @ApiModelProperty(value = "1")
    private LocalDateTime scheduleDateTimeEnd;
    private ScheduleUpdateReq updateReq;
    private LocalDateTime scheduleDateTimeStart;
    private LocalDateTime scheduleDateTimeEnd;


    @Builder
    public ManagerAssignScheduleDto(Integer id, User user, ScheduleUpdateReq updateReq, LocalDateTime scheduleDateTimeStart, LocalDateTime scheduleDateTimeEnd) {
        this.id = id;
        this.user = user;
        this.scheduleDateTimeStart = scheduleDateTimeStart;
        this.scheduleDateTimeEnd = scheduleDateTimeEnd;
        this.updateReq = updateReq;
        this.scheduleDateTimeStart = scheduleDateTimeStart;
        this.scheduleDateTimeEnd = scheduleDateTimeEnd;
    }



    public ManagerAssignSchedule toEntity() {
        return ManagerAssignSchedule.builder()
                .id(id)
                .user(user)
                .scheduleDateTimeStart(scheduleDateTimeStart)
                .scheduleDateTimeEnd(scheduleDateTimeEnd)
                .updateReq(updateReq)
                .scheduleDateTimeStart(scheduleDateTimeStart)
                .scheduleDateTimeEnd(scheduleDateTimeEnd)
                .build();
    }

    public void update(LocalDateTime scheduleDateTimeStart, LocalDateTime scheduleDateTimeEnd){
        this.scheduleDateTimeStart = scheduleDateTimeStart;
        this.scheduleDateTimeEnd = scheduleDateTimeEnd;
    }
}
