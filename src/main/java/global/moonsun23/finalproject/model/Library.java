package global.moonsun23.finalproject.model;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Entity                     // jpa
@Table(name="library")      // jpa
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor

public class Library {

    //pk(primary key) 자동생성전략설정

    // auto, identity(mariadb), sequence(oracle에서 사용하는 자동키 생성 객체)
    @Id //pk
    @GeneratedValue(strategy = GenerationType.IDENTITY)         // jpa
    private Long lbno;

    @NotBlank(message = "도서관명은 필수입니다!") // validation, 문자열0, 공백 체크해줌

    private String lbname;
    private String sido;
    private String gugun;
    private String lbtype;
    private String clsday;
    private String addr;
    private String phone;
    private String homepage;
    private String lat;
    private String lon;

    @CreatedDate     // jpa, 레코드 생성시 해당값 자동입력
    @Column(insertable = false, updatable = false)  // insert문을 만들 때, update 할때 얘는 빼라고 써주는 것 = 입력,수정 시 해당컬럼 제외하고 sql문 생성
    private LocalDateTime regdate;

}
